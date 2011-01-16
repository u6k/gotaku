
package jp.gr.java_conf.u6k.gotaku;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import jp.gr.java_conf.u6k.gotaku.gotaku.IGotakuGenreInfo;
import jp.gr.java_conf.u6k.gotaku.gotaku.IGotakuQuestionInfo;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class SinglePlayActivity extends Activity {

    private IGotakuGenreInfo _genre;

    private TextView _questionTextView;

    private ProgressBar _answerTimeProgressBar;

    private TextView _answerTimeTextView;

    private Button _answer1Button;

    private Button _answer2Button;

    private Button _answer3Button;

    private Button _answer4Button;

    private Button _answer5Button;

    private int _selectedAnswer;

    private boolean _isClickedQuestion;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // レイアウトを設定して、ビューを取得します。
        super.onCreate(savedInstanceState);

        this.setContentView(R.layout.single_play);

        this._questionTextView = (TextView) this.findViewById(R.id.QuestionTextView);
        this._answerTimeProgressBar = (ProgressBar) this.findViewById(R.id.AnswerTimeProgressBar);
        this._answerTimeTextView = (TextView) this.findViewById(R.id.AnswerTimeTextView);
        this._answer1Button = (Button) this.findViewById(R.id.Answer1Button);
        this._answer2Button = (Button) this.findViewById(R.id.Answer2Button);
        this._answer3Button = (Button) this.findViewById(R.id.Answer3Button);
        this._answer4Button = (Button) this.findViewById(R.id.Answer4Button);
        this._answer5Button = (Button) this.findViewById(R.id.Answer5Button);

        // インテントからデータを取得します。
        Intent intent = this.getIntent();
        this._genre = (IGotakuGenreInfo) intent.getExtras().get("genre");

        // ビューを設定します。
        this._questionTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                SinglePlayActivity.this._isClickedQuestion = true;
            }

        });
        this._answer1Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                SinglePlayActivity.this._selectedAnswer = 0;
            }

        });
        this._answer2Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                SinglePlayActivity.this._selectedAnswer = 1;
            }

        });
        this._answer3Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                SinglePlayActivity.this._selectedAnswer = 2;
            }

        });
        this._answer4Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                SinglePlayActivity.this._selectedAnswer = 3;
            }

        });
        this._answer5Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                SinglePlayActivity.this._selectedAnswer = 4;
            }

        });

        // ゲーム・スレッドを開始します。
        Thread t = new Thread(new GameRunnable(new Handler()));
        t.start();
    }

    private class GameRunnable implements Runnable {

        private boolean _isRunning;

        private Object _lock = new Object();

        private Handler _handler;

        private int _time;

        private int _questionNumber;

        private int _correctNumber;

        private int _incorrectNumber;

        private boolean _isCorrect;

        public GameRunnable(Handler handler) {
            this._handler = handler;
        }

        @Override
        public void run() {
            try {
                Log.d("gotaku", "GameRunnable.run start");

                // 表示初期化
                this._handler.post(new Runnable() {

                    @Override
                    public void run() {
                        SinglePlayActivity.this._questionTextView.setText("");
                        SinglePlayActivity.this._answerTimeProgressBar.setProgress(100);
                        SinglePlayActivity.this._answerTimeTextView.setText("");
                        SinglePlayActivity.this._answer1Button.setEnabled(false);
                        SinglePlayActivity.this._answer1Button.setText("");
                        SinglePlayActivity.this._answer2Button.setEnabled(false);
                        SinglePlayActivity.this._answer2Button.setText("");
                        SinglePlayActivity.this._answer3Button.setEnabled(false);
                        SinglePlayActivity.this._answer3Button.setText("");
                        SinglePlayActivity.this._answer4Button.setEnabled(false);
                        SinglePlayActivity.this._answer4Button.setText("");
                        SinglePlayActivity.this._answer5Button.setEnabled(false);
                        SinglePlayActivity.this._answer5Button.setText("");
                    }

                });

                // 出題開始
                Random r = new Random();

                this._isRunning = true;

                this._handler.post(new Runnable() {

                    @Override
                    public void run() {
                        AlertDialog.Builder adb = new AlertDialog.Builder(SinglePlayActivity.this);
                        adb.setMessage("ジャンル: " + SinglePlayActivity.this._genre.getName() + "の問題を始めます。");
                        adb.setPositiveButton("開始", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialoginterface, int i) {
                                synchronized (GameRunnable.this._lock) {
                                    GameRunnable.this._isRunning = false;
                                    GameRunnable.this._lock.notifyAll();
                                }
                            }

                        });
                        adb.setCancelable(false);
                        adb.create().show();
                    }

                });

                synchronized (this._lock) {
                    while (this._isRunning) {
                        this._lock.wait();
                    }
                }

                // 出題を並び替えます。
                List<Integer> questionNumberList = new ArrayList<Integer>();

                for (int i = 0; i < SinglePlayActivity.this._genre.getQuestionList().size(); i++) {
                    questionNumberList.add(i);
                }

                Collections.shuffle(questionNumberList, r);

                // 10問、繰り返します。
                for (this._questionNumber = 0; this._questionNumber < 10; this._questionNumber++) {
                    // 問題表示
                    final IGotakuQuestionInfo question = SinglePlayActivity.this._genre.getQuestionList().get(questionNumberList.get(this._questionNumber));

                    SinglePlayActivity.this._isClickedQuestion = false;

                    for (int i = 0; i < question.getQuestion().length(); i++) {
                        final int end = i;

                        this._handler.post(new Runnable() {

                            @Override
                            public void run() {
                                SinglePlayActivity.this._questionTextView.setText(question.getQuestion().substring(0, end));
                            }

                        });

                        if (SinglePlayActivity.this._isClickedQuestion) {
                            break;
                        }

                        Thread.sleep(100);
                    }

                    this._handler.post(new Runnable() {

                        @Override
                        public void run() {
                            SinglePlayActivity.this._questionTextView.setText(question.getQuestion());
                        }

                    });

                    // 選択肢を並び替えます。
                    final List<Integer> answerNumberList = new ArrayList<Integer>();

                    for (int i = 0; i < 5; i++) {
                        answerNumberList.add(i);
                    }

                    Collections.shuffle(answerNumberList, r);

                    // 選択肢表示
                    SinglePlayActivity.this._selectedAnswer = -1;

                    this._handler.post(new Runnable() {

                        @Override
                        public void run() {
                            SinglePlayActivity.this._answer1Button.setText(question.getAnswerList().get(answerNumberList.get(0)));
                            SinglePlayActivity.this._answer1Button.setEnabled(true);
                            SinglePlayActivity.this._answer2Button.setText(question.getAnswerList().get(answerNumberList.get(1)));
                            SinglePlayActivity.this._answer2Button.setEnabled(true);
                            SinglePlayActivity.this._answer3Button.setText(question.getAnswerList().get(answerNumberList.get(2)));
                            SinglePlayActivity.this._answer3Button.setEnabled(true);
                            SinglePlayActivity.this._answer4Button.setText(question.getAnswerList().get(answerNumberList.get(3)));
                            SinglePlayActivity.this._answer4Button.setEnabled(true);
                            SinglePlayActivity.this._answer5Button.setText(question.getAnswerList().get(answerNumberList.get(4)));
                            SinglePlayActivity.this._answer5Button.setEnabled(true);
                        }

                    });

                    // カウント・ダウン
                    final DecimalFormat df = new DecimalFormat("#0.0");

                    for (this._time = 100; this._time >= 0; this._time--) {
                        if (SinglePlayActivity.this._selectedAnswer != -1) {
                            break;
                        }

                        this._handler.post(new Runnable() {

                            @Override
                            public void run() {
                                SinglePlayActivity.this._answerTimeProgressBar.setProgress(GameRunnable.this._time);
                                SinglePlayActivity.this._answerTimeTextView.setText("Time: " + df.format(GameRunnable.this._time / 10.0d));
                            }

                        });

                        Thread.sleep(100);
                    }

                    // 結果表示
                    if (SinglePlayActivity.this._selectedAnswer != -1) {
                        if (answerNumberList.get(SinglePlayActivity.this._selectedAnswer) == 0) {
                            this._isCorrect = true;
                        } else {
                            this._isCorrect = false;
                        }
                    } else {
                        this._isCorrect = false;
                    }

                    if (this._isCorrect) {
                        this._correctNumber++;
                    } else {
                        this._incorrectNumber++;
                    }

                    this._handler.post(new Runnable() {

                        @Override
                        public void run() {
                            SinglePlayActivity.this._answer1Button.setEnabled(false);
                            SinglePlayActivity.this._answer2Button.setEnabled(false);
                            SinglePlayActivity.this._answer3Button.setEnabled(false);
                            SinglePlayActivity.this._answer4Button.setEnabled(false);
                            SinglePlayActivity.this._answer5Button.setEnabled(false);

                            AlertDialog.Builder adb = new AlertDialog.Builder(SinglePlayActivity.this);
                            adb.setMessage((GameRunnable.this._questionNumber + 1) + "問目 " + (GameRunnable.this._isCorrect ? "正解" : "不正解") + "\n正解数: " + GameRunnable.this._correctNumber + "\n不正解数: " + GameRunnable.this._incorrectNumber);
                            adb.setPositiveButton("OK", new DialogInterface.OnClickListener() {

                                @Override
                                public void onClick(DialogInterface dialoginterface, int i) {
                                    synchronized (GameRunnable.this._lock) {
                                        GameRunnable.this._lock.notifyAll();
                                    }
                                }

                            });
                            adb.setCancelable(false);
                            AlertDialog ad = adb.create();
                            ad.show();
                        }

                    });

                    synchronized (this._lock) {
                        this._lock.wait();
                    }
                }

                // 結果画面に遷移します。
                Intent intent = new Intent(SinglePlayActivity.this, ResultActivity.class);
                intent.putExtra("correct", this._correctNumber);
                intent.putExtra("incorrect", this._incorrectNumber);
                SinglePlayActivity.this.startActivity(intent);

                SinglePlayActivity.this.finish();

                Log.d("gotaku", "GameRunnable.run end");
            } catch (Exception e) {
                Log.e("gotaku", "GameRunnable.run", e);

                Toast.makeText(SinglePlayActivity.this, e.getClass().getName() + ": " + e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

    }

}

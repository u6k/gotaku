
package jp.gr.java_conf.u6k.gotaku;

import java.text.DecimalFormat;

import jp.gr.java_conf.u6k.gotaku.gotaku.GotakuFileBuilder;
import jp.gr.java_conf.u6k.gotaku.gotaku.IGotakuGenreInfo;
import jp.gr.java_conf.u6k.gotaku.gotaku.IGotakuInfo;
import jp.gr.java_conf.u6k.gotaku.gotaku.IGotakuQuestionInfo;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SinglePlayActivity extends Activity {

    private TextView _questionTextView;

    private ProgressBar _answerTimeProgressBar;

    private TextView _answerTimeTextView;

    private Button _answer1Button;

    private Button _answer2Button;

    private Button _answer3Button;

    private Button _answer4Button;

    private Button _answer5Button;

    private int _time;

    private int _selectedAnswer;

    private boolean _isClickedQuestion;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d("gotaku", "onCreate");

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

        Thread t = new Thread(new GameThread(new Handler()));
        t.start();
    }

    @Override
    protected void onDestroy() {
        Log.d("gotaku", "onDestroy");

        super.onDestroy();
    }

    @Override
    public void onLowMemory() {
        Log.d("gotaku", "onLowMemory");

        super.onLowMemory();
    }

    @Override
    protected void onPause() {
        Log.d("gotaku", "onPause");

        super.onPause();
    }

    @Override
    protected void onRestart() {
        Log.d("gotaku", "onRestart");

        super.onRestart();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.d("gotaku", "onRestoreInstanceState");

        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onResume() {
        Log.d("gotaku", "onResume");

        super.onResume();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d("gotaku", "onSaveInstanceState");

        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onStart() {
        Log.d("gotaku", "onStart");

        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.d("gotaku", "onStop");

        super.onStop();
    }

    private class GameThread implements Runnable {

        private Object _lock = new Object();

        private Handler _h;

        public GameThread(Handler h) {
            this._h = h;
        }

        @Override
        public void run() {
            try {
                Log.d("gotaku", "ゲーム・スレッド開始");

                // 表示初期化
                this._h.post(new Runnable() {

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

                // 変数初期化
                GotakuFileBuilder gb = new GotakuFileBuilder();
                IGotakuInfo g = gb.build(null);
                final IGotakuGenreInfo genre = g.getGenreList().get(0);
                final IGotakuQuestionInfo q = genre.getQuestionList().get(0);

                SinglePlayActivity.this._time = 100;
                SinglePlayActivity.this._selectedAnswer = -1;

                // 出題開始
                this._h.post(new Runnable() {

                    @Override
                    public void run() {
                        AlertDialog.Builder adb = new AlertDialog.Builder(SinglePlayActivity.this);
                        adb.setTitle("問題開始");
                        adb.setMessage("出題します。");
                        adb.setPositiveButton("開始", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialoginterface, int i) {
                                synchronized (GameThread.this._lock) {
                                    GameThread.this._lock.notifyAll();
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

                // 問題表示
                SinglePlayActivity.this._isClickedQuestion = false;

                for (int i = 0; i < q.getQuestion().length(); i++) {
                    final int end = i;

                    this._h.post(new Runnable() {

                        @Override
                        public void run() {
                            SinglePlayActivity.this._questionTextView.setText(q.getQuestion().substring(0, end));
                        }

                    });

                    if (SinglePlayActivity.this._isClickedQuestion) {
                        break;
                    }

                    Thread.sleep(100);
                }

                this._h.post(new Runnable() {

                    @Override
                    public void run() {
                        SinglePlayActivity.this._questionTextView.setText(q.getQuestion());
                    }

                });

                // 選択肢表示
                SinglePlayActivity.this._selectedAnswer = -1;

                this._h.post(new Runnable() {

                    @Override
                    public void run() {
                        SinglePlayActivity.this._answer1Button.setText(q.getAnswerList().get(0));
                        SinglePlayActivity.this._answer1Button.setEnabled(true);
                        SinglePlayActivity.this._answer2Button.setText(q.getAnswerList().get(1));
                        SinglePlayActivity.this._answer2Button.setEnabled(true);
                        SinglePlayActivity.this._answer3Button.setText(q.getAnswerList().get(2));
                        SinglePlayActivity.this._answer3Button.setEnabled(true);
                        SinglePlayActivity.this._answer4Button.setText(q.getAnswerList().get(3));
                        SinglePlayActivity.this._answer4Button.setEnabled(true);
                        SinglePlayActivity.this._answer5Button.setText(q.getAnswerList().get(4));
                        SinglePlayActivity.this._answer5Button.setEnabled(true);
                    }

                });

                // カウント・ダウン
                final DecimalFormat df = new DecimalFormat("#0.0");

                for (SinglePlayActivity.this._time = 100; SinglePlayActivity.this._time >= 0; SinglePlayActivity.this._time--) {
                    if (SinglePlayActivity.this._selectedAnswer != -1) {
                        break;
                    }

                    this._h.post(new Runnable() {

                        @Override
                        public void run() {
                            SinglePlayActivity.this._answerTimeProgressBar.setProgress(SinglePlayActivity.this._time);
                            SinglePlayActivity.this._answerTimeTextView.setText("Time: " + df.format(SinglePlayActivity.this._time / 10.0d));
                        }

                    });

                    Thread.sleep(100);
                }

                // 結果表示
                this._h.post(new Runnable() {

                    @Override
                    public void run() {
                        SinglePlayActivity.this._answer1Button.setEnabled(false);
                        SinglePlayActivity.this._answer2Button.setEnabled(false);
                        SinglePlayActivity.this._answer3Button.setEnabled(false);
                        SinglePlayActivity.this._answer4Button.setEnabled(false);
                        SinglePlayActivity.this._answer5Button.setEnabled(false);

                        AlertDialog.Builder adb = new AlertDialog.Builder(SinglePlayActivity.this);
                        adb.setTitle("結果表示");
                        adb.setMessage("選択: " + SinglePlayActivity.this._selectedAnswer + "\n" + "Time: " + SinglePlayActivity.this._time);
                        adb.setPositiveButton("OK", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialoginterface, int i) {
                                synchronized (GameThread.this._lock) {
                                    GameThread.this._lock.notifyAll();
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
            } catch (Exception e) {
                Log.e("gotaku", "ゲーム・スレッドの致命的エラー", e);
            } finally {
                Log.d("gotaku", "ゲーム・スレッド終了");
            }
        }

    }

}

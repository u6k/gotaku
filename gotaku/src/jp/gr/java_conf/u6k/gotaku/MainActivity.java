
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
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends Activity {

    private LinearLayout _layout;

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

        this.setContentView(R.layout.main);

        this._layout = (LinearLayout) this.findViewById(R.id.Layout);
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
                MainActivity.this._isClickedQuestion = true;
            }

        });
        this._answer1Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                MainActivity.this._selectedAnswer = 0;
            }

        });
        this._answer2Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                MainActivity.this._selectedAnswer = 1;
            }

        });
        this._answer3Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                MainActivity.this._selectedAnswer = 2;
            }

        });
        this._answer4Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                MainActivity.this._selectedAnswer = 3;
            }

        });
        this._answer5Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                MainActivity.this._selectedAnswer = 4;
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
                        MainActivity.this._questionTextView.setText("");
                        MainActivity.this._answerTimeProgressBar.setProgress(100);
                        MainActivity.this._answerTimeTextView.setText("");
                        MainActivity.this._answer1Button.setEnabled(false);
                        MainActivity.this._answer1Button.setText("");
                        MainActivity.this._answer2Button.setEnabled(false);
                        MainActivity.this._answer2Button.setText("");
                        MainActivity.this._answer3Button.setEnabled(false);
                        MainActivity.this._answer3Button.setText("");
                        MainActivity.this._answer4Button.setEnabled(false);
                        MainActivity.this._answer4Button.setText("");
                        MainActivity.this._answer5Button.setEnabled(false);
                        MainActivity.this._answer5Button.setText("");
                    }

                });

                // 変数初期化
                GotakuFileBuilder gb = new GotakuFileBuilder();
                IGotakuInfo g = gb.build(null);
                final IGotakuGenreInfo genre = g.getGenreList().get(0);
                final IGotakuQuestionInfo q = genre.getQuestionList().get(0);

                MainActivity.this._time = 100;
                MainActivity.this._selectedAnswer = -1;

                // 出題開始
                this._h.post(new Runnable() {

                    @Override
                    public void run() {
                        AlertDialog.Builder adb = new AlertDialog.Builder(MainActivity.this);
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
                MainActivity.this._isClickedQuestion = false;

                for (int i = 0; i < q.getQuestion().length(); i++) {
                    final int end = i;

                    this._h.post(new Runnable() {

                        @Override
                        public void run() {
                            MainActivity.this._questionTextView.setText(q.getQuestion().substring(0, end));
                        }

                    });

                    if (MainActivity.this._isClickedQuestion) {
                        break;
                    }

                    Thread.sleep(100);
                }

                this._h.post(new Runnable() {

                    @Override
                    public void run() {
                        MainActivity.this._questionTextView.setText(q.getQuestion());
                    }

                });

                // 選択肢表示
                MainActivity.this._selectedAnswer = -1;

                this._h.post(new Runnable() {

                    @Override
                    public void run() {
                        MainActivity.this._answer1Button.setText(q.getAnswerList().get(0));
                        MainActivity.this._answer1Button.setEnabled(true);
                        MainActivity.this._answer2Button.setText(q.getAnswerList().get(1));
                        MainActivity.this._answer2Button.setEnabled(true);
                        MainActivity.this._answer3Button.setText(q.getAnswerList().get(2));
                        MainActivity.this._answer3Button.setEnabled(true);
                        MainActivity.this._answer4Button.setText(q.getAnswerList().get(3));
                        MainActivity.this._answer4Button.setEnabled(true);
                        MainActivity.this._answer5Button.setText(q.getAnswerList().get(4));
                        MainActivity.this._answer5Button.setEnabled(true);
                    }

                });

                // カウント・ダウン
                final DecimalFormat df = new DecimalFormat("#0.0");

                for (MainActivity.this._time = 100; MainActivity.this._time >= 0; MainActivity.this._time--) {
                    if (MainActivity.this._selectedAnswer != -1) {
                        break;
                    }

                    this._h.post(new Runnable() {

                        @Override
                        public void run() {
                            MainActivity.this._answerTimeProgressBar.setProgress(MainActivity.this._time);
                            MainActivity.this._answerTimeTextView.setText("Time: " + df.format(MainActivity.this._time / 10.0d));
                        }

                    });

                    Thread.sleep(100);
                }

                // 結果表示
                this._h.post(new Runnable() {

                    @Override
                    public void run() {
                        MainActivity.this._answer1Button.setEnabled(false);
                        MainActivity.this._answer2Button.setEnabled(false);
                        MainActivity.this._answer3Button.setEnabled(false);
                        MainActivity.this._answer4Button.setEnabled(false);
                        MainActivity.this._answer5Button.setEnabled(false);

                        AlertDialog.Builder adb = new AlertDialog.Builder(MainActivity.this);
                        adb.setTitle("結果表示");
                        adb.setMessage("選択: " + MainActivity.this._selectedAnswer + "\n" + "Time: " + MainActivity.this._time);
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

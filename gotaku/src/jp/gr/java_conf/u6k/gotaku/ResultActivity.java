
package jp.gr.java_conf.u6k.gotaku;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // レイアウトの設定、ビューを取得します。
        super.onCreate(savedInstanceState);

        this.setContentView(R.layout.result);

        TextView correctNumberTextView = (TextView) this.findViewById(R.id.CorrectNumberTextView);
        TextView incorrectNumberTextView = (TextView) this.findViewById(R.id.IncorrectNumberTextView);
        Button backTitleButton = (Button) this.findViewById(R.id.BackTitleButton);

        // インテントからデータを取得します。
        Bundle extras = this.getIntent().getExtras();
        int correctNumber = extras.getInt("correct");
        int incorrectNumber = extras.getInt("incorrect");

        // ビューを設定します。
        correctNumberTextView.setText("正解数: " + correctNumber);

        incorrectNumberTextView.setText("不正解数: " + incorrectNumber);

        backTitleButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                ResultActivity.this.finish();
            }

        });
    }

}

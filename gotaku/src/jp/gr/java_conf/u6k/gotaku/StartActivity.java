
package jp.gr.java_conf.u6k.gotaku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class StartActivity extends Activity {

    private Button _singlePlayButton;

    private Button _helpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.setContentView(R.layout.start);

        this._singlePlayButton = (Button) this.findViewById(R.id.SinglePlayButton);
        this._helpButton = (Button) this.findViewById(R.id.HelpButton);

        this._singlePlayButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartActivity.this, SinglePlayActivity.class);
                StartActivity.this.startActivity(intent);
            }

        });

        this._helpButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(StartActivity.this, "未実装です。", Toast.LENGTH_SHORT).show();
            }

        });
    }

}

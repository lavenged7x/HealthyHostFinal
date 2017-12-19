package edu.ucmerced.engineeringservicelearning.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 12/11/2017.
 */

public class hmong_settings extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hmong_settings);

        Button hmong_languages = findViewById(R.id.hmong_languages);
        hmong_languages.setOnClickListener(this);

        Button hmong_resources = findViewById(R.id.hmong_resources);
        hmong_resources.setOnClickListener(this);

        Button hmong_background = findViewById(R.id.hmong_background);
        hmong_background.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.hmong_languages:
                Intent intent11 = new Intent(hmong_settings.this, hmong_languages.class);
                startActivity(intent11);
                break;

            case R.id.hmong_resources:
                Intent intent12 = new Intent(hmong_settings.this, hmong_resources.class);
                startActivity(intent12);
                break;

            case R.id.hmong_background:
                Intent intent13 = new Intent(hmong_settings.this, hmong_background.class);
                startActivity(intent13);
                break;
        }
    }
}

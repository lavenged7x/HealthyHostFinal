package edu.ucmerced.engineeringservicelearning.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by Administrator on 12/11/2017.
 */

public class english_settings extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.english_settings);

        Button english_languages = findViewById(R.id.english_languages);
        english_languages.setOnClickListener(this);

        Button english_resources = findViewById(R.id.english_resources);
        english_resources.setOnClickListener(this);

        Button english_background = findViewById(R.id.english_background);
        english_background.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.english_languages:
                Intent intent11 = new Intent(english_settings.this, english_languages.class);
                startActivity(intent11);
                break;

            case R.id.english_resources:
                Intent intent12 = new Intent(english_settings.this, english_resources.class);
                startActivity(intent12);
                break;

            case R.id.english_background:
                Intent intent13 = new Intent(english_settings.this, english_background.class);
                startActivity(intent13);
                break;
        }
    }
}
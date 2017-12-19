package edu.ucmerced.engineeringservicelearning.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by Administrator on 12/11/2017.
 */

public class spanish_settings extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spanish_settings);

        Button spanish_languages = findViewById(R.id.spanish_languages);
        spanish_languages.setOnClickListener(this);

        Button spanish_resources = findViewById(R.id.spanish_resources);
        spanish_resources.setOnClickListener(this);

        Button spanish_background = findViewById(R.id.spanish_background);
        spanish_background.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.spanish_languages:
                Intent intent14 = new Intent(spanish_settings.this, spanish_languages.class);
                startActivity(intent14);
                break;

            case R.id.spanish_resources:
                Intent intent15 = new Intent(spanish_settings.this, spanish_resources.class);
                startActivity(intent15);
                break;

            case R.id.spanish_background:
                Intent intent16 = new Intent(spanish_settings.this, spanish_background.class);
                startActivity(intent16);
                break;
        }
    }
}
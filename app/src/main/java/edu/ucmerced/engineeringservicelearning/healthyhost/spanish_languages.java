package edu.ucmerced.engineeringservicelearning.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 12/11/2017.
 */

public class spanish_languages extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spanish_languages);

        Button spanish_english = findViewById(R.id.spanish_english);
        spanish_english.setOnClickListener(this);

        Button spanish_hmong = findViewById(R.id.spanish_hmong);
        spanish_hmong.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.spanish_english:
                Intent intent18 = new Intent(spanish_languages.this, english_homepage.class);
                startActivity(intent18);
                break;

            case R.id.spanish_hmong:
                Intent intent19 = new Intent(spanish_languages.this, hmong_homepage.class);
                startActivity(intent19);
                break;
        }
    }
}

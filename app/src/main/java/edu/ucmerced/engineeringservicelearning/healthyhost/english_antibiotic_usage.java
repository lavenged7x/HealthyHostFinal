package edu.ucmerced.engineeringservicelearning.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 12/18/2017.
 */

public class english_antibiotic_usage extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.english_antibiotic_usage);

        Button english_antibiotic_do = findViewById(R.id.english_antibiotic_do);
        english_antibiotic_do.setOnClickListener(this);

        Button english_antibiotic_dont = findViewById(R.id.english_antibiotic_dont);
        english_antibiotic_dont.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.english_antibiotic_do:
                Intent intent22 = new Intent(english_antibiotic_usage.this, english_antibiotic_do.class);
                startActivity(intent22);
                break;

            case R.id.english_antibiotic_dont:
                Intent intent = new Intent(english_antibiotic_usage.this, english_antibiotic_dont.class);
                startActivity(intent);
                break;
        }
    }
}
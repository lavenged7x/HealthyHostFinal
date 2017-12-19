package edu.ucmerced.engineeringservicelearning.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 12/18/2017.
 */

public class spanish_antibiotic_usage extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spanish_antibiotic_usage);

        Button spanish_antibiotic_do = findViewById(R.id.spanish_antibiotic_do);
        spanish_antibiotic_do.setOnClickListener(this);

        Button spanish_antibiotic_dont = findViewById(R.id.spanish_antibiotic_dont);
        spanish_antibiotic_dont.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.spanish_antibiotic_do:
                Intent intent22 = new Intent(spanish_antibiotic_usage.this, spanish_antibiotic_do.class);
                startActivity(intent22);
                break;

            case R.id.spanish_antibiotic_dont:
                Intent intent = new Intent(spanish_antibiotic_usage.this, spanish_antibiotic_dont.class);
                startActivity(intent);
                break;
        }
    }
}
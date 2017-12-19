package edu.ucmerced.engineeringservicelearning.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 12/18/2017.
 */

public class hmong_antibiotic_usage extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hmong_antibiotic_usage);

        Button hmong_antibiotic_do = findViewById(R.id.hmong_antibiotic_do);
        hmong_antibiotic_do.setOnClickListener(this);

        Button hmong_antibiotic_dont = findViewById(R.id.hmong_antibiotic_dont);
        hmong_antibiotic_dont.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.hmong_antibiotic_do:
                Intent intent22 = new Intent(hmong_antibiotic_usage.this, hmong_antibiotic_do.class);
                startActivity(intent22);
                break;

            case R.id.hmong_antibiotic_dont:
                Intent intent = new Intent(hmong_antibiotic_usage.this, hmong_antibiotic_dont.class);
                startActivity(intent);
                break;
        }
    }
}
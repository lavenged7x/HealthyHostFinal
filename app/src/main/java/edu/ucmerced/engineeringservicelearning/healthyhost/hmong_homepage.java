package edu.ucmerced.engineeringservicelearning.healthyhost;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;

/**
 * Created by Administrator on 12/11/2017.
 */

public class hmong_homepage extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hmong_homepage);

        Button hmong_antibiotics_homepage = findViewById(R.id.hmong_antibiotics_homepage);
        hmong_antibiotics_homepage.setOnClickListener(this);

        Button hmong_illnesses_homepage = findViewById(R.id.hmong_illnesses_homepage);
        hmong_illnesses_homepage.setOnClickListener(this);

        Button hmong_faqs = findViewById(R.id.hmong_faqs);
        hmong_faqs.setOnClickListener(this);

        Button hmong_clinics= findViewById(R.id.hmong_clinics);
        hmong_clinics.setOnClickListener(this);

        Button hmong_settings= findViewById(R.id.hmong_settings);
        hmong_settings.setOnClickListener(this);
    }
    public void onClick(View v){
        switch(v.getId()){
            case R.id.hmong_antibiotics_homepage:
                Intent intent = new Intent(hmong_homepage.this, hmong_antibiotic_homepage.class);
                startActivity(intent);
                break;

            case R.id.hmong_illnesses_homepage:
                Intent intent2 = new Intent(hmong_homepage.this, hmong_illnesses_homepage.class);
                startActivity(intent2);
                break;

            case R.id.hmong_faqs:
                Intent intent3 = new Intent(hmong_homepage.this, hmong_faqs.class);
                startActivity(intent3);
                break;

            case R.id.hmong_clinics:
                Intent intent4 = new Intent(hmong_homepage.this, hmong_clinics.class);
                startActivity(intent4);
                break;

            case R.id.hmong_settings:
                Intent intent5 = new Intent(hmong_homepage.this, hmong_settings.class);
                startActivity(intent5);
                break;
        }
    }
}

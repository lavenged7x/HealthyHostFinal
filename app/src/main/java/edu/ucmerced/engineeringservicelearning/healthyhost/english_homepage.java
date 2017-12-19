package edu.ucmerced.engineeringservicelearning.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class english_homepage extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.english_homepage);

    Button english_antibiotics_homepage = findViewById(R.id.english_antibiotics_homepage);
    english_antibiotics_homepage.setOnClickListener(this);

    Button english_illnesses_homepage = findViewById(R.id.english_illnesses_homepage);
    english_illnesses_homepage.setOnClickListener(this);

    Button english_faqs = findViewById(R.id.english_faqs);
    english_faqs.setOnClickListener(this);

    Button english_clinics= findViewById(R.id.english_clinics);
    english_clinics.setOnClickListener(this);

    Button english_settings= findViewById(R.id.english_settings);
    english_settings.setOnClickListener(this);
    }
    public void onClick(View v){
        switch(v.getId()){
            case R.id.english_antibiotics_homepage:
                Intent intent = new Intent(english_homepage.this, english_antibiotics_homepage.class);
                startActivity(intent);
                break;

            case R.id.english_illnesses_homepage:
                Intent intent2 = new Intent(english_homepage.this, english_illnesses_homepage.class);
                startActivity(intent2);
                break;

            case R.id.english_faqs:
                Intent intent3 = new Intent(english_homepage.this, english_faqs.class);
                startActivity(intent3);
                break;

            case R.id.english_clinics:
                Intent intent4 = new Intent(english_homepage.this, english_clinics.class);
                startActivity(intent4);
                break;

            case R.id.english_settings:
                Intent intent5 = new Intent(english_homepage.this, english_settings.class);
                startActivity(intent5);
                break;
        }
    }
}

package edu.ucmerced.engineeringservicelearning.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by Administrator on 12/11/2017.
 */

public class spanish_homepage extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spanish_homepage);


        Button spanish_antibiotics_homepage = findViewById(R.id.spanish_antibiotics_homepage);
        spanish_antibiotics_homepage.setOnClickListener(this);

        Button spanish_illnesses_homepage = findViewById(R.id.spanish_illnesses_homepage);
        spanish_illnesses_homepage.setOnClickListener(this);

        Button spanish_faqs = findViewById(R.id.spanish_faqs);
        spanish_faqs.setOnClickListener(this);

        Button spanish_clinics = findViewById(R.id.spanish_clinics);
        spanish_clinics.setOnClickListener(this);

        Button spanish_settings = findViewById(R.id.spanish_settings);
        spanish_settings.setOnClickListener(this);
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.spanish_antibiotics_homepage:
                Intent intent6 = new Intent(spanish_homepage.this, spanish_antibiotics_homepage.class);
                startActivity(intent6);
                break;

            case R.id.spanish_illnesses_homepage:
                Intent intent7 = new Intent(spanish_homepage.this, spanish_illnesses_homepage.class);
                startActivity(intent7);
                break;

            case R.id.spanish_faqs:
                Intent intent8 = new Intent(spanish_homepage.this, spanish_faqs.class);
                startActivity(intent8);
                break;

            case R.id.spanish_clinics:
                Intent intent9 = new Intent(spanish_homepage.this, spanish_clinics.class);
                startActivity(intent9);
                break;

            case R.id.spanish_settings:
                Intent intent10 = new Intent(spanish_homepage.this, spanish_settings.class);
                startActivity(intent10);
                break;
        }
    }
}

package edu.ucmerced.engineeringservicelearning.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 12/11/2017.
 */

public class english_illnesses_homepage extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.english_illnesses_homepage);

        Button english_illness_flesh = findViewById(R.id.english_illness_flesh);
        english_illness_flesh.setOnClickListener(this);

        Button english_illness_fever = findViewById(R.id.english_illness_fever);
        english_illness_fever.setOnClickListener(this);

        Button english_illness_impetigo = findViewById(R.id.english_illness_impetigo);
        english_illness_impetigo.setOnClickListener(this);

        Button english_illness_throat = findViewById(R.id.english_illness_throat);
        english_illness_throat.setOnClickListener(this);

        Button english_illness_uti = findViewById(R.id.english_illness_uti);
        english_illness_uti.setOnClickListener(this);

        Button english_illness_chlam = findViewById(R.id.english_illness_chlam);
        english_illness_chlam.setOnClickListener(this);

        Button english_illness_herpes = findViewById(R.id.english_illness_herpes);
        english_illness_herpes.setOnClickListener(this);

        Button english_illness_rsv = findViewById(R.id.english_illness_rsv);
        english_illness_rsv.setOnClickListener(this);

        Button english_illness_ear = findViewById(R.id.english_illness_ear);
        english_illness_ear.setOnClickListener(this);

        Button english_illness_mono = findViewById(R.id.english_illness_mono);
        english_illness_mono.setOnClickListener(this);

        Button english_illness_pylori = findViewById(R.id.english_illness_pylori);
        english_illness_pylori.setOnClickListener(this);

        Button english_illness_lyme = findViewById(R.id.english_illness_lyme);
        english_illness_lyme.setOnClickListener(this);

        Button english_illness_mastitis = findViewById(R.id.english_illness_mastitis);
        english_illness_mastitis.setOnClickListener(this);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.english_illness_flesh:
                Intent intent = new Intent(english_illnesses_homepage.this, english_illness_flesh.class);
                startActivity(intent);
                break;

            case R.id.english_illness_fever:
                Intent intent1 = new Intent(english_illnesses_homepage.this, english_illness_fever.class);
                startActivity(intent1);
                break;

            case R.id.english_illness_impetigo:
                Intent intent2 = new Intent(english_illnesses_homepage.this, english_illness_impetigo.class);
                startActivity(intent2);
                break;

            case R.id.english_illness_throat:
                Intent intent3 = new Intent(english_illnesses_homepage.this, english_illness_throat.class);
                startActivity(intent3);
                break;

            case R.id.english_illness_uti:
                Intent intent4 = new Intent(english_illnesses_homepage.this, english_illness_uti.class);
                startActivity(intent4);
                break;

            case R.id.english_illness_chlam:
                Intent intent5 = new Intent(english_illnesses_homepage.this, english_illness_chlam.class);
                startActivity(intent5);
                break;

            case R.id.english_illness_herpes:
                Intent intent6 = new Intent(english_illnesses_homepage.this, english_illness_herpes.class);
                startActivity(intent6);
                break;

            case R.id.english_illness_rsv:
                Intent intent7 = new Intent(english_illnesses_homepage.this, english_illness_rsv.class);
                startActivity(intent7);
                break;

            case R.id.english_illness_ear:
                Intent intent8 = new Intent(english_illnesses_homepage.this, english_illness_ear.class);
                startActivity(intent8);
                break;

            case R.id.english_illness_mono:
                Intent intent9 = new Intent(english_illnesses_homepage.this, english_illness_mono.class);
                startActivity(intent9);
                break;

            case R.id.english_illness_pylori:
                Intent intent10 = new Intent(english_illnesses_homepage.this, english_illness_pylori.class);
                startActivity(intent10);
                break;

            case R.id.english_illness_lyme:
                Intent intent11 = new Intent(english_illnesses_homepage.this, english_illness_lyme.class);
                startActivity(intent11);
                break;

            case R.id.english_illness_mastitis:
                Intent intent12 = new Intent(english_illnesses_homepage.this, english_illness_mastitis.class);
                startActivity(intent12);
                break;

        }
    }
}
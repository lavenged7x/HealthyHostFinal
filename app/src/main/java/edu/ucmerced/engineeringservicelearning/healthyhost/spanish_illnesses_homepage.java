package edu.ucmerced.engineeringservicelearning.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 12/11/2017.
 */

public class spanish_illnesses_homepage extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spanish_illnesses_page);

        Button spanish_illness_flesh = findViewById(R.id.spanish_illness_flesh);
        spanish_illness_flesh.setOnClickListener(this);

        Button spanish_illness_fever = findViewById(R.id.spanish_illness_fever);
        spanish_illness_fever.setOnClickListener(this);

        Button spanish_illness_impetigo = findViewById(R.id.spanish_illness_impetigo);
        spanish_illness_impetigo.setOnClickListener(this);

        Button spanish_illness_throat = findViewById(R.id.spanish_illness_throat);
        spanish_illness_throat.setOnClickListener(this);

        Button spanish_illness_uti = findViewById(R.id.spanish_illness_uti);
        spanish_illness_uti.setOnClickListener(this);

        Button spanish_illness_chlam = findViewById(R.id.spanish_illness_chlam);
        spanish_illness_chlam.setOnClickListener(this);

        Button spanish_illness_herpes = findViewById(R.id.spanish_illness_herpes);
        spanish_illness_herpes.setOnClickListener(this);

        Button spanish_illness_rsv = findViewById(R.id.spanish_illness_rsv);
        spanish_illness_rsv.setOnClickListener(this);

        Button spanish_illness_ear = findViewById(R.id.spanish_illness_ear);
        spanish_illness_ear.setOnClickListener(this);

        Button spanish_illness_mono = findViewById(R.id.spanish_illness_mono);
        spanish_illness_mono.setOnClickListener(this);

        Button spanish_illness_pylori = findViewById(R.id.spanish_illness_pylori);
        spanish_illness_pylori.setOnClickListener(this);

        Button spanish_illness_lyme = findViewById(R.id.spanish_illness_lyme);
        spanish_illness_lyme.setOnClickListener(this);

        Button spanish_illness_mastitis = findViewById(R.id.spanish_illness_mastitis);
        spanish_illness_mastitis.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.spanish_illness_flesh:
                Intent intent = new Intent(spanish_illnesses_homepage.this, spanish_illness_flesh.class);
                startActivity(intent);
                break;

            case R.id.spanish_illness_fever:
                Intent intent1 = new Intent(spanish_illnesses_homepage.this, spanish_illness_fever.class);
                startActivity(intent1);
                break;

            case R.id.spanish_illness_impetigo:
                Intent intent2 = new Intent(spanish_illnesses_homepage.this, spanish_illness_impetigo.class);
                startActivity(intent2);
                break;

            case R.id.spanish_illness_throat:
                Intent intent3 = new Intent(spanish_illnesses_homepage.this, spanish_illness_throat.class);
                startActivity(intent3);
                break;

            case R.id.spanish_illness_uti:
                Intent intent4 = new Intent(spanish_illnesses_homepage.this, spanish_illness_uti.class);
                startActivity(intent4);
                break;

            case R.id.spanish_illness_chlam:
                Intent intent5 = new Intent(spanish_illnesses_homepage.this, spanish_illness_chlam.class);
                startActivity(intent5);
                break;

            case R.id.spanish_illness_herpes:
                Intent intent6 = new Intent(spanish_illnesses_homepage.this, spanish_illness_herpes.class);
                startActivity(intent6);
                break;

            case R.id.spanish_illness_rsv:
                Intent intent7 = new Intent(spanish_illnesses_homepage.this, spanish_illness_rsv.class);
                startActivity(intent7);
                break;

            case R.id.spanish_illness_ear:
                Intent intent8 = new Intent(spanish_illnesses_homepage.this, spanish_illness_ear.class);
                startActivity(intent8);
                break;

            case R.id.spanish_illness_mono:
                Intent intent9 = new Intent(spanish_illnesses_homepage.this, spanish_illness_mono.class);
                startActivity(intent9);
                break;

            case R.id.spanish_illness_pylori:
                Intent intent10 = new Intent(spanish_illnesses_homepage.this, spanish_illness_pylori.class);
                startActivity(intent10);
                break;

            case R.id.spanish_illness_lyme:
                Intent intent11 = new Intent(spanish_illnesses_homepage.this, spanish_illness_lyme.class);
                startActivity(intent11);
                break;

            case R.id.spanish_illness_mastitis:
                Intent intent12 = new Intent(spanish_illnesses_homepage.this, spanish_illness_mastitis.class);
                startActivity(intent12);
                break;
        }

    }
}


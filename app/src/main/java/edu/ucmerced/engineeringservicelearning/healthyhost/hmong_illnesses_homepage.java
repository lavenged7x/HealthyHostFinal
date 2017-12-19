package edu.ucmerced.engineeringservicelearning.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
/**
 * Created by Administrator on 12/11/2017.
 */

public class hmong_illnesses_homepage extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hmong_illnesses_homepage);

        Button hmong_illness_flesh = findViewById(R.id.hmong_illness_flesh);
        hmong_illness_flesh.setOnClickListener(this);

        Button hmong_illness_fever = findViewById(R.id.hmong_illness_fever);
        hmong_illness_fever.setOnClickListener(this);

        Button hmong_illness_impetigo = findViewById(R.id.hmong_illness_impetigo);
        hmong_illness_impetigo.setOnClickListener(this);

        Button hmong_illness_throat = findViewById(R.id.hmong_illness_throat);
        hmong_illness_throat.setOnClickListener(this);

        Button hmong_illness_uti = findViewById(R.id.hmong_illness_uti);
        hmong_illness_uti.setOnClickListener(this);

        Button hmong_illness_chlam = findViewById(R.id.hmong_illness_chlam);
        hmong_illness_chlam.setOnClickListener(this);

        Button hmong_illness_herpes = findViewById(R.id.hmong_illness_herpes);
        hmong_illness_herpes.setOnClickListener(this);

        Button hmong_illness_rsv = findViewById(R.id.hmong_illness_rsv);
        hmong_illness_rsv.setOnClickListener(this);

        Button hmong_illness_ear = findViewById(R.id.hmong_illness_ear);
        hmong_illness_ear.setOnClickListener(this);

        Button hmong_illness_mono = findViewById(R.id.hmong_illness_mono);
        hmong_illness_mono.setOnClickListener(this);

        Button hmong_illness_pylori = findViewById(R.id.hmong_illness_pylori);
        hmong_illness_pylori.setOnClickListener(this);

        Button hmong_illness_lyme = findViewById(R.id.hmong_illness_lyme);
        hmong_illness_lyme.setOnClickListener(this);

        Button hmong_illness_mastitis = findViewById(R.id.hmong_illness_mastitis);
        hmong_illness_mastitis.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.hmong_illness_flesh:
                Intent intent = new Intent(hmong_illnesses_homepage.this, hmong_illness_flesh.class);
                startActivity(intent);
                break;

            case R.id.hmong_illness_fever:
                Intent intent1 = new Intent(hmong_illnesses_homepage.this, hmong_illness_fever.class);
                startActivity(intent1);
                break;

            case R.id.hmong_illness_impetigo:
                Intent intent2 = new Intent(hmong_illnesses_homepage.this, hmong_illness_impetigo.class);
                startActivity(intent2);
                break;

            case R.id.hmong_illness_throat:
                Intent intent3 = new Intent(hmong_illnesses_homepage.this, hmong_illness_throat.class);
                startActivity(intent3);
                break;

            case R.id.hmong_illness_uti:
                Intent intent4 = new Intent(hmong_illnesses_homepage.this, hmong_illness_uti.class);
                startActivity(intent4);
                break;

            case R.id.hmong_illness_chlam:
                Intent intent5 = new Intent(hmong_illnesses_homepage.this, hmong_illness_chlam.class);
                startActivity(intent5);
                break;

            case R.id.hmong_illness_herpes:
                Intent intent6 = new Intent(hmong_illnesses_homepage.this, hmong_illness_herpes.class);
                startActivity(intent6);
                break;

            case R.id.hmong_illness_rsv:
                Intent intent7 = new Intent(hmong_illnesses_homepage.this, hmong_illness_rsv.class);
                startActivity(intent7);
                break;

            case R.id.hmong_illness_ear:
                Intent intent8 = new Intent(hmong_illnesses_homepage.this, hmong_illness_ear.class);
                startActivity(intent8);
                break;

            case R.id.hmong_illness_mono:
                Intent intent9 = new Intent(hmong_illnesses_homepage.this, hmong_illness_mono.class);
                startActivity(intent9);
                break;

            case R.id.hmong_illness_pylori:
                Intent intent10 = new Intent(hmong_illnesses_homepage.this, hmong_illness_pylori.class);
                startActivity(intent10);
                break;

            case R.id.hmong_illness_lyme:
                Intent intent11 = new Intent(hmong_illnesses_homepage.this, hmong_illness_lyme.class);
                startActivity(intent11);
                break;

            case R.id.hmong_illness_mastitis:
                Intent intent12 = new Intent(hmong_illnesses_homepage.this, hmong_illness_mastitis.class);
                startActivity(intent12);
                break;
        }
    }
}

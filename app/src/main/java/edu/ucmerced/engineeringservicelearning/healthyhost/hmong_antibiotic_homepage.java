package edu.ucmerced.engineeringservicelearning.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 12/11/2017.
 */

public class hmong_antibiotic_homepage extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hmong_antibiotics_homepage);

        Button hmong_antibiotic_usage = findViewById(R.id.hmong_antibiotic_usage);
        hmong_antibiotic_usage.setOnClickListener(this);

        Button hmong_antibiotic_levaquin = findViewById(R.id.hmong_antibiotic_levaquin);
        hmong_antibiotic_levaquin.setOnClickListener(this);

        Button hmong_antibiotic_amoxicillin = findViewById(R.id.hmong_antibiotic_amoxicillin);
        hmong_antibiotic_amoxicillin.setOnClickListener(this);

        Button hmong_antibiotic_azithromycin = findViewById(R.id.hmong_antibiotic_azithromycin);
        hmong_antibiotic_azithromycin.setOnClickListener(this);

        Button hmong_antibiotic_metronidazole = findViewById(R.id.hmong_antibiotic_metronidazole);
        hmong_antibiotic_metronidazole.setOnClickListener(this);

        Button hmong_antibiotic_erythromycin = findViewById(R.id.hmong_antibiotic_erythromycin);
        hmong_antibiotic_erythromycin.setOnClickListener(this);

        Button hmong_antibiotic_doxycycline = findViewById(R.id.hmong_antibiotic_doxycycline);
        hmong_antibiotic_doxycycline.setOnClickListener(this);

        Button hmong_antibiotic_cephalexin = findViewById(R.id.hmong_antibiotic_cephalexin);
        hmong_antibiotic_cephalexin.setOnClickListener(this);

        Button hmong_antibiotic_flucloxacillin = findViewById(R.id.hmong_antibiotic_flucloxacillin);
        hmong_antibiotic_flucloxacillin.setOnClickListener(this);

        Button hmong_antibiotic_ceftriaxone = findViewById(R.id.hmong_antibiotic_ceftriaxone);
        hmong_antibiotic_ceftriaxone.setOnClickListener(this);

        Button hmong_antibiotic_penicillin = findViewById(R.id.hmong_antibiotic_penicillin);
        hmong_antibiotic_penicillin.setOnClickListener(this);

        Button hmong_antibiotic_ofloxacin = findViewById(R.id.hmong_antibiotic_ofloxacin);
        hmong_antibiotic_ofloxacin.setOnClickListener(this);

    }
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.hmong_antibiotic_usage:
                Intent intent333 = new Intent(hmong_antibiotic_homepage.this, hmong_antibiotic_usage.class);
                startActivity(intent333);
                break;

            case R.id.hmong_antibiotic_levaquin:
                Intent intent = new Intent(hmong_antibiotic_homepage.this, hmong_antibiotic_levaquin.class);
                startActivity(intent);
                break;

            case R.id.hmong_antibiotic_amoxicillin:
                Intent intent1 = new Intent(hmong_antibiotic_homepage.this, hmong_antibiotic_amoxicillin.class);
                startActivity(intent1);
                break;

            case R.id.hmong_antibiotic_azithromycin:
                Intent intent2 = new Intent(hmong_antibiotic_homepage.this, hmong_antibiotic_azithromycin.class);
                startActivity(intent2);
                break;

            case R.id.hmong_antibiotic_metronidazole:
                Intent intent3 = new Intent(hmong_antibiotic_homepage.this, hmong_antibiotic_metronidazole.class);
                startActivity(intent3);
                break;

            case R.id.hmong_antibiotic_erythromycin:
                Intent intent4 = new Intent(hmong_antibiotic_homepage.this, hmong_antibiotic_erythromycin.class);
                startActivity(intent4);
                break;

            case R.id.hmong_antibiotic_doxycycline:
                Intent intent5 = new Intent(hmong_antibiotic_homepage.this, hmong_antibiotic_doxycycline.class);
                startActivity(intent5);
                break;

            case R.id.hmong_antibiotic_cephalexin:
                Intent intent6 = new Intent(hmong_antibiotic_homepage.this, hmong_antibiotic_cephalexin.class);
                startActivity(intent6);
                break;

            case R.id.hmong_antibiotic_flucloxacillin:
                Intent intent7 = new Intent(hmong_antibiotic_homepage.this, hmong_antibiotic_flucloxacillin.class);
                startActivity(intent7);
                break;

            case R.id.hmong_antibiotic_ceftriaxone:
                Intent intent8 = new Intent(hmong_antibiotic_homepage.this, hmong_antibiotic_ceftriaxone.class);
                startActivity(intent8);
                break;

            case R.id.hmong_antibiotic_penicillin:
                Intent intent9 = new Intent(hmong_antibiotic_homepage.this, hmong_antibiotic_penicillin.class);
                startActivity(intent9);
                break;

            case R.id.hmong_antibiotic_ofloxacin:
                Intent intent10 = new Intent(hmong_antibiotic_homepage.this, hmong_antibiotic_ofloxacin.class);
                startActivity(intent10);
                break;


        }
    }
}

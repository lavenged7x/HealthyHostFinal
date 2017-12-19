package edu.ucmerced.engineeringservicelearning.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 12/11/2017.
 */

public class english_languages extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.english_languages);

        Button english_spanish = findViewById(R.id.english_spanish);
        english_spanish.setOnClickListener(this);

        Button english_hmong = findViewById(R.id.english_hmong);
        english_hmong.setOnClickListener(this);
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.english_spanish:
                Intent intent17 = new Intent(english_languages.this, spanish_homepage.class);
                startActivity(intent17);
                break;

            case R.id.english_hmong:
                Intent intent119 = new Intent(english_languages.this, hmong_homepage.class);
                startActivity(intent119);
                break;
        }

    }
}

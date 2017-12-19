package edu.ucmerced.engineeringservicelearning.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 12/11/2017.
 */

public class hmong_languages extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hmong_languages);

        Button hmong_english = findViewById(R.id.hmong_english);
        hmong_english.setOnClickListener(this);

        Button hmong_spanish = findViewById(R.id.hmong_spanish);
        hmong_spanish.setOnClickListener(this);
    }
    public void onClick(View v){
        switch(v.getId()){
            case R.id.hmong_english:
                Intent intent17 = new Intent(hmong_languages.this, english_homepage.class);
                startActivity(intent17);
                break;

            case R.id.hmong_spanish:
                Intent intent119 = new Intent(hmong_languages.this, spanish_homepage.class);
                startActivity(intent119);
                break;
        }

    }
}

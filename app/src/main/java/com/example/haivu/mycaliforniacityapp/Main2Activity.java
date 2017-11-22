package com.example.haivu.mycaliforniacityapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;
import android.content.Intent;

public class Main2Activity extends AppCompatActivity implements  OnClickListener{

    public Button buttonsacraId;
    public Button buttonsjId;
    public Button buttonsfId;
    public Button buttonelkId;
    public Button buttonroseviId;
    public Button buttonoakId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonsacraId = (Button)findViewById(R.id.buttonsacraId);
        buttonsacraId.setOnClickListener(this);

        buttonsjId = (Button)findViewById(R.id.buttonsjId);
        buttonsjId.setOnClickListener(this);

        buttonsfId = (Button)findViewById(R.id.buttonsfId);
        buttonsfId.setOnClickListener(this);

        buttonelkId = (Button)findViewById(R.id.buttonelkId);
        buttonelkId.setOnClickListener(this);

        buttonroseviId =(Button)findViewById(R.id.buttonroseviId);
        buttonroseviId.setOnClickListener(this);

        buttonoakId = (Button)findViewById(R.id.buttonoakId);
        buttonoakId.setOnClickListener(this);

        buttonelkId = (Button)findViewById(R.id.buttonelkId);
        buttonelkId.setOnClickListener(this);


    }

    public void onClick(View view){
        if(view.getId() == R.id.buttonsacraId){
            Intent intent = new Intent(this,SacramentoActivity.class);
            startActivity(intent);}

            if(view.getId() == R.id.buttonsjId){
            Intent intent = new Intent(this,activity_sanjose.class);
            startActivity(intent); }

        if(view.getId() == R.id.buttonsfId){
            Intent intent = new Intent(this,activity_sf.class);
            startActivity(intent); }

        if(view.getId() == R.id.buttonelkId){
            Intent intent = new Intent(this,activity_elkgrove.class);
            startActivity(intent); }


    }
}

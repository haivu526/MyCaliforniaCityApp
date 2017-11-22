package com.example.haivu.mycaliforniacityapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;
import android.content.Intent;

public class SacramentoActivity extends AppCompatActivity implements OnClickListener{

    public Button buttonsacraId;
    public Button buttonsjId;
    public Button buttonsfId;
    public Button buttonelkId;
    public Button buttonroseviId;
    public Button buttonoakId;
    public Button buttonsacto2Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sacramento);

        buttonsacto2Id = (Button)findViewById(R.id.buttonsacto2Id);
        buttonsacto2Id.setOnClickListener(this);}

    public void onClick(View view){
        if(view.getId() == R.id.buttonsacto2Id){
            Intent intent = new Intent(this,activity_sacramento2.class);
            startActivity(intent);}
    }
}

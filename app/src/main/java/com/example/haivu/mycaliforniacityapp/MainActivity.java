package com.example.haivu.mycaliforniacityapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    public Button buttonId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonId = (Button)findViewById(R.id.buttonId);

        buttonId.setOnClickListener(this);
    }
    public void onClick(View view){
        if(view.getId() == R.id.buttonId){
            Intent intent = new Intent(this,Main2Activity.class);
            startActivity(intent);
        }
    }
}

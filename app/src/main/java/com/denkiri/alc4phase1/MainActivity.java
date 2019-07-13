package com.denkiri.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonabout;
    Button buttonprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         buttonabout = (Button) findViewById(R.id.about);
        buttonprofile =(Button) findViewById(R.id.profile);
        buttonabout.setOnClickListener(this);
        buttonprofile.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
    if (v==buttonabout){
        Intent about =new  Intent(this,AboutALC.class);
        startActivity(about);
    }
    if(v==buttonprofile){
        Intent profile =new Intent(this,Profile.class);
        startActivity(profile);
    }

    }
}

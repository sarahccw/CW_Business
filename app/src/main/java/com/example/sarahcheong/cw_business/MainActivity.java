package com.example.sarahcheong.cw_business;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void time(View view){
        Intent next = new Intent(this,addappointment.class);
        startActivity(next);
    }

    public void me(View view){
        Intent go = new Intent(this,Attendence.class);
        startActivity(go);
    }
}

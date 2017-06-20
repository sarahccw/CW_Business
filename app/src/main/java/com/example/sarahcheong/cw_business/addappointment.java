package com.example.sarahcheong.cw_business;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class addappointment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addappointment);
    }

    public void time(View view){
        Intent pickTime = new Intent(this,picktime.class);
        startActivity(pickTime);
    }
}

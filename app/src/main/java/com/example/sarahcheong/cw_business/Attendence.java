package com.example.sarahcheong.cw_business;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Attendence extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendence);
    }

    public void list(View view){
        Intent attendee = new Intent(this,attendee.class);
        startActivity(attendee);
    }

}

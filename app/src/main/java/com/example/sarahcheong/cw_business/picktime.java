package com.example.sarahcheong.cw_business;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class picktime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picktime);
    }

    public void done(View view){
        Intent done = new Intent(this,doneappointment.class);
        startActivity(done);
    }
}

package com.example.hp.app;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;



import android.view.View;


public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        Button BtnReg = (Button) findViewById(R.id.BtnReg);

    }

    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.BtnReg:
                Intent Restaurant = new Intent(Homepage.this, LoginActivity.class);
                startActivity(Restaurant);
                break;

            case R.id.BtnCharity:
                Intent Charity = new Intent(Homepage.this, LoginActivity.class);
                startActivity(Charity);
                break;



        }
    }
}


package com.example.android.refadah2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Button mo =(Button)findViewById(R.id.mo);

        mo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openNext();


            }

        });

    }
    public void openNext(){

        Intent myIntent = new Intent(this,depositActivity.class);
        startActivity(myIntent);
    }

}

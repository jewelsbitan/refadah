package com.example.android.refadah2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class depositActivity extends AppCompatActivity {


    EditText txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deposit);

        Button showP =(Button)findViewById(R.id.button2);
        Button next =(Button)findViewById(R.id.buttonn);



        final EditText txt2;
        txt1 =(EditText)findViewById(R.id.numberOfArrows);
        txt2 =(EditText)findViewById(R.id.resultText);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNext();
            }
        });



        showP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt1.getText().toString().matches("")){
                    Toast.makeText(getApplicationContext(),"nothing!" , Toast.LENGTH_LONG).show();
                }
                else{
                    int n1 = Integer.parseInt(txt1.getText().toString());
                    int nr;
                    nr = n1*10;
                    txt2.setText(String.valueOf(nr));

                }

            }
        });


    }

    public void openNext(){
        txt1 =(EditText)findViewById(R.id.numberOfArrows);

        Intent myIntent = new Intent(this,Activity.class);
        Bundle b = new Bundle();
        int nr = Integer.parseInt(txt1.getText().toString());

        nr = nr*10;
        String nr2 = String.valueOf(nr);

        b.putString("Amount",nr2);

        myIntent.putExtras(b);

        startActivity(myIntent);

    }


}
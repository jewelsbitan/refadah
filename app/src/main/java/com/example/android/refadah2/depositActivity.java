package com.example.android.refadah2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class depositActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deposit);

        Button showP =(Button)findViewById(R.id.button2);

        final EditText txt1;
        final EditText txt2;
        txt1 =(EditText)findViewById(R.id.numberOfArrows);
        txt2 =(EditText)findViewById(R.id.resultText);

        showP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
if (txt1.getText().toString().matches("")){
    Toast.makeText(getApplicationContext(),"nothing!" , Toast.LENGTH_LONG).show();
}
else{
    int n1 = Integer.parseInt(txt1.getText().toString());
    int nr = n1*10;
    txt2.setText(String.valueOf(nr));


}

            }
        });

    }

}
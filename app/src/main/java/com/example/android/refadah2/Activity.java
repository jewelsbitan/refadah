package com.example.android.refadah2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);
        TextView txt = (TextView) findViewById(R.id.textView8);
        Bundle b = getIntent().getExtras();
        String A= b.getString("Amount");
        txt.setText(String.valueOf(A));
        Button Co= (Button)findViewById(R.id.button);
Co.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Confirm();
    }
});

    }

    public void cancel(View view) {
        finish();
        moveTaskToBack(true);
    }

    public void openNext(){

        Intent myIntent = new Intent(this,depositActivity.class);
        startActivity(myIntent);
    }
    public void Confirm(){

        Intent myIntent = new Intent(this,home.class);
        startActivity(myIntent);
    }
}

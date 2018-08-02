package com.example.android.refadah2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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

    }

    public void cancel(View view) {
        finish();
        moveTaskToBack(true);
    }
}

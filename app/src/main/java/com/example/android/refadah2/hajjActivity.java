package com.example.android.refadah2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class hajjActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hajj);
    }



    public void Exit(View view) {
        finish();
        moveTaskToBack(true);
    }
}

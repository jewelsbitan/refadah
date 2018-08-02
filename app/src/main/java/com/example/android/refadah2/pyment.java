package com.example.android.refadah2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.RadioButton;

/**
 * Created by jewelsbitan on 02/08/18.
 */

public class pyment extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_pyment);



            RadioButton radioButton1 = (RadioButton) findViewById(R.id.radioButton1);


            RadioButton radioButton2 = (RadioButton) findViewById(R.id.radioButton2);


            radioButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
            {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
                {
                    if (isChecked)
                    {
                        openNext1();
                    }
                }
            });

            radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
            {@Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    openNext();
                }
            }
                    });



        }
    public void openNext(){

        Intent myIntent = new Intent(this,home.class);
        startActivity(myIntent);
    }

    public void openNext1(){

        Intent myIntent = new Intent(this,home.class);
        startActivity(myIntent);
    }

}

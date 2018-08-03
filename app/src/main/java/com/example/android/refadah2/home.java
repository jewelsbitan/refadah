package com.example.android.refadah2;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {
    //String[] language = { "Arabic", "English"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        Button mo3 =(Button)findViewById(R.id.mo);

        Button mo2 =(Button)findViewById(R.id.aboutUs);
        Button mo4 =(Button)findViewById(R.id.hj);



        mo2.setPaintFlags(mo2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        mo3.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                openNext();
            }
        });

        mo2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                openAbout();
            }
        });

        mo4.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                openHajj();
            }
        });
    }



    public void openNext(){

        Intent myIntent = new Intent(this,depositActivity.class);
        startActivity(myIntent);
    }

    public void openAbout(){

        Intent myIntent = new Intent(this,aboutActivity.class);
        startActivity(myIntent);
    }

    public void openHajj(){

        Intent myIntent = new Intent(this,hajjActivity.class);
        startActivity(myIntent);
    }

        /*

        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,language);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);

    }

    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(),language[position] , Toast.LENGTH_LONG).show();
        Intent myIntent = new Intent(this,Main2Activity.class);
        //Intent myIntent = new Intent(this,depositActivity.class);

        startActivity(myIntent);
    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}
*/

    }
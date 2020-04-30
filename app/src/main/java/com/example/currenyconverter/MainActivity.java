package com.example.currenyconverter;

import android.service.autofill.FillEventHistory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void Calculate (View view){

        EditText editText = (EditText) findViewById(R.id.Currency);
        String Pounds = editText.getText().toString();
        double PoundDouble= Double.parseDouble(Pounds);
        double DollarsDouble = PoundDouble * 1.3;
        String Converted = String.format("%.2f",DollarsDouble);
        Toast.makeText(this,"$"+Converted, Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

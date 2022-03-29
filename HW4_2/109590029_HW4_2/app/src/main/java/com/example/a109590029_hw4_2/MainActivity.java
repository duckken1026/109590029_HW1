package com.example.a109590029_hw4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ButtonClicked(View view)
    {
        StringBuffer toppings = new
                StringBuffer().append(getString(R.string.toppings_label)+ " ");
        if  (((CheckBox) findViewById(R.id.checkbox1_chocolate)).isChecked()) {
            toppings.append(getString(R.string.ButtonName0) + " ");
        }
        if  (((CheckBox) findViewById(R.id.checkbox2_sprinkles)).isChecked()) {
            toppings.append(getString(R.string.ButtonName1)+ " ");
        }
        if  (((CheckBox) findViewById(R.id.checkbox3_crushed)).isChecked()) {
            toppings.append(getString(R.string.ButtonName2)+ " ");
        }
        if  (((CheckBox) findViewById(R.id.checkbox4_cherries)).isChecked()) {
            toppings.append(getString(R.string.ButtonName3)+ " ");
        }
        if  (((CheckBox) findViewById(R.id.checkbox5_orio)).isChecked()) {
            toppings.append(getString(R.string.ButtonName4)+ " ");
        }
        displayToast(toppings);
    }
    public void displayToast(StringBuffer message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_LONG).show();
    }

}
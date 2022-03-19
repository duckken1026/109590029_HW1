package com.example.a109590029_hw2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.countView);
        if (savedInstanceState != null) {
            count = savedInstanceState.getInt("count");
            mShowCount.setText(Integer.toString(count));
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count",count);
    }

    public void countUp(View view){
        count++;
        if(mShowCount != null){
            mShowCount.setText(Integer.toString(count));
        }
    }
}
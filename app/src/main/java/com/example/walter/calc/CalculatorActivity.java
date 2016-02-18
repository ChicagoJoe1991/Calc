package com.example.walter.calc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
public String num1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

    }

    public void onClickSeven(View view){
        TextView textMessage = (TextView) findViewById(R.id.textView);
        num1 += "7";
        textMessage.setText(num1);
    }

}

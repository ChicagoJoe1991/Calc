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
public String text1="", text2="", op="", total2="";
    public int total, num1, num2;
    public Boolean first=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

    }

    public void onClickSeven(View view){
        TextView textMessage = (TextView) findViewById(R.id.textView);
        if(first) {
            text1 += "7";
            textMessage.setText(text1);
        }
        else {
            text2 += "7";
            textMessage.setText(text2);
        }

    }
    public void onClickEight(View view){
        TextView textMessage = (TextView) findViewById(R.id.textView);
        if(first) {
            text1 += "8";
            textMessage.setText(text1);
        }
        else {
            text2 += "8";
            textMessage.setText(text2);
        }

    }
    public void onClickNine(View view){
        TextView textMessage = (TextView) findViewById(R.id.textView);
        if(first) {
            text1 += "9";
            textMessage.setText(text1);
        }
        else {
            text2 += "9";
            textMessage.setText(text2);
        }

    }
    public void onClickFour(View view){
        TextView textMessage = (TextView) findViewById(R.id.textView);
        if(first) {
            text1 += "4";
            textMessage.setText(text1);
        }
        else {
            text2 += "4";
            textMessage.setText(text2);
        }

    }
    public void onClickFive(View view){
        TextView textMessage = (TextView) findViewById(R.id.textView);
        if(first) {
            text1 += "5";
            textMessage.setText(text1);
        }
        else {
            text2 += "5";
            textMessage.setText(text2);
        }

    }
    public void onClickSix(View view){
        TextView textMessage = (TextView) findViewById(R.id.textView);
        if(first) {
            text1 += "6";
            textMessage.setText(text1);
        }
        else {
            text2 += "6";
            textMessage.setText(text2);
        }

    }
    public void onClickOne(View view){
        TextView textMessage = (TextView) findViewById(R.id.textView);
        if(first) {
            text1 += "1";
            textMessage.setText(text1);
        }
        else {
            text2 += "1";
            textMessage.setText(text2);
        }

    }
    public void onClickTwo(View view){
        TextView textMessage = (TextView) findViewById(R.id.textView);
        if(first) {
            text1 += "2";
            textMessage.setText(text1);
        }
        else {
            text2 += "2";
            textMessage.setText(text2);
        }

    }
    public void onClickThree(View view){
        TextView textMessage = (TextView) findViewById(R.id.textView);
        if(first) {
            text1 += "3";
            textMessage.setText(text1);
        }
        else {
            text2 += "3";
            textMessage.setText(text2);
        }

    }
    public void onClickZero(View view){
        TextView textMessage = (TextView) findViewById(R.id.textView);
        if(first) {
            text1 += "0";
            textMessage.setText(text1);
        }
        else {
            text2 += "0";
            textMessage.setText(text2);
        }
    }
    public void onClickAdd(View view){
        TextView textMessage = (TextView) findViewById(R.id.textView);
        first = false;
        op="add";
        textMessage.setText("");
    }
    public void onClickSubtract(View view){
        TextView textMessage = (TextView) findViewById(R.id.textView);
        first = false;
        op="subtract";
        textMessage.setText("");
    }
    public void onClickMultiply(View view){
        TextView textMessage = (TextView) findViewById(R.id.textView);
        first = false;
        op="multiply";
        textMessage.setText("");
    }
    public void onClickDivide(View view){
        TextView textMessage = (TextView) findViewById(R.id.textView);
        first = false;
        op="divide";
        textMessage.setText("");
    }
    public void onClickClear(View view){
        TextView textMessage = (TextView) findViewById(R.id.textView);
        first = true;
        op="";
        text1="";
        text2="";
        total=0;
        total2="";
        num1=0;
        num2=0;
        textMessage.setText("");
    }
    public void onClickEqual(View view){
        TextView textMessage = (TextView) findViewById(R.id.textView);
        num1 = Integer.parseInt(text1);
        num2 = Integer.parseInt(text2);

        switch (op){
            case "add":total=num1+num2;break;
            case "subtract":total=num1-num2;break;
            case "multiply":total=num1*num2;break;
            case "divide":total=num1/num2;break;
        }


        total2= String.valueOf(total);
        textMessage.setText(total2);
        num1 = Integer.parseInt(total2);
    }


}

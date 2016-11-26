package com.example.rahulsurvase.yapt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    //yu need to create an object of text view
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); /*super class constructor*/
        setContentView(R.layout.activity_main); /*autho\ */

        textView = (TextView)findViewById(R.id.hey);  //this is an object so u have to type cast into corresponding class


    }
    public void showMsg(View view)
    {
       //String msg = "Hey you clicked the button bro!";
        //textView.setText(msg);
        String button_text ;
        button_text = ((Button) view).getText().toString();

        if(button_text.equals("open 2nd activity"))
        {
            Intent  intent= new Intent(this, SecondActivity.class);

            startActivity(intent);

        }
        else if(button_text.equals("open 3rd activity"))
        {
            Intent intent = new Intent(this, ThirdActivity.class);

            startActivity(intent);
        }

    }

}



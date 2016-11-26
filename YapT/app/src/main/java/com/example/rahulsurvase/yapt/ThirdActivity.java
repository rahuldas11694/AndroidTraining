package com.example.rahulsurvase.yapt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.widget.TextView;

/**
 * Created by rahulsurvase on 13/11/16.
 * if u add multiple activities in your application
 * then u have to register that activity into manifest folder
 */

public class ThirdActivity extends AppCompatActivity {
    public static final String MESSAGE_KEY = "com.example.rahulsurvase.yapt.message_key";

    @Override

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MESSAGE_KEY);
        TextView textView = new TextView(this);
        textView.setTextSize(49);
        textView.setText(message);
        setContentView(textView);

        //setContentView(R.layout.third_layout);


    }

    public void showMap()
    {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }


}

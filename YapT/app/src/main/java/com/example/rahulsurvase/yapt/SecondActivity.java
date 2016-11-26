package com.example.rahulsurvase.yapt;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
/**
 * Created by rahulsurvase on 13/11/16.
 */

public class SecondActivity extends AppCompatActivity{

    EditText message_text;
    // if you make a key with pckg name thn u make sure that
    // your key is unique
    public static final String MESSAGE_KEY = "com.example.rahulsurvase.yapt.message_key";


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_layout);

    }

    public void sendMessage(View view)
    {
        message_text = (EditText) findViewById(R.id.text);
        String message = message_text.getText().toString();

        Intent intent = new Intent(this, ThirdActivity.class);
        // now attach data to intent object
        intent.putExtra(MESSAGE_KEY, message);

        startActivity(intent);
        // nw we hv to receive this msg on target activity
    }


}

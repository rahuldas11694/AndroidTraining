package com.example.rahulsurvase.optionsmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
// for adding particular action menu into action bar u have to override the method called oncreateoptions menu

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.my_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    // handle the click event of action menu u need to overide following method


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relative_layout);
        // find which item is selected by user

        switch(item.getItemId()){
            case R.id.id_blue_color:
                relativeLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
                break;
            case R.id.id_yellow_color:
                relativeLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            break;
            case R.id.id_green_color:
                relativeLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            break;
            case R.id.id_red_color:
                relativeLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            break;


        }

        return super.onOptionsItemSelected(item);

    }
}

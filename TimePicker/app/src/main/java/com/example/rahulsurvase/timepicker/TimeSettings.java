package com.example.rahulsurvase.timepicker;


import android.app.TimePickerDialog;
import android.content.Context;
import android.widget.TimePicker;
import android.widget.Toast;

/**
 * Created by rahulsurvase on 26/11/16.
 * i handles the onclick event of TimePickerDialog
 */

public class TimeSettings implements TimePickerDialog.OnTimeSetListener {

    Context context;

    public TimeSettings(Context context){
        this.context = context;
    }


    @Override
    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minute) {

        Toast.makeText(context,"TIme selected hour :"+hourOfDay+"minute :"+minute, Toast.LENGTH_LONG).show();
    }
}

package com.example.rahulsurvase.timepicker;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.icu.util.Calendar;
import android.os.Build;
import android.text.format.DateFormat;
import android.support.annotation.RequiresApi;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DialogHandler extends DialogFragment {

    @TargetApi(Build.VERSION_CODES.N)
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override

    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        TimePickerDialog dialog;
        TimeSettings timeSettings = new TimeSettings(getActivity());
        dialog = new TimePickerDialog(getActivity() , timeSettings, hour, minute,DateFormat.is24HourFormat(getActivity()));
        return  dialog;
//        return super.onCreateDialog(savedInstanceState);
    }
}
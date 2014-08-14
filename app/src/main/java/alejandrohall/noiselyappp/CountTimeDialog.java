package alejandrohall.noiselyappp;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.format.DateFormat;
import android.widget.TimePicker;

import java.util.Calendar;


public  class CountTimeDialog extends DialogFragment
        implements TimePickerDialog.OnTimeSetListener {


    final Calendar c = Calendar.getInstance();
    int hour;
    int minute;
    CountDownTimer countDowner;
    Context context;



    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current time as the default values for the picker
        hour = c.get(Calendar.HOUR_OF_DAY);
        minute = c.get(Calendar.MINUTE);

        // Create a new instance of TimePickerDialog and return it
        return new TimePickerDialog(getActivity(), this, hour, minute,
                DateFormat.is24HourFormat(getActivity()));
    }

    public void onTimeSet(TimePicker view, int hourOfDay, int minutesRestantes) {




        int hoursRemaining = hourOfDay-hour;
        int minutesRemaining = minutesRestantes-minute;
        long totalTime = ((minutesRemaining*60)+(hoursRemaining*3600))*1000;


        countDowner = new CountDownTimer(totalTime, 1000) {

            public void onTick(long millisUntilFinished) {

            }

            public void onFinish() {
                MyActivity.StopPlayers();

            }
        }.start();


    }
}
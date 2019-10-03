package com.example.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class StatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

        SharedPreferences sharedPref = getSharedPreferences(getString(R.string.shared_prefs_key), Context.MODE_PRIVATE);

        TextView titleView = findViewById(R.id.textView);
        titleView.setText("Dice roll statistics");

        int roll_1 = sharedPref.getInt(getString(R.string.roll_1), 0);
        TextView view1 = findViewById(R.id.textView2);
        view1.setText("1 count: " + roll_1);

        int roll_2 = sharedPref.getInt(getString(R.string.roll_2), 0);
        TextView view2 = findViewById(R.id.textView3);
        view2.setText("2 count: " + roll_2);

        int roll_3 = sharedPref.getInt(getString(R.string.roll_3), 0);
        TextView view3 = findViewById(R.id.textView4);
        view3.setText("3 count: " + roll_3);

        int roll_4 = sharedPref.getInt(getString(R.string.roll_4), 0);
        TextView view4 = findViewById(R.id.textView5);
        view4.setText("4 count: " + roll_4);

        int roll_5 = sharedPref.getInt(getString(R.string.roll_5), 0);
        TextView view5 = findViewById(R.id.textView6);
        view5.setText("5 count: " + roll_5);

        int roll_6 = sharedPref.getInt(getString(R.string.roll_6), 0);
        TextView view6 = findViewById(R.id.textView7);
        view6.setText("6 count: " + roll_6);

        int roll_7 = sharedPref.getInt(getString(R.string.roll_7), 0);
        TextView view7 = findViewById(R.id.textView8);
        view7.setText("7 count: " + roll_7);

        int roll_8 = sharedPref.getInt(getString(R.string.roll_8), 0);
        TextView view8 = findViewById(R.id.textView9);
        view8.setText("8 count: " + roll_8);

        int roll_9 = sharedPref.getInt(getString(R.string.roll_9), 0);
        TextView view9 = findViewById(R.id.textView10);
        view9.setText("9 count: " + roll_9);

        int roll_10 = sharedPref.getInt(getString(R.string.roll_10), 0);
        TextView view10 = findViewById(R.id.textView11);
        view10.setText("10 count: " + roll_10);

        int roll_11 = sharedPref.getInt(getString(R.string.roll_11), 0);
        TextView view11 = findViewById(R.id.textView12);
        view11.setText("11 count: " + roll_11);

        int roll_12 = sharedPref.getInt(getString(R.string.roll_12), 0);
        TextView view12 = findViewById(R.id.textView13);
        view12.setText("12 count: " + roll_12);

        int roll_13 = sharedPref.getInt(getString(R.string.roll_13), 0);
        TextView view13 = findViewById(R.id.textView14);
        view13.setText("13 count: " + roll_13);

        int roll_14 = sharedPref.getInt(getString(R.string.roll_14), 0);
        TextView view14 = findViewById(R.id.textView15);
        view14.setText("14 count: " + roll_14);

        int roll_15 = sharedPref.getInt(getString(R.string.roll_15), 0);
        TextView view15 = findViewById(R.id.textView16);
        view15.setText("15 count: " + roll_15);

        int roll_16 = sharedPref.getInt(getString(R.string.roll_16), 0);
        TextView view16 = findViewById(R.id.textView17);
        view16.setText("16 count: " + roll_16);

        int roll_17 = sharedPref.getInt(getString(R.string.roll_17), 0);
        TextView view17 = findViewById(R.id.textView18);
        view17.setText("17 count: " + roll_17);

        int roll_18 = sharedPref.getInt(getString(R.string.roll_18), 0);
        TextView view18 = findViewById(R.id.textView19);
        view18.setText("18 count: " + roll_18);

        int roll_19 = sharedPref.getInt(getString(R.string.roll_19), 0);
        TextView view19 = findViewById(R.id.textView20);
        view19.setText("19 count: " + roll_19);

        int roll_20 = sharedPref.getInt(getString(R.string.roll_20), 0);
        TextView view20 = findViewById(R.id.textView21);
        view20.setText("20 count: " + roll_20);
    }
}

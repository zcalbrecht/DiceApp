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

        int roll_1 = sharedPref.getInt(getString(R.string.roll_1), 1);
        TextView view1 = findViewById(R.id.textView2);
        view1.setText("Score: " + roll_1);

        int roll_2 = sharedPref.getInt(getString(R.string.roll_2), 1);
        TextView view2 = findViewById(R.id.textView3);
        view2.setText("Score: " + roll_2);

        int roll_3 = sharedPref.getInt(getString(R.string.roll_3), 1);
        TextView view3 = findViewById(R.id.textView4);
        view3.setText("Score: " + roll_3);
    }
}

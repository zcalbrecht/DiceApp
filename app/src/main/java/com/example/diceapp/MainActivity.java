package com.example.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private ImageView imageViewDie;
    private TextView textViewContent;
    private Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDie = findViewById(R.id.image_view_die);
        textViewContent = findViewById(R.id.notifText);
        imageViewDie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                rollDice();
            }
        });

        FloatingActionButton fab = findViewById(R.id.main_fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // go someplace new
                Intent intent = new Intent(MainActivity.this, StatsActivity.class);
                startActivity(intent);
            }

        });
    }



    private void rollDice() {
        int rand = rng.nextInt(20) + 1;

        SharedPreferences sharedPref = getSharedPreferences(getString(R.string.shared_prefs_key), Context.MODE_PRIVATE);
        int press_count;
        SharedPreferences.Editor editor = sharedPref.edit();


        switch(rand) {
            case 1:
                imageViewDie.setImageResource(R.drawable.die1);
                textViewContent.setText("1? What a loser.");
                MediaPlayer bad = MediaPlayer.create(getApplicationContext(), R.raw.bad);
                bad.start();
                SharedPreferences sharedPref1 = getSharedPreferences(getString(R.string.shared_prefs_key), Context.MODE_PRIVATE);
                press_count = sharedPref1.getInt(getString(R.string.roll_1), 0);
                press_count++;
                editor.putInt(getString(R.string.roll_1), press_count);
                editor.commit();
                break;
            case 2:
                MediaPlayer roll2 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll2.start();
                imageViewDie.setImageResource(R.drawable.die2);
                textViewContent.setText("");
                press_count = sharedPref.getInt(getString(R.string.roll_2), 0);
                press_count++;
                editor.putInt(getString(R.string.roll_2), press_count);
                editor.commit();
                break;
            case 3:
                MediaPlayer roll3 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll3.start();
                imageViewDie.setImageResource(R.drawable.die3);
                textViewContent.setText("");
                press_count = sharedPref.getInt(getString(R.string.roll_3), 0);
                press_count++;
                editor.putInt(getString(R.string.roll_3), press_count);
                editor.commit();
                break;
            case 4:
                MediaPlayer roll4 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll4.start();
                imageViewDie.setImageResource(R.drawable.die4);
                textViewContent.setText("");
                press_count = sharedPref.getInt(getString(R.string.roll_4), 0);
                press_count++;
                editor.putInt(getString(R.string.roll_4), press_count);
                editor.commit();
                break;
            case 5:
                MediaPlayer roll5 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll5.start();
                imageViewDie.setImageResource(R.drawable.die5);
                textViewContent.setText("");
                press_count = sharedPref.getInt(getString(R.string.roll_5), 0);
                press_count++;
                editor.putInt(getString(R.string.roll_5), press_count);
                editor.commit();
                break;
            case 6:
                MediaPlayer roll6 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll6.start();
                imageViewDie.setImageResource(R.drawable.die6);
                textViewContent.setText("");
                press_count = sharedPref.getInt(getString(R.string.roll_6), 0);
                press_count++;
                editor.putInt(getString(R.string.roll_6), press_count);
                editor.commit();
                break;
            case 7:
                MediaPlayer roll7 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll7.start();
                imageViewDie.setImageResource(R.drawable.die7);
                textViewContent.setText("");
                press_count = sharedPref.getInt(getString(R.string.roll_7), 0);
                press_count++;
                editor.putInt(getString(R.string.roll_7), press_count);
                editor.commit();
                break;
            case 8:
                MediaPlayer roll8 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll8.start();
                imageViewDie.setImageResource(R.drawable.die8);
                textViewContent.setText("");
                press_count = sharedPref.getInt(getString(R.string.roll_8), 0);
                press_count++;
                editor.putInt(getString(R.string.roll_8), press_count);
                editor.commit();
                break;
            case 9:
                MediaPlayer roll9 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll9.start();
                imageViewDie.setImageResource(R.drawable.die9);
                textViewContent.setText("");
                press_count = sharedPref.getInt(getString(R.string.roll_9), 0);
                press_count++;
                editor.putInt(getString(R.string.roll_9), press_count);
                editor.commit();
                break;
            case 10:
                MediaPlayer roll10 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll10.start();
                imageViewDie.setImageResource(R.drawable.die10);
                textViewContent.setText("");
                press_count = sharedPref.getInt(getString(R.string.roll_10), 0);
                press_count++;
                editor.putInt(getString(R.string.roll_10), press_count);
                editor.commit();
                break;
            case 11:
                MediaPlayer roll11 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll11.start();
                imageViewDie.setImageResource(R.drawable.die11);
                textViewContent.setText("");
                press_count = sharedPref.getInt(getString(R.string.roll_11), 0);
                press_count++;
                editor.putInt(getString(R.string.roll_11), press_count);
                editor.commit();
                break;
            case 12:
                MediaPlayer roll12 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll12.start();
                imageViewDie.setImageResource(R.drawable.die12);
                textViewContent.setText("");
                press_count = sharedPref.getInt(getString(R.string.roll_12), 0);
                press_count++;
                editor.putInt(getString(R.string.roll_12), press_count);
                editor.commit();
                break;
            case 13:
                MediaPlayer roll13 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll13.start();
                imageViewDie.setImageResource(R.drawable.die13);
                textViewContent.setText("");
                press_count = sharedPref.getInt(getString(R.string.roll_13), 0);
                press_count++;
                editor.putInt(getString(R.string.roll_13), press_count);
                editor.commit();
                break;
            case 14:
                MediaPlayer roll14 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll14.start();
                imageViewDie.setImageResource(R.drawable.die14);
                textViewContent.setText("");
                press_count = sharedPref.getInt(getString(R.string.roll_14), 0);
                press_count++;
                editor.putInt(getString(R.string.roll_14), press_count);
                editor.commit();
                break;
            case 15:
                MediaPlayer roll15 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll15.start();
                imageViewDie.setImageResource(R.drawable.die15);
                textViewContent.setText("");
                press_count = sharedPref.getInt(getString(R.string.roll_15), 0);
                press_count++;
                editor.putInt(getString(R.string.roll_15), press_count);
                editor.commit();
                break;
            case 16:
                MediaPlayer roll16 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll16.start();
                imageViewDie.setImageResource(R.drawable.die16);
                textViewContent.setText("");
                press_count = sharedPref.getInt(getString(R.string.roll_16), 0);
                press_count++;
                editor.putInt(getString(R.string.roll_16), press_count);
                editor.commit();
                break;
            case 17:
                MediaPlayer roll17 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll17.start();
                imageViewDie.setImageResource(R.drawable.die17);
                textViewContent.setText("");
                press_count = sharedPref.getInt(getString(R.string.roll_17), 0);
                press_count++;
                editor.putInt(getString(R.string.roll_17), press_count);
                editor.commit();
                break;
            case 18:
                MediaPlayer roll18 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll18.start();
                imageViewDie.setImageResource(R.drawable.die18);
                textViewContent.setText("");
                press_count = sharedPref.getInt(getString(R.string.roll_18), 0);
                press_count++;
                editor.putInt(getString(R.string.roll_18), press_count);
                editor.commit();
                break;
            case 19:
                MediaPlayer roll19 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll19.start();
                imageViewDie.setImageResource(R.drawable.die19);
                textViewContent.setText("");
                press_count = sharedPref.getInt(getString(R.string.roll_19), 0);
                press_count++;
                editor.putInt(getString(R.string.roll_19), press_count);
                editor.commit();
                break;
            case 20:
                imageViewDie.setImageResource(R.drawable.die20);
                textViewContent.setText("Wow, you got a 20.");
                MediaPlayer good = MediaPlayer.create(getApplicationContext(), R.raw.good);
                good.start();
                press_count = sharedPref.getInt(getString(R.string.roll_20), 0);
                press_count++;
                editor.putInt(getString(R.string.roll_20), press_count);
                editor.commit();
                break;
        }
    }
}

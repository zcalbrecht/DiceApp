package com.example.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
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
    }

    private void rollDice() {
        int rand = rng.nextInt(20) + 1;

        switch(rand) {
            case 1:
                imageViewDie.setImageResource(R.drawable.die1);
                textViewContent.setText("1? What a loser.");
                MediaPlayer bad = MediaPlayer.create(getApplicationContext(), R.raw.bad);
                bad.start();
                break;
            case 2:
                MediaPlayer roll2 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll2.start();
                imageViewDie.setImageResource(R.drawable.die2);
                textViewContent.setText("");
                break;
            case 3:
                MediaPlayer roll3 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll3.start();
                imageViewDie.setImageResource(R.drawable.die3);
                textViewContent.setText("");
                break;
            case 4:
                MediaPlayer roll4 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll4.start();
                imageViewDie.setImageResource(R.drawable.die4);
                textViewContent.setText("");
                break;
            case 5:
                MediaPlayer roll5 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll5.start();
                imageViewDie.setImageResource(R.drawable.die5);
                textViewContent.setText("");
                break;
            case 6:
                MediaPlayer roll6 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll6.start();
                imageViewDie.setImageResource(R.drawable.die6);
                textViewContent.setText("");
                break;
            case 7:
                MediaPlayer roll7 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll7.start();
                imageViewDie.setImageResource(R.drawable.die7);
                textViewContent.setText("");
                break;
            case 8:
                MediaPlayer roll8 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll8.start();
                imageViewDie.setImageResource(R.drawable.die8);
                textViewContent.setText("");
                break;
            case 9:
                MediaPlayer roll9 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll9.start();
                imageViewDie.setImageResource(R.drawable.die9);
                textViewContent.setText("");
                break;
            case 10:
                MediaPlayer roll10 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll10.start();
                imageViewDie.setImageResource(R.drawable.die10);
                textViewContent.setText("");
                break;
            case 11:
                MediaPlayer roll11 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll11.start();
                imageViewDie.setImageResource(R.drawable.die11);
                textViewContent.setText("");
                break;
            case 12:
                MediaPlayer roll12 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll12.start();
                imageViewDie.setImageResource(R.drawable.die12);
                textViewContent.setText("");
                break;
            case 13:
                MediaPlayer roll13 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll13.start();
                imageViewDie.setImageResource(R.drawable.die13);
                textViewContent.setText("");
                break;
            case 14:
                MediaPlayer roll14 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll14.start();
                imageViewDie.setImageResource(R.drawable.die14);
                textViewContent.setText("");
                break;
            case 15:
                MediaPlayer roll15 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll15.start();
                imageViewDie.setImageResource(R.drawable.die15);
                textViewContent.setText("");
                break;
            case 16:
                MediaPlayer roll16 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll16.start();
                imageViewDie.setImageResource(R.drawable.die16);
                textViewContent.setText("");
                break;
            case 17:
                MediaPlayer roll17 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll17.start();
                imageViewDie.setImageResource(R.drawable.die17);
                textViewContent.setText("");
                break;
            case 18:
                MediaPlayer roll18 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll18.start();
                imageViewDie.setImageResource(R.drawable.die18);
                textViewContent.setText("");
                break;
            case 19:
                MediaPlayer roll19 = MediaPlayer.create(getApplicationContext(), R.raw.roll);
                roll19.start();
                imageViewDie.setImageResource(R.drawable.die19);
                textViewContent.setText("");
                break;
            case 20:
                imageViewDie.setImageResource(R.drawable.die20);
                textViewContent.setText("Wow, you got a 20.");
                MediaPlayer good = MediaPlayer.create(getApplicationContext(), R.raw.good);
                good.start();
                break;
        }
    }
}

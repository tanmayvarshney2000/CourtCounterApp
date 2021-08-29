package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreteama=0;
    int scoreteamb=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayforteama(0);

    }

    public void displayforteama(int score){
        TextView scoreView=(TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void display3points(View view){
        scoreteama = scoreteama + 3;
        displayforteama(scoreteama);
    }
    public void display2points(View view){
        scoreteama = scoreteama + 2;
        displayforteama(scoreteama);
}
    public void display1point(View view) {
        scoreteama = scoreteama + 1;
        displayforteama(scoreteama);
    }








    public void displayforteamb(int score){
        TextView scoreView=(TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void display3pointsb(View view){
        scoreteamb = scoreteamb + 3;
        displayforteamb(scoreteamb);
    }
    public void display2pointsb(View view){
        scoreteamb = scoreteamb + 2;
        displayforteamb(scoreteamb);
    }
    public void display1pointb(View view) {
        scoreteamb = scoreteamb + 1;
        displayforteamb(scoreteamb);
    }


    public void resetscore(View v){
        scoreteama=0;
        scoreteamb=0;
        displayforteama(scoreteama);
        displayforteamb(scoreteamb);
    }
}

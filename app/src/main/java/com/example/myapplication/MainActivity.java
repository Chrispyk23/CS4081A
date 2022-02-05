package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;



import android.app.Activity;
import android.content.Intent;


public class MainActivity extends Activity implements View.OnClickListener {

    Button Rock, Paper, Scissors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Rock = (Button)findViewById(R.id.R_Button);
        Paper = (Button)findViewById(R.id.P_Button);
        Scissors = (Button)findViewById(R.id.S_Button);

        Rock.setOnClickListener(this);
        Paper.setOnClickListener(this);
        Scissors.setOnClickListener(this);
    }


    @Override
    public void onClick(View buttonChosen) {
        Intent i = new Intent(this, Weapon.class);
        Random r = new Random();
        int U_Choice = r.nextInt(3);

        if (buttonChosen == Rock) {
            i.putExtra("userChoice", "rock");
        }
        if (buttonChosen == Paper) {
            i.putExtra("userChoice", "paper");
        }
        if (buttonChosen == Scissors) {
            i.putExtra("userChoice", "scissors");
        }

        if (U_Choice == 1) {
            i.putExtra("U_Choice", "rock");
        }
        if (U_Choice == 2) {
            i.putExtra("U_Choice", "paper");
        }
        if (U_Choice == 3) {
            i.putExtra("U_Choice", "scissors");
        }

        this.startActivity(i);
    }
}
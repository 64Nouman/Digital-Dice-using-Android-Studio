package com.example.digitaldice;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private ImageView dice;

    Random rand=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dice=findViewById(R.id.imageView);
        Button roll = findViewById(R.id.button);

        roll.setOnClickListener(view -> rollDice());




    }
    private void rollDice(){
         int value=1+rand.nextInt(6);
         switch(value){
             case 1:
                 dice.setImageResource(R.drawable.dice1);
                 break;
             case 2:
                 dice.setImageResource(R.drawable.dice2);
                 break;
             case 3:
                 dice.setImageResource(R.drawable.dice3);
                 break;
             case 4:
                 dice.setImageResource(R.drawable.dice4);
                 break;
             case 5:
                 dice.setImageResource(R.drawable.dice5);
                 break;
             case 6:
                 dice.setImageResource(R.drawable.dice6);
                 break;
         }
    }
}
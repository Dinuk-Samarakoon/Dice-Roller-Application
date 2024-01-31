package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //The findViewById() method finds the Button in the layout. R.id.button is the resource ID for the Button, which is a unique identifier for it.
        val rollButton: Button = findViewById(R.id.button)
        //Use the rollButton object and set a click listener on it by calling the setOnClickListener() method.
        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()
            rollDice()

        }
    }
    private fun rollDice(){
        val rolltext:TextView=findViewById(R.id.textView);

        val randomValue = Random.nextInt(6)+1
        rolltext.text=randomValue.toString()

        val diceImage:ImageView=findViewById(R.id.imageView2)
        val drawImage = when(randomValue){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            6->R.drawable.dice_6
            else->R.drawable.empty_dice
        }
        diceImage.setImageResource(drawImage as Int)
    }
    }


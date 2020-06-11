package com.abhishek.dicerollerchallenge

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.abhishek.dicerollerchallenge.R.drawable
import com.abhishek.dicerollerchallenge.R.id

class MainActivity : AppCompatActivity() {

    lateinit var rollButton: Button
    lateinit var diceImage: ImageView
    lateinit var diceImage2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        uiInit()

        rollButton.setOnClickListener { rollDice() }
    }

    private fun uiInit() {
        rollButton = findViewById(id.roll_button)
        diceImage = findViewById(id.dice_image)
        diceImage2 = findViewById(id.dice_image_2)
    }

    private fun rollDice() {
        diceImage.setImageResource(getRandomDiceImage((1..6).random()))
        diceImage2.setImageResource(getRandomDiceImage((1..6).random()))
    }

    private fun getRandomDiceImage(randomInt: Int): Int {
        val drawableResource = when (randomInt) {
            1 -> drawable.dice_1
            2 -> drawable.dice_2
            3 -> drawable.dice_3
            4 -> drawable.dice_4
            5 -> drawable.dice_5
            else -> drawable.dice_6
        }
        return drawableResource
    }
}
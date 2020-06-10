package com.abhishek.dicerollerchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.abhishek.dicerollerchallenge.R.id

class MainActivity : AppCompatActivity() {

    lateinit var rollButton: Button
    lateinit var countButton: Button
    lateinit var resultText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        uiInit()

        rollButton.setOnClickListener { rollDice() }
        countButton.setOnClickListener { countUp() }
    }

    private fun uiInit() {
        rollButton = findViewById(id.roll_button)
        countButton = findViewById(id.countup_button)
        resultText = findViewById(id.result_text)
    }

    private fun rollDice() {
        val randomInt= (1..6).random()

        resultText.text = randomInt.toString()
    }

    private fun countUp() {

        if (resultText.text == "Hello World!") {
            resultText.text = "1"
        } else {
            var resultInt = resultText.text.toString().toInt()

            if (resultInt != 6) {
                resultInt++
                resultText.text = resultInt.toString()
            }
        }
    }

}
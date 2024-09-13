package com.example.imad5112ass1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.text.isDigitsOnly

class MainActivity : AppCompatActivity() {

    lateinit var input: EditText
    lateinit var generate : Button
    lateinit var display: TextView
    lateinit var clear : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        input = findViewById(R.id.editTextinput)
        generate = findViewById(R.id.button3gen)
        display = findViewById(R.id.textViewdisplay)
        clear = findViewById(R.id.buttonclear)

        // Onclick button for generating history
        generate.setOnClickListener {
            val inputText = input.text.toString()

            // Check if input is a number
            if (inputText.isDigitsOnly()) {
                val age = inputText.toInt()

                display.text = when (age) {
                    36 -> "Lady Diana and Marilyn Monroe were 36 when they died"
                    78 -> "Mahatma Gandhi died at age 78"
                    48 -> "Whitney Houston died at age 48"
                    30 -> "Steve Biko died at age 30"
                    52 -> "William Shakespeare died at age 52"
                    57 -> "Ruth First died at age 57"
                    50 -> "Michael Jackson died at age 50"
                    54 -> "Osama Bin Laden died at 54"
                    40 -> "John Lennon died at 40"
                    95 -> "You are 95 years old, the same age as Nelson Mandela when he died."
                    else -> "There is no historical figure known to be around this age."
                }
            } else {
                // Display an error message if the input is not a number
                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show()
            }
        }

        //Clear button

        clear.setOnClickListener{
            input.text.clear()
            display.text= ""
        }
    }

}




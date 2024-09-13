package com.example.imad5112ass1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

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

        //onclick button

        generate.setOnClickListener{
            var age = 95

            display.text = when(age)
            {

                36-> "LadyDiana  and Marilyn monrose was 36 when she died"
               78-> "WMahatma Gandhi died at age of 78"
                48-> "Whitney Houston died at age 48"
                30-> "Steve Biko died at age of 30"
                52-> "William Shakespeare died at age of 52"
                57-> "Ruth First died at age of 57"
                50-> "Micheal Jackson died at age of 50"
                54 -> "Osama Bin Laden died at 54"
                40 -> "John Lennon died at 40"
                95-> "You are 95 years old. Which is the same age as Nelson mandela. Nelson mandela was a famous historical figure"
                else -> "There is no historical figure known to be around this years old"
            }
                    println(display)
            }

            //Clear button

            clear.setOnClickListener{
                input.text.clear()
                display.text= ""
            }
        }

    }




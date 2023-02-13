package com.example.checkbox

import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

    lateinit var radioGrp: RadioGroup
    lateinit var statusTV: TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val checkBox = findViewById<CheckBox>(android.R.id.checkbox)
        checkBox?.setOnCheckedChangeListener { buttonView, isChecked ->
            val msg =
                "You have " + (if (isChecked) "checked" else "unchecked") + " this Check it Checkbox."
            Toast.makeText(this@MainActivity, msg, Toast.LENGTH_SHORT).show()
        }
        radioGrp = findViewById(R.id.idRadioGroup)
        statusTV = findViewById(R.id.idTVStatus)

        radioGrp.setOnCheckedChangeListener { group, checkedId ->
            val radioButton = group
                .findViewById(checkedId) as RadioButton

            statusTV.text = radioButton.text
        }

    }
}
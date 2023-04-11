package com.basiccalculator

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.basiccalculator.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnAd: Button = findViewById(R.id.btnAdd)
        val btnSu: Button = findViewById(R.id.btnSub)
        val edtN1: EditText = findViewById(R.id.edtNo1)
        val edtN2: EditText = findViewById(R.id.edtNo2)

        btnAd.setOnClickListener {
            if (edtN1.text.toString() != "" && edtN2.text.toString() != "") {
                val no1 = edtN1.text.toString().toInt()
                val no2 = edtN2.text.toString().toInt()
                val sum = no1 + no2
                Toast.makeText(this, "The Sum is $sum", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Please Fill All the data", Toast.LENGTH_LONG).show()
            }
        }

        btnSu.setOnClickListener {
            if (edtN1.text.toString() != "" && edtN2.text.toString() != "") {
                val no1 = edtN1.text.toString().toInt()
                val no2 = edtN2.text.toString().toInt()
                val diff = no1 - no2
                Toast.makeText(this, "The Difference is $diff", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Please Fill All the data", Toast.LENGTH_LONG).show()
            }
        }
    }
}

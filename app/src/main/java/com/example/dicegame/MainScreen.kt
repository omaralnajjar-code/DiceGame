package com.example.dicegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_mainscreen.*

class MainScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainscreen)
    }
// Moves to Dice Game(GameScreen Activity)
    fun clickgamescreen(view: View) {
        if (startbtn.isClickable) {
            val myIntent = Intent(this, GameScreen::class.java)
            startActivity(myIntent)
        }
    }
    //OnClick Quit Function with AlertDialog with Yes,No and Cancel Options
        fun clickquit(view: View) {
            // Set a click listener for button widget
            quitbtn.setOnClickListener {
                // Initialize a new instance of
                val builder = AlertDialog.Builder(this@MainScreen)
                // Set the alert dialog title
                builder.setTitle("Quit")
                // Display a message on alert dialog
                builder.setMessage("Are you sure you want to quit?")
                // Set a positive button and its click listener on alert dialog
                builder.setPositiveButton("YES") { dialog, which ->
                    // Do something when user press the positive button
                    Toast.makeText(
                        applicationContext,
                        "You just quitted",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                // Display a negative button on alert dialog
                builder.setNegativeButton("No") { dialog, which ->
                    Toast.makeText(applicationContext, "No quit", Toast.LENGTH_SHORT)
                        .show()
                }
                // Display a neutral button on alert dialog
                builder.setNeutralButton("Cancel") { _, _ ->
                    Toast.makeText(
                        applicationContext,
                        "You cancelled the quit.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                // Finally, make the alert dialog using builder
                val dialog: AlertDialog = builder.create()
                // Display the alert dialog on app interface
                dialog.show()
            }
        }
    }

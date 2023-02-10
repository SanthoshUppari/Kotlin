package com.example.messagetestapp

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var button : Button
    lateinit var mylayout : ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        mylayout = findViewById(R.id.mylayout)

        button.setOnClickListener {

            Toast.makeText(applicationContext, "Welcome to msgs", Toast.LENGTH_LONG).show()

            Snackbar.make(mylayout, "Hi.. Welcome", Snackbar.LENGTH_INDEFINITE).setAction("close", View.OnClickListener {

            }).show()

            var alertdialog = AlertDialog.Builder(this@MainActivity)

            alertdialog.setTitle("Warning")
                .setMessage("Do u want to change the text")
                .setIcon(R.drawable.ic_round_warning_24)
                .setCancelable(false)
                .setNegativeButton("NO", DialogInterface.OnClickListener { dialogInterface, i ->
                    dialogInterface.cancel()
                })
                .setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
                    button.text = "changed..."
                })
            alertdialog.create().show()

        }
    }
}
package com.usk.mathbasicgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FinalActivity : AppCompatActivity() {

    lateinit var score : TextView
    lateinit var playButton : Button
    lateinit var exitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        score = findViewById(R.id.finalScoreTextView)
        playButton = findViewById(R.id.buttonPlay)
        exitButton = findViewById(R.id.buttonExit)

        val userScore = intent.getIntExtra("score" , 0)
        score.text = "Your score : " + userScore

        playButton.setOnClickListener {
            val intent = Intent(this@FinalActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        exitButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_MAIN)
            intent.addCategory(Intent.CATEGORY_HOME)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }

    }
}
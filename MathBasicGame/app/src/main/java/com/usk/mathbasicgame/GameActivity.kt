package com.usk.mathbasicgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.Locale
import kotlin.random.Random

class GameActivity : AppCompatActivity() {

    lateinit var textScore : TextView
    lateinit var textLife : TextView
    lateinit var textTime : TextView

    lateinit var  textQuestion : TextView
    lateinit var editTextAns : EditText

    lateinit var buttonOk : Button
    lateinit var buttonNext : Button

    var addResult = 0
    var score = 0
    var lifeCount = 5;

    lateinit var timer : CountDownTimer
    private val startTimerInMillis : Long = 20000
    var timeLeft : Long = startTimerInMillis

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        supportActionBar!!.title = "Addition"

        textScore = findViewById(R.id.scoreTextView)
        textLife = findViewById(R.id.lifeTextView)
        textTime = findViewById(R.id.timeTextView)

        textQuestion = findViewById(R.id.QTextView)
        editTextAns = findViewById(R.id.ansEditText)

        buttonOk = findViewById(R.id.okButton)
        buttonNext = findViewById(R.id.nextButton)

        generateQuestion()

        buttonOk.setOnClickListener {

            val input = editTextAns.text.toString()
            if(input == ""){
                Toast.makeText(applicationContext, "Plz enter answer...", Toast.LENGTH_LONG).show()
            }else{
                pauseTimer()
                var inputInt = input.toInt()

                if(addResult == inputInt){
                    score+=10
                    textQuestion.text = "Thats Correct answer..."
                    textScore.text = score.toString()
                }else{
                    lifeCount--
                    textLife.text = lifeCount.toString()
                    textQuestion.text = "Thats Wrong answer..."
                }

            }


        }

        buttonNext.setOnClickListener {
            pauseTimer()
            resetTimer()
            if(lifeCount == 0){
                Toast.makeText(applicationContext, "Game Over", Toast.LENGTH_LONG).show()
                val intent = Intent(this@GameActivity, FinalActivity::class.java)
                intent.putExtra("score", score)
                startActivity(intent)
                finish()
            }else{
                generateQuestion()
                editTextAns.setText("")
            }
        }

    }

    fun generateQuestion(){
        val num1 = Random.nextInt(1, 99)
        val num2 = Random.nextInt(1, 99)

        addResult = num1 + num2

        textQuestion.text = "$num1 + $num2"

        startTimer()
    }

    fun startTimer(){
        timer = object : CountDownTimer(timeLeft, 1000){
            override fun onTick(millisUntilFinish : Long) {
                timeLeft = millisUntilFinish
                updateText()
            }

            override fun onFinish() {
                pauseTimer()
                resetTimer()
                updateText()
                lifeCount--
                textLife.text = lifeCount.toString()
                textQuestion.text = "Your time is up!"
            }

        }.start()
    }

    fun pauseTimer(){
        timer.cancel()
    }

    fun resetTimer(){
        timeLeft = startTimerInMillis
        updateText()
    }

    fun updateText(){
        val remaingTime : Int = (timeLeft /1000).toInt()
        textTime.text = String.format(Locale.getDefault(), "%02d", remaingTime)
    }

}
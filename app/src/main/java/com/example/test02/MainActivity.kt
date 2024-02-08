package com.example.test02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // เมื่อปุ่ม Quiz App ถูกคลิก
    fun Button1(view: View) {
        val intent = Intent(this, QuizApp::class.java)
        startActivity(intent)
    }

    // เมื่อปุ่ม Calculator V2 ถูกคลิก
    fun Button2(view: View) {
        val intent = Intent(this, CalculatorV2::class.java)
        startActivity(intent)
    }

    fun Button3(view: View) {
    val intent = Intent(this, Login::class.java)
    startActivity(intent)
}
}



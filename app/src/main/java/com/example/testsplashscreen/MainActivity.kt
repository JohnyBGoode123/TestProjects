package com.example.testsplashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme) // Экран загрузки
        Thread.sleep(3000) // Задержка
        super.onCreate(savedInstanceState) // Запуск главной активности, где и должны подгружаться данные
        setContentView(R.layout.activity_main)
    }
}
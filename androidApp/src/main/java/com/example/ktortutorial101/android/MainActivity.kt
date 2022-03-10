package com.example.ktortutorial101.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ktortutorial101.Greeting
import android.widget.TextView
import com.example.ktortutorial101.ApiClient
import io.ktor.client.statement.*
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()

        MainScope().launch {
            println("response=[${ApiClient().tradesyHomePage()}]")
        }
    }
}

package com.example.mitsuhori_y.uranaiapplication.Activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.mitsuhori_y.uranaiapplication.Entity.Fortune
import com.example.mitsuhori_y.uranaiapplication.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById(R.id.FortuneButton).setOnClickListener {
            val resResult: Fortune = Fortune().getFortune()
            result.text = resResult.name
            description.text = resResult.description
        }
    }
}

package com.example.viewmodel

import MyViewModel
import ViewModelFactory
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var mainActivityViewModel:MyViewModel

    lateinit var textCounter :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        mainActivityViewModel=ViewModelProvider(this , ViewModelFactory(12)).get(MyViewModel::class.java)
        textCounter = findViewById<TextView>(R.id.counterText)
        setText()
    }



    fun increment(view : View){
        mainActivityViewModel.increment()
        setText()


    }
    fun setText(){
        textCounter.text=mainActivityViewModel.count.toString()
    }
}
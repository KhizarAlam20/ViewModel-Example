package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore

class MainActivity : AppCompatActivity() {

    lateinit var tvCount: TextView
    lateinit var count_btn: Button

    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        tvCount = findViewById(R.id.tvCount)
        count_btn = findViewById(R.id.count_btn)

        tvCount.text= viewModel.count.toString()


        count_btn.setOnClickListener {
            viewModel.increment()
            tvCount.text= viewModel.count.toString()
        }

    }
}
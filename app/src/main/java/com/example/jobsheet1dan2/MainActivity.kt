package com.example.jobsheet1dan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var nameEditText: EditText
    private lateinit var butttonButton: Button
    private lateinit var butttonTextView: TextView

    private fun initComponets(){
        nameEditText = findViewById(R.id.nameEditText)
        butttonButton = findViewById(R.id.buttonButton)
        butttonTextView = findViewById(R.id.buttonTextView) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.hello_world)
        initComponets()
        butttonTextView.text = resources.getString(R.string.app_name)

        butttonButton.setOnClickListener{
            val name = nameEditText.text.toString()
            butttonTextView.text = resources.getString(R.string.buttonTextView, name)

            resources.getStringArray(R.array.names).forEach {
                Log.i("PZN",it)
            }
        }
    }
}
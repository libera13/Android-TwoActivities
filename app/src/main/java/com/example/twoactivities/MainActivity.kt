package com.example.twoactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    private val LOG_TAG = MainActivity::class.qualifiedName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun launchSecondActivity(view: View) {
        Log.d(LOG_TAG, "click")
        val intent = Intent(this, SecondActivity::class.java)

        startActivity(intent);
    }
}
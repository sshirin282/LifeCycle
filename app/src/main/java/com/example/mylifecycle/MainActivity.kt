package com.example.mylifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            val intent = Intent(this, MainActivity2Live::class.java)
            startActivity(intent)
        }
        Log.e("onCreate>>>", "onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.e("onStart>>>", "onStart")
        Toast.makeText(this, "Start", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("onRestart>>>", "onRestart")
        Toast.makeText(this, "Restart", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Log.e("onResume>>>", "onResume")
        Toast.makeText(this, "Resume", Toast.LENGTH_LONG).show()

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy>>>", "onDestroy")
        Toast.makeText(this, "Destroy", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Log.e("onPause>>>", "onPause")
        Toast.makeText(this, "Pause", Toast.LENGTH_LONG).show()

    }

    override fun onStop() {
        super.onStop()
        Log.e("onStop>>>", "onStop")
        Toast.makeText(this, "stop", Toast.LENGTH_LONG).show()

    }


}

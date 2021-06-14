package com.example.mylifecycle

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class MainActivity2Live : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity2_live)
    }


   override fun onBackPressed() {

        val builder =
            AlertDialog.Builder(this)

        builder.setTitle("Save Or Not")
        builder.setMessage("Do you want to save this? ")
        builder.setPositiveButton("Yes")
        { dialog, id -> super.onBackPressed()
            finish()

        }
        builder.setNegativeButton("No")
        { dialog, id -> }
        builder.show()
    }
}
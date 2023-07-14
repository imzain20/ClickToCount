package com.example.hellotoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var show_count : TextView
    var count : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        show_count = findViewById(R.id.show_count)

    }

    fun showToast(view: View) {
        Toast.makeText(this, "Raised a Toast", Toast.LENGTH_SHORT).show()
    }
    fun countUp(view: View) {

        count++
        if(show_count!=null)
        {
            show_count.setText(Integer.toString(count))
        }

    }
}
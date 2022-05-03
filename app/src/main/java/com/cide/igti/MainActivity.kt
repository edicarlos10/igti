package com.cide.igti

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.cide.igti.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val tag: String = this.javaClass.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        Log.i(tag, "This is onCreate")

        binding.let {
            it.buttonClickHere.setOnClickListener {
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(tag, "This is onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(tag, "This is onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(tag, "This is onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(tag, "This is onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(tag, "This is onDestroy")
    }
}
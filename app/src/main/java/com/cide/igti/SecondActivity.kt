package com.cide.igti

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.cide.igti.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private val tag: String = this.javaClass.simpleName
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        Log.i(tag, "This is onCreate")
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
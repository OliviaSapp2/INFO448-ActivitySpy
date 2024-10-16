package edu.uw.ischool.osapp2.activityspy

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log

class MainActivity : AppCompatActivity() {
    val tag = "ActivitySpy"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Log.i(tag, "onCreate event fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(tag, "onDestroy event fired")
    }

    override fun onStart(){
        super.onStart()
        Log.i(tag, "onStart event fired")
    }

    override fun onStop(){
        super.onStop()
        Log.i(tag, "onStop event fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i(tag, "onPause event fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i(tag, "onResume event fired")
        Log.e(tag, "We're going down, Captain!")
    }
}
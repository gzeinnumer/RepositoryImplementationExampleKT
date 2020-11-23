package com.gzeinnumer.repositoryimplementationexamplekt

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.gzeinnumer.repositoryimplementationexamplekt.repository.MainVM

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    private val model: MainVM by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        model.data.observe(this, object : Observer<String>{
            override fun onChanged(s: String?) {
                Log.d(TAG, "onChanged: $s")
            }
        })
    }
}
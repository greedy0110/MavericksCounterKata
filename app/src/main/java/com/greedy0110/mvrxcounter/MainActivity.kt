package com.greedy0110.mvrxcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.greedy0110.mvrxcounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}
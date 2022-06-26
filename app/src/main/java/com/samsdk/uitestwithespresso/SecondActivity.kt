package com.samsdk.uitestwithespresso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.samsdk.uitestwithespresso.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()

    }

    private fun initViews() {
        binding.buttonBack.setOnClickListener {
            onBackPressed()
        }
    }
}
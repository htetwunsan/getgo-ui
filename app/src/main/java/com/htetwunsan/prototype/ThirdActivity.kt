package com.htetwunsan.prototype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ThirdActivity : AppCompatActivity() {

    private lateinit var backButton: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        backButton = findViewById(R.id.back)

        backButton.setOnClickListener {
            finish()
        }
    }
}
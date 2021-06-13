package com.htetwunsan.prototype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class SecondActivity : AppCompatActivity() {

    private lateinit var backButton: ImageView
    private lateinit var viewItem1: View
    private lateinit var viewItem2: View
    private lateinit var viewItem3: View
    private lateinit var viewItem4: View
    private lateinit var viewItem5: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        backButton = findViewById(R.id.back)
        backButton.setOnClickListener {
            finish()
        }

        viewItem1 = findViewById(R.id.view_item1)
        viewItem1.setOnClickListener {
            f()
        }

        viewItem2 = findViewById(R.id.view_item2)
        viewItem2.setOnClickListener {
            f()
        }

        viewItem3 = findViewById(R.id.view_item3)
        viewItem3.setOnClickListener {
            f()
        }

        viewItem4 = findViewById(R.id.view_item4)
        viewItem4.setOnClickListener {
            f()
        }

        viewItem5 = findViewById(R.id.view_item5)
        viewItem5.setOnClickListener {
            f()
        }
    }

    private fun f() {
        val intent = Intent(this, ThirdActivity::class.java)
        startActivity(intent)
    }
}
package com.htetwunsan.prototype

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.htetwunsan.prototype.databinding.ActivityFirstBinding

class FirstActivity : AppCompatActivity() {

    private lateinit var goButton: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        goButton = findViewById(R.id.go)
        goButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
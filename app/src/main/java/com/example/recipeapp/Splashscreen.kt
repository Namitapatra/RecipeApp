
package com.example.recipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler


@Suppress("DEPRECATION")

class Splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        Handler().postDelayed({

            val i = Intent(this@Splashscreen, MainActivity::class.java)

            startActivity(i)
            finish()
        }, 10000)
    }
}


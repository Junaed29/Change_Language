package com.example.changelanguage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set Language at beginning
        // Load from SharedPreference
        Utils.changeLanguage(AppPrefs(this).language,this)

        setContentView(R.layout.activity_main)


    }
}
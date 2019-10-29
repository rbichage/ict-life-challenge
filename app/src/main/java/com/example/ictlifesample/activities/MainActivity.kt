package com.example.ictlifesample.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ictlifesample.R
import com.example.ictlifesample.fragments.SelectGenderFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.layout_container, SelectGenderFragment())
            .addToBackStack(null)
            .commit()
    }
}

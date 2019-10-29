package com.example.ictlifesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ictlifesample.fragments.Question1Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.layout_container, Question1Fragment())
            .commit()
    }
}

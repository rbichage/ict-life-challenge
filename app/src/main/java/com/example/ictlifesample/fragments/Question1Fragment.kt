package com.example.ictlifesample.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ictlifesample.R
import kotlinx.android.synthetic.main.fragment_question_1.*

class Question1Fragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_question_1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        b_submit.setOnClickListener {
            fragmentManager!!.beginTransaction()
                .replace(R.id.layout_container, Question2Fragment())
                .commit()
        }
    }


}
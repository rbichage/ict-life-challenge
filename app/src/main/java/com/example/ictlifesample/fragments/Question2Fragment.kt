package com.example.ictlifesample.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ictlifesample.R
import com.example.ictlifesample.adapters.Question2Adapter
import kotlinx.android.synthetic.main.fragment_question_2.*

class Question2Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_question_2, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val choices = resources.getStringArray(R.array.personality_types)

        choices_recycler.layoutManager = LinearLayoutManager(requireContext())
        choices_recycler.adapter =
            Question2Adapter(requireContext(), choices)
        choices_recycler.hasFixedSize()

    }
}
package com.example.ictlifesample.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.ictlifesample.R
import kotlinx.android.synthetic.main.fragment_measurements.*

class MeasurementsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_measurements, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        shirtCard.setOnClickListener {

            when {
                shirtContent.visibility == View.GONE -> {
                    shirtContent.visibility = View.VISIBLE
                    shoesContent.visibility = View.GONE
                    pantsContent.visibility = View.GONE
                }

                else -> {
                    shirtContent.visibility = View.GONE
                }

            }


        }
        pantsCard.setOnClickListener {
            when {
                pantsContent.visibility == View.GONE -> {
                    shirtContent.visibility = View.GONE
                    shoesContent.visibility = View.GONE
                    pantsContent.visibility = View.VISIBLE
                }

                else -> {
                    pantsContent.visibility = View.GONE
                }

            }
        }
        shoesCard.setOnClickListener {
            when {
                shoesContent.visibility == View.GONE -> {
                    shirtContent.visibility = View.GONE
                    shoesContent.visibility = View.VISIBLE
                    pantsContent.visibility = View.GONE
                }

                else -> {
                    shoesContent.visibility = View.GONE
                }

            }
        }

        b_submit.setOnClickListener {
            Toast.makeText(requireContext(), "The end :)", Toast.LENGTH_SHORT).show()
        }
    }


}
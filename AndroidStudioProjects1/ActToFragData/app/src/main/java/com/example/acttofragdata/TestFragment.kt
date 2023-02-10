package com.example.acttofragdata

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class TestFragment : Fragment() {

    lateinit var textdata : TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_test, container, false)

        textdata = view.findViewById(R.id.textdata)

        var name = arguments?.getString("name").toString()
        Log.d("Activity data", name)
        textdata.text = "YOur name is "+ name.toString()

        return view
    }
}
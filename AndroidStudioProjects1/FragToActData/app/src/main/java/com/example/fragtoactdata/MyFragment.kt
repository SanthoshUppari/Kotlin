package com.example.fragtoactdata

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText


class MyFragment : Fragment() {

    lateinit var name : EditText
    lateinit var send : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view : View = inflater.inflate(R.layout.fragment_my, container, false)
        name = view.findViewById(R.id.name)
        send = view.findViewById(R.id.button)
        send.setOnClickListener {

            (activity as MainActivity).takeData(name.text.toString())
        }
        return view
    }

}
package com.example.fragtofragdata

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import org.w3c.dom.Text


class SecondFragment : Fragment() {

    lateinit var textdata : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view : View = inflater.inflate(R.layout.fragment_second, container, false)
        textdata = view.findViewById(R.id.textdata)
        textdata.text = arguments?.getString("name").toString()
        return view
    }

}
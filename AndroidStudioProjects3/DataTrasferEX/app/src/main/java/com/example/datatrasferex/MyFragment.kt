package com.example.datatrasferex

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MyFragment : Fragment() {

    lateinit var name : EditText
    lateinit var submit : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_my, container, false)

        /*name = view.findViewById(R.id.myname)
        submit = view.findViewById(R.id.mybutton)

        submit.setOnClickListener {
           var fm : FragmentManager = requireActivity().supportFragmentManager
            var ft : FragmentTransaction = fm.beginTransaction()
            Log.d(" SecondFrgTest ", "setOnClickListener: ")
            var scondFragment = SecondFragment()
            var bundle = Bundle()
            bundle.putString("name", name.text.toString())
            scondFragment.arguments = bundle

            ft.add(R.id.frameLayoutsecond,scondFragment)
            ft.commit()

        }*/
        return view
    }


}
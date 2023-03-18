package com.example.fragtofragdata

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


class FirstFragment : Fragment() {

    lateinit var name : EditText
    lateinit var send : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view : View = inflater.inflate(R.layout.fragment_first, container, false)
        name = view.findViewById(R.id.name)
        send = view.findViewById(R.id.send)

        send.setOnClickListener {

            var fm : FragmentManager = requireActivity().supportFragmentManager
            var ft : FragmentTransaction = fm.beginTransaction()
            var secondFragment = SecondFragment()

            var bundle = Bundle()
            bundle.putString("name", name.text.toString())
            secondFragment.arguments = bundle


            ft.replace(R.id.frame, secondFragment)
            ft.commit()

        }

        return view
    }

}
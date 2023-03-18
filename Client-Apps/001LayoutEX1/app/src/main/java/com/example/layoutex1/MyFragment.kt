package com.example.layoutex1

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class MyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d(" MyFragment ", "onCreateView: ")
        return inflater.inflate(R.layout.fragment_my, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(" MyFragment ", "onAttach: ")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(" MyFragment ", "onCreate: ")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(" MyFragment ", "onViewCreated: ")
    }

    override fun onStart() {
        super.onStart()
        Log.d(" MyFragment ", "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(" MyFragment ", "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(" MyFragment ", "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(" MyFragment ", "onStop: ")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(" MyFragment ", "onDestroyView: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(" MyFragment ", "onDestroy: ")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(" MyFragment ", "onDetach: ")
    }

}
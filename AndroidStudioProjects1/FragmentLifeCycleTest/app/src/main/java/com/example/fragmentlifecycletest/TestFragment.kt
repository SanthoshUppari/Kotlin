package com.example.fragmentlifecycletest

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class TestFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Fragment life", "onCreateView: ")
        return inflater.inflate(R.layout.fragment_test, container, false)
    }

    override fun onAttach(context: Context) {
        Log.d("Fragment life", "onAttach: ")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Fragment life", "onCreate: ")
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("Fragment life", "onViewCreated: ")
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onStart() {
        Log.d("Fragment life", "onStart: ")
        super.onStart()
    }

    override fun onResume() {
        Log.d("Fragment life", "onResume: ")
        super.onResume()
    }

    override fun onPause() {
        Log.d("Fragment life", "onPause: ")
        super.onPause()
    }

    override fun onStop() {
        Log.d("Fragment life", "onStop: ")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("Fragment life", "onDestroyView: ")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d("Fragment life", "onDestroy: ")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d("Fragment life", "onDetach: ")
        super.onDetach()
    }
}
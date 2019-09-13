package com.example.fragmentsapplication.Activity

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import com.example.fragmentsapplication.R
import com.example.fragmentsapplication.ViewModel.ResultsViewModel
import com.example.fragmentsapplication.databinding.ResultsFragmentBinding

class ResultsFragment : Fragment() {

    private lateinit var viewModel : ResultsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : ResultsFragmentBinding =
            DataBindingUtil.inflate(inflater,R.layout.results_fragment,container,false)
        viewModel = ViewModelProviders.of(this).get(ResultsViewModel::class.java)
        binding.result = viewModel.result
        binding.lifecycleOwner= this

        /*if (savedInstanceState!= null){
            result = savedInstanceState.getInt("result")
        }*/
        return binding.root

    }

    fun increment(){
        /*result += 1
        Log.d("jasperIncrement", result.toString())
        *//*Log.d("jasperLabel",editText.toString())*//*
        editText?.resultLabel?.setText(result.toString())*/

        viewModel.Increment()
    }
    fun decrement(){
        /*result-=1
        Log.d("jasperDecrement", result.toString())
        Log.d("jasperLabel",editText.toString())
        editText!!.resultLabel?.setText(result.toString())*/
        Log.d("jasper", viewModel.result)
        viewModel.Decrement()
    }

    /*override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("result" , result)
    }*/


}

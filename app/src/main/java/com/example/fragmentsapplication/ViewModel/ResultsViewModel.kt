package com.example.fragmentsapplication.ViewModel

import androidx.lifecycle.ViewModel

class ResultsViewModel : ViewModel() {
    var result : String = "0"

    fun Increment(){
        result = (result.toInt()+1).toString()
    }
    fun Decrement(){
        result = (result.toInt()-1).toString()
    }
}

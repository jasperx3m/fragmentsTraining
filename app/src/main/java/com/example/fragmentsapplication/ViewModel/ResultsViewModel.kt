package com.example.fragmentsapplication.ViewModel

import androidx.lifecycle.ViewModel

class ResultsViewModel : ViewModel() {
    var result : Int = 0

    fun Increment(){
        result ++
    }
    fun Decrement(){
        result --
    }
}

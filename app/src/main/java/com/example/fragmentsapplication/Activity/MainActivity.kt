package com.example.fragmentsapplication.Activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.fragmentsapplication.Listeners.MyOnClickListener
import com.example.fragmentsapplication.R

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MyOnClickListener {
    override fun onDecrementClick() {
        resultFragment.decrement()
    }

    override fun onIncrementClick() {
        resultFragment.increment()
    }
    private val buttonFragment = ButtonFragment()
    private val resultFragment = ResultsFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFragment(buttonFragment, fragment1.id)
        addFragment(resultFragment, fragment2.id)

    }

    fun addFragment(fragment: Fragment, id : Int ){
        var fragmentManager : FragmentManager = supportFragmentManager
        var fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(id,fragment)
        fragmentTransaction.commit()
    }
}

package com.example.fragmentsapplication.Activity

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentsapplication.Listeners.MyOnClickListener

import com.example.fragmentsapplication.R
import kotlinx.android.synthetic.main.fragment_button.view.*
import java.lang.ClassCastException

class ButtonFragment : Fragment() {

     var listener : MyOnClickListener? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try{
            listener = context as MyOnClickListener
        }catch(e: ClassCastException){
            throw ClassCastException(context?.toString()+
            " must implement MyOnClickListener")
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val inflater =inflater.inflate(R.layout.fragment_button, container, false)

        inflater.incrementBtn.setOnClickListener {
            listener!!.onIncrementClick()
        }
        inflater.decrementBtn.setOnClickListener{
            listener!!.onDecrementClick()
        }
        return inflater
    }

    override fun onDetach(){
        super.onDetach()
        listener = null
    }


}

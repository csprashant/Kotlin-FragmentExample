package com.example.kotlinfragmentexamplle

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class Right_Fragment():Fragment(){
lateinit var Tv:TextView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.right_fragment,container,false) as View
        Tv=view.findViewById(R.id.descriptionTxt)
        return view
    }
    public  fun  setDescription(msg:String){
        Tv.setText(msg)
    }

}
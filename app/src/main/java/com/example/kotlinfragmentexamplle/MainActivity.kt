package com.example.kotlinfragmentexamplle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainer
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity(),Left_Fragment.LeftInterfaceListener {
    lateinit var fm: FragmentManager
    lateinit var fT :FragmentTransaction
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFragmet()
    }
    fun addFragmet(){
        fm=supportFragmentManager
        fT=fm.beginTransaction()
        val right=Right_Fragment()
        val left=Left_Fragment()
        fT.add(R.id.left_frame,left)
        fT.add(R.id.right_frame,right)
        fT.commit()


   }
    override fun createDescription(msg: String) {
        val right:Right_Fragment=supportFragmentManager.findFragmentById(R.id.right_frame) as Right_Fragment
        if(right!=null)
            right.setDescription(msg)
    }
}
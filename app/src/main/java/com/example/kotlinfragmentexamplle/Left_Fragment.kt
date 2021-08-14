package com.example.kotlinfragmentexamplle

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment

class Left_Fragment() :Fragment(){
    lateinit var i1:ImageView
    lateinit var i2:ImageView
    lateinit var i3:ImageView
    lateinit var i4:ImageView
    lateinit var activityCommander:LeftInterfaceListener
public interface LeftInterfaceListener{
    fun createDescription(msg:String)
}
    override fun onAttach(context: Context) {
        super.onAttach(context)
        try{
            activityCommander=context as LeftInterfaceListener
        }catch (e:ClassCastException)
        {
            throw ClassCastException(context.toString())
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view=inflater.inflate(R.layout.left_fragment,container,false)
        i1=view.findViewById(R.id.image1)
        i2=view.findViewById(R.id.image2)
        i3=view.findViewById(R.id.image3)
        i4=view.findViewById(R.id.image4)
        i1.setOnClickListener {
            imageClick(view, R.id.image1)
        }
        i2.setOnClickListener {
            imageClick(view, R.id.image2)
        }

        i3.setOnClickListener {
            imageClick(view, R.id.image3)
        }

        i4.setOnClickListener {
            imageClick(view, R.id.image4)
        }


        return  view
    }
fun imageClick(view:View?,i:Int){
    if(i==R.id.image1)
        activityCommander.createDescription(i1.contentDescription.toString())
    else if(i==R.id.image2)
        activityCommander.createDescription(i2.contentDescription.toString())
    else if(i==R.id.image3)
        activityCommander.createDescription(i3.contentDescription.toString())
    else if(i==R.id.image4)
        activityCommander.createDescription(i4.contentDescription.toString())


}
}
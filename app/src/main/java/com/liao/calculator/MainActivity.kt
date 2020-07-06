package com.liao.calculator

//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.util.Log
//import android.view.View
//import android.widget.Toast
//import kotlinx.android.synthetic.main.activity_main.*
//import kotlinx.android.synthetic.main.activity_main.button_1
//
//
//class MainActivity : AppCompatActivity(), View.OnClickListener
// {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        init()
//    }
//
//    private fun init() {
//        // 1st way
////        button_1.setOnClickListener(object: View.OnClickListener{
////            override fun onClick(p0: View?) {
////                //Log.d("demo", "Button Clicked")
////                Toast.makeText(applicationContext, "Button Clicked", Toast.LENGTH_SHORT).show()
////            }
////        })
//
//        // 2nd way
////        button_1.setOnClickListener {
////            Toast.makeText(applicationContext, "Button Clicked", Toast.LENGTH_SHORT).show()
////        }
//
//        // 3rd way
//        button_1.setOnClickListener(this)
//        button_2.setOnClickListener(this)
//
//
//    }
//
//    override fun onClick(p0: View?) {
//         Toast.makeText(applicationContext, "Button Clicked", Toast.LENGTH_SHORT).show()
//    }
//
//
//
//    // 4th way
////    fun onMyButtonClick(view: View){
////        Toast.makeText(applicationContext, "Button Clicked", Toast.LENGTH_SHORT).show()
////    }
//
//
//}

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_user.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        init()

    }


    private fun init() {


        button_submit.setOnClickListener {
            var username = edit_text_name_1.text.toString()
            var userFragment = UserFragment.newInstance(username,null)
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, userFragment).addToBackStack("").commit()


        }






    }


}

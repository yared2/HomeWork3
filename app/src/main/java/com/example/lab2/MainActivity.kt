package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.lab2.R.id.name
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity()   {

    var foodList = ArrayList<String>(arrayListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun decide(view: View) {
        val randomValues =   Random.nextInt(0, foodList.size)
        textView2.text = foodList[randomValues]
    }

    fun add(view: View) {
val inputText:String = name.text.toString();
        if(inputText.isNullOrEmpty()){

            Toast.makeText(this,"no food selected",Toast.LENGTH_LONG).show()
        }else{
            foodList.add(inputText)
            textView2.text=inputText
        }

    }


}

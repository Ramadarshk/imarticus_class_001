package com.example.imarticus_class_01

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v , insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left , systemBars.top , systemBars.right , systemBars.bottom)
            insets
        }
    }

    fun onclicksignup(view: View) {
      /*  //var dailIntent:Intent=Intent(Intent.ACTION_CALL, Uri.parse("tel:98664135435"))
        val webIntent:Intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"))
        startActivity(webIntent)*/

        val name:EditText=findViewById(R.id.please_enter_name_here)
        val pin:EditText=findViewById(R.id.enter_pin_here)
        val age:EditText=findViewById(R.id.enter_age_here)
        val gendervg:RadioGroup=findViewById(R.id.gender)
        val mac=gendervg.checkedRadioButtonId
        val ide=findViewById<RadioButton>(mac)
        val checkbox1: CheckBox =findViewById(R.id.checkBox)
        val checkbox2: CheckBox =findViewById(R.id.checkBox2)
        val checkbox3: CheckBox =findViewById(R.id.checkBox3)
        val checkbox4: CheckBox =findViewById(R.id.checkBox4)
        val hobbies= retstr(checkbox1)+retstr(checkbox2)+retstr(checkbox3)+retstr(checkbox4)
        val from1ToHIntent:Intent=Intent(this,home::class.java)
        from1ToHIntent.putExtra("name",name.text.toString())
        from1ToHIntent.putExtra("pin",pin.text.toString())
        from1ToHIntent.putExtra("age",age.text.toString())
        from1ToHIntent.putExtra("gender",ide.text.toString())
        from1ToHIntent.putExtra("hobbies",hobbies)
        startActivity(from1ToHIntent)
        Log.i("Log in page", name.text.toString())
    }

    fun onclickcancel(view: View) {
        Log.i("Log in page","Cancel Button Clicked")
    }
}
private fun retstr(cb: CheckBox): String {
    if(cb.isChecked){
        return "${cb.text.toString()} \n"}
    else{
        return ""
    }
}
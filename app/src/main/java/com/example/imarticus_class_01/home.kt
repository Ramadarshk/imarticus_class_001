package com.example.imarticus_class_01

//import android.os.Build.VERSION_CODES.R
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v , insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left , systemBars.top , systemBars.right , systemBars.bottom)
            insets
        }
        val home:TextView=findViewById(R.id.namevr)
        val pin:TextView=findViewById(R.id.pinvr)
        val age:TextView=findViewById(R.id.agevr)
        val genders:TextView=findViewById(R.id.gendervr)
        val hobbies:TextView=findViewById(R.id.hobbiesvr)
        val mes=intent.extras
        home.text=mes?.getString("name")
        pin.text=mes?.getString("pin")
        age.text=mes?.getString("age")
        genders.text=mes?.getString("gender")
        hobbies.text=mes?.getString("hobbies")
       //Log.i("data",data.toString())

    }
}
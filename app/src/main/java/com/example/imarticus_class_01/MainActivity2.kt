package com.example.imarticus_class_01

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager


class MainActivity2 : AppCompatActivity() , AdapterView.OnItemSelectedListener {
    lateinit var scrollr: Spinner
    private val tag: String =MainActivity2::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v , insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left , systemBars.top , systemBars.right , systemBars.bottom)
//            insets
//        }
        val st_array:ArrayList<String> = arrayListOf("a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m")
         scrollr=findViewById(R.id.spinner)
        scrollr.onItemSelectedListener=this
        val recyclerView:RecyclerView=findViewById(R.id.file)
        recyclerView.adapter=adapter(st_array)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager=StaggeredGridLayoutManager(5,StaggeredGridLayoutManager.VERTICAL)


    }

    override fun onItemSelected(parent: AdapterView<*>? , view: View? , position: Int , id: Long) {
        val select= parent?.selectedItem.toString()
        Log.i(tag,select)
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {

    }

    fun gettext(view: View) {
        val edtext:EditText=findViewById(R.id.edit)
        val vtext:TextView=findViewById(R.id.textView8)
        vtext.text=edtext.text
    }

}
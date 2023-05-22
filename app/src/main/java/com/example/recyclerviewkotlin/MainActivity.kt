package com.example.recyclerviewkotlin

import android.graphics.drawable.GradientDrawable.Orientation
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding
    private lateinit var adapter: ListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        adapter = ListAdapter(Constant.getData(),this)
        mainBinding.rv1.layoutManager= LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        mainBinding.rv1.adapter= adapter



    }
}
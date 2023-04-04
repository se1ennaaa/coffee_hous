package com.example.dz_7_java3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dz_7_java3.Menu.MenuAdapter
import com.example.dz_7_java3.Menu.MenuModel
import com.example.dz_7_java3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var adapter: MenuAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        feelRecyclerView()

    }

    private fun feelRecyclerView() {
        var arrayList: ArrayList<MenuModel> = ArrayList()
        arrayList.add(MenuModel(200,"Америкно",R.drawable.amerikano))
        arrayList.add(MenuModel(170,"Латте",R.drawable.latte))
        arrayList.add(MenuModel(150,"Капучино",R.drawable.capuch))
        arrayList.add(MenuModel(200,"Эспрессо", R.drawable.espresso))
        arrayList.add(MenuModel(200,"Лунго",R.drawable.lungo))
        arrayList.add(MenuModel(200,"Мокко", R.drawable.mokko))
        arrayList.add(MenuModel(200,"Раф", R.drawable.raf))
        arrayList.add(MenuModel(200,"Гляссе",R.drawable.glasse ))
        adapter=MenuAdapter(arrayList){cofe->
           val intent = Intent(this , ContainerActivity :: class.java)
            intent.putExtra("Menu", cofe)
            startActivity(intent)
        }

        binding.recyclerView.adapter = adapter


    }

}
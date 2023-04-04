package com.example.dz_7_java3.Menu

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dz_7_java3.databinding.ItenMenuBinding

class MenuAdapter(
    var arrayListMenu: ArrayList<MenuModel>,
val onMenuClick : (MenuModel)-> Unit
    )
    : RecyclerView.Adapter<MenuAdapter.MenuVeiwHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuVeiwHolder {
        return MenuVeiwHolder(ItenMenuBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: MenuVeiwHolder, position: Int) {
        holder.onBind(arrayListMenu[position])
        holder.itemView.setOnClickListener {
            onMenuClick(arrayListMenu[position])
        }
    }

    override fun getItemCount(): Int {
        return arrayListMenu.size
    }


    class MenuVeiwHolder(private val binding : ItenMenuBinding) : RecyclerView.ViewHolder(binding.root){

    fun onBind(menu: MenuModel){
        binding.textView.text = "Кофе: "+ menu.name
        binding.priceView.text =  "Цена: " + menu.price.toString()
        binding.imageMenu.setImageResource(menu.img)
    }
    }


}
package com.example.dz_7_java3.Menu


import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
   data  class MenuModel(
    var price : Int,
    var name : String,
    var img: Int
) : Parcelable

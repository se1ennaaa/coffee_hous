package com.example.dz_7_java3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dz_7_java3.Menu.MenuModel

class ContainerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_container)

        val menuModel: MenuModel? = intent.getParcelableExtra("coffe")!!
        val bundle = Bundle()
        bundle.putParcelable("coffe", menuModel)
        val detailFragment = DetailFragment()
        detailFragment.arguments = bundle

        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container_view,
                detailFragment).commit()
    }
}

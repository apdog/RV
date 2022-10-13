package com.puhovdev.myapplicationrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.puhovdev.myapplicationrv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var listOfProduct = ArrayList<Product>()
    private var adapter = MyRecyclerAdapter(listOfProduct)
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listOfProduct.add(Product("Яблоко","Небольшое красное яблоко. Хорошо подходит для завтрака.", R.drawable.ic_launcher_background))
        listOfProduct.add(Product("Яблоко","Небольшое красное яблоко. Хорошо подходит для завтрака.", R.drawable.ic_launcher_background))
        listOfProduct.add(Product("Яблоко","Небольшое красное яблоко. Хорошо подходит для завтрака.", R.drawable.ic_launcher_background))
        listOfProduct.add(Product("Яблоко","Небольшое красное яблоко. Хорошо подходит для завтрака.", R.drawable.ic_launcher_background))
        listOfProduct.add(Product("Яблоко","Небольшое красное яблоко. Хорошо подходит для завтрака.", R.drawable.ic_launcher_background))
        listOfProduct.add(Product("Яблоко","Небольшое красное яблоко. Хорошо подходит для завтрака.", R.drawable.ic_launcher_background))
        listOfProduct.add(Product("Яблоко","Небольшое красное яблоко. Хорошо подходит для завтрака.", R.drawable.ic_launcher_background))
        init()
    }

    private fun init() = with(binding) {
        recyclerView.adapter = adapter
    }
}
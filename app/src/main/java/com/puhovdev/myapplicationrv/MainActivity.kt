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

        listOfProduct.add(Product("Яблоко","Небольшое красное яблоко. Хорошо подходит для завтрака.",
            R.drawable.apple
        ))
        listOfProduct.add(Product("Черешня","Спелая, Сладкая невероятно вкусная. Заберай скорее пока не кончилась.",
            R.drawable.wildberries
        ))
        listOfProduct.add(Product("Кот","Молодой котяра, ищущий дом и заботу", R.drawable.cat))
        listOfProduct.add(Product("iPhone","Дорогой бесполезный телефон в настоящее время",
            R.drawable.iphone
        ))
        listOfProduct.add(Product("Котлета","Обожаю их, правда с каждым днем все сложнее отыскать достойную", R.drawable.ic_launcher_background))
        listOfProduct.add(Product("Молоко","Пейте, говорят для здоровья полезно. Хотя веселья от него мало.",
            R.drawable.milk
        ))
        listOfProduct.add(Product("Книга","Учиться никогда не поздно, а книга вам в помощь.",
            R.drawable.book
        ))
        init()
    }

    fun getIndex():Int = with(binding) {
        return index.text.toString().toInt()
    }

    private fun randomProduct(): Product { return listOfProduct.random() }

    private fun init() = with(binding) {
        recyclerView.adapter = adapter
        btnAdd.setOnClickListener {
            adapter.list.add(randomProduct())
            adapter.notifyItemInserted(getIndex())
        }
        btnChange.setOnClickListener {
            adapter.list[getIndex()] = randomProduct()
            adapter.notifyItemChanged(getIndex())
        }
        btnRemove.setOnClickListener {
            adapter.list.removeAt(getIndex())
            adapter.notifyItemRemoved(getIndex())
        }
    }
}
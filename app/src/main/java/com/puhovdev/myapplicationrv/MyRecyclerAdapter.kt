package com.puhovdev.myapplicationrv

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.puhovdev.myapplicationrv.databinding.ItemLayoutBinding

class MyRecyclerAdapter(val list: ArrayList<Product>): RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder>() {

    private var productList = list

    class MyViewHolder(val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.productNameTv.text = productList[position].productName
        holder.binding.descriptionProductTv.text = productList[position].productDescription
        holder.binding.imageTv.setImageResource(productList[position].productImage)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

}

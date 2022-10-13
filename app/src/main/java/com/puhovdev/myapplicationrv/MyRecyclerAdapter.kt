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
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<Product>) {
        productList = arrayListOf()
        notifyDataSetChanged()
    }
}
//class UserAdapter : RecyclerView.Adapter<UserAdapter.ViewHolder>() {
//    private var userList = emptyList<UserModel>()
//
//    inner class ViewHolder(val binding: ItemUserLayoutBinding): RecyclerView.ViewHolder(binding.root)
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        return ViewHolder(
//            ItemUserLayoutBinding.inflate(
//                LayoutInflater.from(parent.context),
//                parent,
//                false
//            )
//        )
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        holder.binding.tvFirstName.text = userList[position].firstName
//        holder.binding.tvLastName.text  = userList[position].lastName
//    }
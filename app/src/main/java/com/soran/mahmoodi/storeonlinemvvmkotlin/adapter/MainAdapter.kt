package com.soran.mahmoodi.storeonlinemvvmkotlin.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.soran.mahmoodi.storeonlinemvvmkotlin.R
import com.soran.mahmoodi.storeonlinemvvmkotlin.databinding.RawMainProductBinding
import com.soran.mahmoodi.storeonlinemvvmkotlin.model.Products
import javax.inject.Inject

class MainAdapter constructor( private var products: List<Products>) :
    RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

  /*  fun getProducts(products: List<Products>) {
        this.products.clear()
        this.products.addAll(products)
        notifyDataSetChanged()
    }*/

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        var layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        var rawMainProductBinding: RawMainProductBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.raw_main_product, parent, false)
        return MainViewHolder(rawMainProductBinding)
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bindProduct(products[position])
    }

    inner class MainViewHolder(private var binding: RawMainProductBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindProduct(products: Products) {
            binding.product = products
            binding.executePendingBindings()
        }
    }

}



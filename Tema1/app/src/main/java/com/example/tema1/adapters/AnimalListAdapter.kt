package com.example.tema1.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tema1.helpers.extensions.logErrorMessage
import com.example.tema1.models.AnimalModel

class AnimalListAdapter(
    private val items: List<AnimalModel>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun getItemCount() = items.size

    override fun getItemViewType(position: Int): Int = items[position].origin.key


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        "onCreateViewHolder".logErrorMessage("AnimalListAdapter")
        return when(viewType) {
            CartItemType.PRODUCT.key -> {
                val view = inflater.inflate(R.layout.item_product_cell, parent, false)
                ProductViewHolder(view)
            }
            CartItemType.CATEGORY.key -> {
                val view = inflater.inflate(R.layout.item_category_cell, parent, false)
                CategoryViewHolder(view)
            }
            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

}
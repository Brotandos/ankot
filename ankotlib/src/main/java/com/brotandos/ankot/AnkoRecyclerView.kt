package com.brotandos.ankot

import android.view.View
import android.view.ViewGroup
import android.support.v7.widget.RecyclerView

/**
 * @author: Brotandos
 * @date: 22.02.2018.
 */
fun buildAdapter (
        items: List<Any>,
        onCreateHolder: (ViewGroup?, Int) -> RecyclerView.ViewHolder
) = object : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int) = onCreateHolder(parent, viewType)
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {}
    override fun getItemCount() = items.size
    override fun getItemViewType(position: Int) = position
}


fun buildAdapter (
        itemCount: () -> Int,
        onCreateHolder: (ViewGroup?, Int) -> RecyclerView.ViewHolder
) = object : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int) = onCreateHolder(parent, viewType)
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {}
    override fun getItemCount() = itemCount()
    override fun getItemViewType(position: Int) = position
}


class DefaultViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
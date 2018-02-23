package com.brotandos.ankot

import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.view.ViewGroup
import android.support.v7.widget.RecyclerView
import android.view.ViewManager
import org.jetbrains.anko.AnkoViewDslMarker
import org.jetbrains.anko.custom.ankoView

/**
 * @author: Brotandos
 * @date: 22.02.2018.
 */
val linear: RecyclerView.() -> Unit = {
    layoutManager = LinearLayoutManager(context)
}


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


fun ViewManager.recyclerView (vararg initializations: (@AnkoViewDslMarker RecyclerView).() -> Unit)
= ankoView({ RecyclerView(it) }, theme = 0) { for(init in initializations) init() }
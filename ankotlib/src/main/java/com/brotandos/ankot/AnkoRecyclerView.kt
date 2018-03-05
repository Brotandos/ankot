package com.brotandos.ankot

import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.view.ViewGroup
import android.support.v7.widget.RecyclerView
import android.view.ViewManager
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.AnkoContextImpl
import org.jetbrains.anko.AnkoViewDslMarker
import org.jetbrains.anko.custom.ankoView

/**
 * @author: Brotandos
 * @date: 22.02.2018.
 */
val linear: RecyclerView.() -> Unit = {
    layoutManager = LinearLayoutManager(context)
}

/**
 * WARNING, must be called after layout manager set
 * */
val itemPrefetchDisabled: RecyclerView.() -> Unit = {
    layoutManager.isItemPrefetchEnabled = false
}


fun <T> forItems (
        items: List<T>,
        holderView: AnkoContext<ViewGroup>.(Int) -> Unit
) : RecyclerView.() -> Unit = {
    adapter = object : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {}
        override fun getItemCount() = items.size
        override fun getItemViewType(position: Int) = position
        override fun onCreateViewHolder(parent: ViewGroup, position: Int)
        = object : RecyclerView.ViewHolder(
                AnkoContextImpl(context, parent, false)
                        .apply { holderView(position) }.view
        ) {}
    }
}


@Deprecated("Deprecated due to code design reasons")
fun buildAdapter (
        items: List<Any>,
        onCreateHolder: (ViewGroup, Int) -> RecyclerView.ViewHolder
) = object : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, position: Int) = onCreateHolder(parent, position)
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {}
    override fun getItemCount() = items.size
    override fun getItemViewType(position: Int) = position
}


fun buildAdapter (
        onCreateHolder: (ViewGroup, Int) -> RecyclerView.ViewHolder,
        items: List<Any>
) = object : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = onCreateHolder(parent, viewType)
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {}
    override fun getItemCount() = items.size
    override fun getItemViewType(position: Int) = position
}


@Deprecated("Deprecated due to code design reasons")
fun buildAdapter (
        itemCount: () -> Int,
        onCreateHolder: (ViewGroup, Int) -> RecyclerView.ViewHolder
) = object : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = onCreateHolder(parent, viewType)
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {}
    override fun getItemCount() = itemCount()
    override fun getItemViewType(position: Int) = position
}


fun buildAdapter (
        onCreateHolder: (ViewGroup, Int) -> RecyclerView.ViewHolder,
        itemCount: () -> Int
) = object : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = onCreateHolder(parent, viewType)
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {}
    override fun getItemCount() = itemCount()
    override fun getItemViewType(position: Int) = position
}


class DefaultViewHolder
@Deprecated("Due to support library update (27.1.0), use ViewGroup's extension viewHolder creation function")
constructor(itemView: View) : RecyclerView.ViewHolder(itemView)


fun ViewManager.recyclerView (vararg initializations: (@AnkoViewDslMarker RecyclerView).() -> Unit)
= ankoView({ RecyclerView(it) }, theme = 0) { for(init in initializations) init() }


fun ViewManager.recyclerView (
        vararg initializations: (@AnkoViewDslMarker RecyclerView).() -> Unit,
        additionalInit: (@AnkoViewDslMarker RecyclerView).() -> Unit
) = ankoView({ RecyclerView(it) }, theme = 0) {
    for(init in initializations) init()
    additionalInit()
}


fun ViewGroup.viewHolder(init: AnkoContext<ViewGroup>.() -> Unit)
= object : RecyclerView.ViewHolder(createView(init)) {}
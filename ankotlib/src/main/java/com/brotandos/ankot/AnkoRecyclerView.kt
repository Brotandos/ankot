package com.brotandos.ankot

import android.content.Context
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.view.ViewGroup
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import android.view.ViewManager
import android.view.animation.AnimationUtils
import android.view.animation.GridLayoutAnimationController
import android.view.animation.LayoutAnimationController
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

/**
 * Animation setting functions
 * */
fun anim(a: LayoutAnimationController): RecyclerView.() -> Unit = {
    layoutAnimation = a
}

fun anim(resId: Int): RecyclerView.() -> Unit = {
    layoutAnimation = AnimationUtils.loadLayoutAnimation(context, resId)
}

fun forItems (
        items: List<*>,
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


fun itemView (
        holderView: AnkoContext<ViewGroup>.(Int) -> Unit,
        itemCount: () -> Int
) : RecyclerView.() -> Unit = {
    adapter = object : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {}
        override fun getItemCount() = itemCount()
        override fun getItemViewType(position: Int) = position
        override fun onCreateViewHolder(parent: ViewGroup, position: Int)
        = object : RecyclerView.ViewHolder(
                AnkoContextImpl(context, parent, false)
                        .apply { holderView(position) }.view
        ) {}
    }
}


fun buildAdapterFor (
        items: List<*>,
        itemView: AnkoContext<ViewGroup>.(Int) -> Unit
) = object : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {}
    override fun getItemCount() = items.size
    override fun getItemViewType(position: Int) = position
    override fun onCreateViewHolder(parent: ViewGroup, position: Int)
    = object : RecyclerView.ViewHolder (
            AnkoContextImpl(parent.context, parent, false)
                    .apply { itemView(position) }.view
    ) {}
}

fun kAdapter (
        items: List<*>,
        itemView: KoatlContext<Context>.(Int) -> Unit
) = object : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {}
    override fun getItemCount() = items.size
    override fun getItemViewType(position: Int) = position
    override fun onCreateViewHolder(parent: ViewGroup, position: Int)
            = object : RecyclerView.ViewHolder (
            KoatlContextImpl(parent.context, parent.context, false)
                    .apply { itemView(position) }.view
    ) {}
}

@Deprecated("Use forItems instead")
fun buildAdapter (
        items: List<Any>,
        onCreateHolder: (ViewGroup, Int) -> RecyclerView.ViewHolder
) = object : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, position: Int) = onCreateHolder(parent, position)
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {}
    override fun getItemCount() = items.size
    override fun getItemViewType(position: Int) = position
}


@Deprecated("Use forItems instead")
fun buildAdapter (
        onCreateHolder: (ViewGroup, Int) -> RecyclerView.ViewHolder,
        items: List<Any>
) = object : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = onCreateHolder(parent, viewType)
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {}
    override fun getItemCount() = items.size
    override fun getItemViewType(position: Int) = position
}


@Deprecated("Use itemView instead")
fun buildAdapter (
        itemCount: () -> Int,
        onCreateHolder: (ViewGroup, Int) -> RecyclerView.ViewHolder
) = object : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = onCreateHolder(parent, viewType)
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {}
    override fun getItemCount() = itemCount()
    override fun getItemViewType(position: Int) = position
}


@Deprecated("Use itemView instead")
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


@Deprecated("Use ankoList instead")
fun ViewManager.recyclerView (vararg initializations: (@AnkoViewDslMarker RecyclerView).() -> Unit)
= ankoView({ RecyclerView(it) }, theme = 0) { for(init in initializations) init() }


@Deprecated("Use ankoList instead")
fun ViewManager.recyclerView (
        vararg initializations: (@AnkoViewDslMarker RecyclerView).() -> Unit,
        additionalInit: (@AnkoViewDslMarker RecyclerView).() -> Unit
) = ankoView({ RecyclerView(it) }, theme = 0) {
    for(init in initializations) init()
    additionalInit()
}


@Deprecated("Use forItems or itemView functions for adapter initializing")
fun ViewGroup.viewHolder(init: AnkoContext<ViewGroup>.() -> Unit)
= object : RecyclerView.ViewHolder(createView(init)) {}


class GridRecyclerView : RecyclerView {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {}

    override fun attachLayoutAnimationParameters(child: View, params: ViewGroup.LayoutParams,
                                                 index: Int, count: Int) {
        val layoutManager = layoutManager
        if (adapter != null && layoutManager is GridLayoutManager) {
            val animationParams =
                    if (params.layoutAnimationParameters == null) GridLayoutAnimationController.AnimationParameters()
                    else params.layoutAnimationParameters as GridLayoutAnimationController.AnimationParameters

            params.layoutAnimationParameters = animationParams

            // Next we are updating the parameters

            // Set the number of result in the RecyclerView and the index of this item
            animationParams.count = count
            animationParams.index = index

            // Calculate the number of columns and rows in the grid
            val columns = layoutManager.spanCount
            animationParams.columnsCount = columns
            animationParams.rowsCount = count / columns

            // Calculate the column/row position in the grid
            val invertedIndex = count - 1 - index
            animationParams.column = columns - 1 - invertedIndex % columns
            animationParams.row = animationParams.rowsCount - 1 - invertedIndex / columns

        } else {
            // Proceed as normal if using another type of LayoutManager
            super.attachLayoutAnimationParameters(child, params, index, count)
        }
    }
}
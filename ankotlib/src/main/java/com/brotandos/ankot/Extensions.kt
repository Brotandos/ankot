package com.brotandos.ankot

import android.graphics.drawable.Drawable
import android.view.View
import android.view.ViewGroup
import android.view.ViewManager
import android.view.animation.Animation
import android.widget.RadioButton
import org.jetbrains.anko.*

/**
 * @author: Brotandos
 * @date: 22.02.2018.
 */
fun ViewGroup.createView(init: AnkoContext<ViewGroup>.() -> Unit)
        = AnkoContextImpl(context, this, false).apply(init).view


inline fun <reified T: View> View.children() = childrenSequence() as Sequence<T>
inline fun <reified T: View> View.filteredChildren() = childrenSequence().filter { it is T } as Sequence<T>


inline operator fun <T: View> T.times(block: T.() -> Unit): T {
    block()
    return this
}


inline operator fun <T: ViewGroup.LayoutParams> T.times(block: T.() -> Unit): T {
    block()
    return this
}


inline operator fun <T: Animation> T.times(block: T.() -> Unit): T {
    block()
    return this
}


inline operator fun <T: Drawable> T.times(block: T.() -> Unit) : T {
    block()
    return this
}


inline operator fun <E: View> List<E>.times(block: E.() -> Unit) = forEach { it * block }


inline operator fun <E: View> Sequence<E>.times(block: E.() -> Unit) = forEach { it * block }
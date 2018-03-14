package com.brotandos.ankot

import android.graphics.drawable.Drawable
import android.view.View
import android.widget.CompoundButton
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.dip

/**
 * @author: Brotandos
 * @date: 23.02.2018.
 */

val visible: View.() -> Unit = {
    visibility = View.VISIBLE
}

val invisible: View.() -> Unit = {
    visibility = View.INVISIBLE
}

val hidden: View.() -> Unit = {
    visibility = View.GONE
}

val enabled: View.() -> Unit = {
    isEnabled = true
}

val disabled: View.() -> Unit = {
    isEnabled = false
}

val clickable: View.() -> Unit = {
    isClickable = true
}

val unclickable: View.() -> Unit = {
    isClickable = false
}

val checked: CompoundButton.() -> Unit = {
    isChecked = true
}

val unchecked: CompoundButton.() -> Unit = {
    isChecked = false
}

/**
 * Advice: use this, if view is inside recyclerView and has onClickListener property.
 * TODO add use example link
 * */
val View.index: Int get() = tag as Int

/**
 * 'bg' stands for 'background'
 * */
fun bg(drawable: Drawable): View.() -> Unit = {
    background = drawable
}

fun bg(res: Int): View.() -> Unit = {
    backgroundResource = res
}

/**
 * Listeners setting functions
 * */
@Deprecated("Use invoke function instead")
fun listen(listener: View.OnClickListener): View.() -> Unit = {
    setOnClickListener(listener)
}

@Deprecated("Use invoke function instead")
fun listen(listener: View.OnFocusChangeListener): View.() -> Unit = {
    onFocusChangeListener = listener
}

@Deprecated("Use invoke function instead")
fun listen(listener: View.OnTouchListener): View.() -> Unit = {
    setOnTouchListener(listener)
}

operator fun View.OnClickListener.invoke(): View.() -> Unit = {
    setOnClickListener(this@invoke)
}

operator fun View.OnFocusChangeListener.invoke(): View.() -> Unit = {
    onFocusChangeListener = this@invoke
}

operator fun View.OnTouchListener.invoke(): View.() -> Unit = {
    setOnTouchListener(this@invoke)
}

operator fun Int.invoke(): View.() -> Unit = {
    id = this@invoke
}

fun tag(t: Any): View.() -> Unit = {
    tag = t
}

operator fun Drawable.invoke(): View.() -> Unit = {
    background = this@invoke
}

/**
 * Padding settings functions
 * 'dp' stands for 'dip'
 * 'p' stands for 'padding'
 * 'c' stands for 'coefficient'
 * */
@Deprecated("Use p(c) instead")
fun dpP(c: Int): View.() -> Unit = {
    val value = context.dip(c)
    setPadding(value, value, value, value)
}

fun p(c: Int): View.() -> Unit = {
    setPadding(c, c, c, c)
}

@Deprecated("Use p(h, v) instead")
fun dpP(h: Int, v: Int): View.() -> Unit = {
    val dpHorizontal = context.dip(h)
    val dpVertical = context.dip(v)
    setPadding(dpHorizontal, dpVertical, dpHorizontal, dpVertical)
}

fun p(h: Int, v: Int): View.() -> Unit = {
    setPadding(h, v, h, v)
}

@Deprecated("Use p(l, t, r, b) instead")
fun dpP(l: Int, t: Int, r: Int, b: Int): View.() -> Unit = {
    setPadding(context.dip(l), context.dip(t), context.dip(r), context.dip(b))
}

fun p(l: Int, t: Int, r: Int, b: Int): View.() -> Unit = {
    setPadding(l, t, r, b)
}

@Deprecated("Use pLeft instead")
fun dpLeftP(c: Int): View.() -> Unit = {
    setPadding(dip(c), paddingTop, paddingRight, paddingBottom)
}

fun pLeft(c: Int): View.() -> Unit = {
    setPadding(c, paddingTop, paddingRight, paddingBottom)
}

@Deprecated("Use pTop instead")
fun dpTopP(c: Int): View.() -> Unit = {
    setPadding(paddingLeft, dip(c), paddingRight, paddingBottom)
}

fun pTop(c: Int): View.() -> Unit = {
    setPadding(paddingLeft, c, paddingRight, paddingBottom)
}

@Deprecated("Use pRight instead")
fun dpRightP(c: Int): View.() -> Unit = {
    setPadding(paddingLeft, paddingTop, dip(c), paddingBottom)
}

fun pRight(c: Int): View.() -> Unit = {
    setPadding(paddingLeft, paddingTop, c, paddingBottom)
}

@Deprecated("Use pBottom instead")
fun dpBottomP(c: Int): View.() -> Unit = {
    setPadding(paddingLeft, paddingTop, paddingRight, dip(c))
}

fun pBottom(c: Int): View.() -> Unit = {
    setPadding(paddingLeft, paddingTop, paddingRight, c)
}

@Deprecated("Use pHorizontal instead")
fun dpHorizontalP(c: Int): View.() -> Unit = {
    val value = context.dip(c)
    setPadding(value, paddingTop, value, paddingBottom)
}

fun pHorizontal(c: Int): View.() -> Unit = {
    setPadding(c, paddingTop, c, paddingBottom)
}

@Deprecated("Use pVertical instead")
fun dpVerticalP(c: Int): View.() -> Unit = {
    val value = context.dip(c)
    setPadding(paddingLeft, value, paddingRight, value)
}

fun pVertical(c: Int): View.() -> Unit = {
    setPadding(paddingLeft, c, paddingRight, c)
}
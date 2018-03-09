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
fun listen(listener: View.OnClickListener): View.() -> Unit = {
    setOnClickListener(listener)
}

fun listen(listener: View.OnFocusChangeListener): View.() -> Unit = {
    onFocusChangeListener = listener
}

fun listen(listener: View.OnTouchListener): View.() -> Unit = {
    setOnTouchListener(listener)
}

/**
 * Padding settings functions
 * 'dp' stands for 'dip'
 * 'p' stands for 'padding'
 * 'c' stands for 'coefficient'
 * */

fun dpP(c: Int): View.() -> Unit = {
    val value = context.dip(c)
    setPadding(value, value, value, value)
}

fun dpP(h: Int, v: Int): View.() -> Unit = {
    val dpHorizontal = context.dip(h)
    val dpVertical = context.dip(v)
    setPadding(dpHorizontal, dpVertical, dpHorizontal, dpVertical)
}

fun dpP(l: Int, t: Int, r: Int, b: Int): View.() -> Unit = {
    setPadding(context.dip(l), context.dip(t), context.dip(r), context.dip(b))
}

fun dpLeftP(c: Int): View.() -> Unit = {
    setPadding(dip(c), paddingTop, paddingRight, paddingBottom)
}

fun dpTopP(c: Int): View.() -> Unit = {
    setPadding(paddingLeft, dip(c), paddingRight, paddingBottom)
}

fun dpRightP(c: Int): View.() -> Unit = {
    setPadding(paddingLeft, paddingTop, dip(c), paddingBottom)
}

fun dpBottomP(c: Int): View.() -> Unit = {
    setPadding(paddingLeft, paddingTop, paddingRight, dip(c))
}

fun dpHorizontalP(c: Int): View.() -> Unit = {
    val value = context.dip(c)
    setPadding(value, paddingTop, value, paddingBottom)
}

fun dpVerticalP(c: Int): View.() -> Unit = {
    val value = context.dip(c)
    setPadding(paddingLeft, value, paddingRight, value)
}
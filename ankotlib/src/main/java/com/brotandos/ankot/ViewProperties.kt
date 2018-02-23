package com.brotandos.ankot

import android.graphics.drawable.Drawable
import android.view.View
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

/**
 * 'bg' stands for 'background'
 * */
fun View.bg(drawable: Drawable): View.() -> Unit = {
    background = drawable
}

/**
 * Listeners setting functions
 * */
fun View.listen(listener: View.OnClickListener): View.() -> Unit = {
    setOnClickListener(listener)
}

fun View.listen(listener: View.OnFocusChangeListener): View.() -> Unit = {
    onFocusChangeListener = listener
}

fun View.listen(listener: View.OnTouchListener): View.() -> Unit = {
    setOnTouchListener(listener)
}

/**
 * Padding settings functions
 * 'dp' stands for 'dip'
 * 'p' stands for 'padding'
 * 'c' stands for 'coefficient'
 * */

fun View.dpP(c: Int): View.() -> Unit = {
    val value = context.dip(c)
    setPadding(value, value, value, value)
}

fun View.dpP(h: Int, v: Int): View.() -> Unit = {
    val dpHorizontal = context.dip(h)
    val dpVertical = context.dip(v)
    setPadding(dpHorizontal, dpVertical, dpHorizontal, dpVertical)
}

fun View.dpP(l: Int, t: Int, r: Int, b: Int): View.() -> Unit = {
    setPadding(context.dip(l), context.dip(t), context.dip(r), context.dip(b))
}

fun View.dpLeftP(c: Int): View.() -> Unit = {
    setPadding(dip(c), paddingTop, paddingRight, paddingBottom)
}

fun View.dpTopP(c: Int): View.() -> Unit = {
    setPadding(paddingLeft, dip(c), paddingRight, paddingBottom)
}

fun View.dpRightP(c: Int): View.() -> Unit = {
    setPadding(paddingLeft, paddingTop, dip(c), paddingBottom)
}

fun View.dpBottomP(c: Int): View.() -> Unit = {
    setPadding(paddingLeft, paddingTop, paddingRight, dip(c))
}

fun View.dpHorizontalP(c: Int): View.() -> Unit = {
    val value = context.dip(c)
    setPadding(value, paddingTop, value, paddingBottom)
}

fun View.dpVerticalP(c: Int): View.() -> Unit = {
    val value = context.dip(c)
    setPadding(paddingLeft, value, paddingRight, value)
}
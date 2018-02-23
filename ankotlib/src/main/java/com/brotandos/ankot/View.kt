package com.brotandos.ankot

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
 * Padding settings functions
 * 'dp' stands for 'dip'
 * 'p' stands for 'padding'
 * 'c' stands for 'coefficient'
 * */

fun View.dpP(c: Int): () -> Unit = {
    val value = context.dip(c)
    setPadding(value, value, value, value)
}

fun View.dpP(h: Int, v: Int): () -> Unit = {
    val dpHorizontal = context.dip(h)
    val dpVertical = context.dip(v)
    setPadding(dpHorizontal, dpVertical, dpHorizontal, dpVertical)
}

fun View.dpP(l: Int, t: Int, r: Int, b: Int) = {
    setPadding(context.dip(l), context.dip(t), context.dip(r), context.dip(b))
}

fun View.dpLeftP(c: Int): () -> Unit = {
    setPadding(dip(c), paddingTop, paddingRight, paddingBottom)
}

fun View.dpTopP(c: Int): () -> Unit = {
    setPadding(paddingLeft, dip(c), paddingRight, paddingBottom)
}

fun View.dpRightP(c: Int): () -> Unit = {
    setPadding(paddingLeft, paddingTop, dip(c), paddingBottom)
}

fun View.dpBottomP(c: Int): () -> Unit = {
    setPadding(paddingLeft, paddingTop, paddingRight, dip(c))
}

fun View.dpHorizontalP(c: Int): () -> Unit = {
    val value = context.dip(c)
    setPadding(value, paddingTop, value, paddingBottom)
}

fun View.dpVerticalP(c: Int): () -> Unit = {
    val value = context.dip(c)
    setPadding(paddingLeft, value, paddingRight, value)
}
package com.brotandos.ankot

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Typeface
import android.text.InputType
import android.view.View
import android.view.ViewManager
import android.widget.TextView
import org.jetbrains.anko.AnkoViewDslMarker
import org.jetbrains.anko.custom.ankoView
import org.jetbrains.anko.dip
import org.jetbrains.anko.singleLine
import org.jetbrains.anko.textColor

/**
 * @author: Brotandos
 * @date: 22.02.2018.
 */
val underlined: TextView.() -> Unit = {
    paintFlags = Paint.UNDERLINE_TEXT_FLAG
}

val textBlack: TextView.() -> Unit = {
    textColor = Color.BLACK
}

val textCenter: TextView.() -> Unit = {
    textAlignment = View.TEXT_ALIGNMENT_CENTER
}

val password: TextView.() -> Unit = {
    inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
}

val bold: TextView.() -> Unit = {
    typeface = Typeface.DEFAULT_BOLD
}

val singleLine: TextView.() -> Unit = {
    singleLine = true
}

fun text(size: Float): TextView.() -> Unit = {
    textSize = dip(size).toFloat()
}

fun text(color: Int): TextView.() -> Unit = {
    textColor = color
}

fun hint(hint: CharSequence): TextView.() -> Unit = {
    this.hint = hint
}

/**
 * Icon setting functions
 * */
fun icLeft(iconRes: Int): TextView.() -> Unit = {
    setCompoundDrawablesWithIntrinsicBounds(iconRes, 0, 0, 0)
}

fun icRight(iconRes: Int): TextView.() -> Unit = {
    setCompoundDrawablesWithIntrinsicBounds(0, 0, iconRes, 0)
}

fun icLeftRight(leftIcon: Int, rightIcon: Int): TextView.() -> Unit = {
    setCompoundDrawablesWithIntrinsicBounds(leftIcon, 0, rightIcon, 0)
}

fun icTopRight(topIcon: Int, rightIcon: Int): TextView.() -> Unit = {
    setCompoundDrawablesWithIntrinsicBounds(0, topIcon, rightIcon, 0)
}
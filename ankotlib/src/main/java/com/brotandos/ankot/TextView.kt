package com.brotandos.ankot

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Typeface
import android.os.Build
import android.text.Editable
import android.text.Html
import android.text.InputType
import android.text.TextWatcher
import android.view.View
import android.widget.TextView
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

val multiLine: TextView.() -> Unit = {
    singleLine = false
}

val textInEnd: TextView.() -> Unit = {
    textAlignment = View.TEXT_ALIGNMENT_TEXT_END
}

val textInCenter: TextView.() -> Unit = {
    textAlignment = View.TEXT_ALIGNMENT_CENTER
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

fun html(text: String): TextView.() -> Unit = {
    this.text = if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) Html.fromHtml(text)
                else Html.fromHtml(text, Html.FROM_HTML_MODE_COMPACT)
}

fun <T: TextView> T.html(text: String) {
    this.text =
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) Html.fromHtml(text)
            else Html.fromHtml(text, Html.FROM_HTML_MODE_COMPACT)
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

fun dpIconP(c: Int): TextView.() -> Unit = {
    compoundDrawablePadding = dip(c)
}

fun textWatcher (
        beforeChanged: ((CharSequence?, Int, Int, Int) -> Unit)? = null,
        onChanged: ((CharSequence?, Int, Int, Int) -> Unit)? = null,
        afterChanged: ((Editable?) -> Unit)? = null
) = object : TextWatcher {

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        if (beforeChanged != null) beforeChanged(s, start, count, after)
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        if (onChanged != null) onChanged(s, start, before, count)
    }

    override fun afterTextChanged(s: Editable?) {
        if (afterChanged != null) afterChanged(s)
    }
}
package com.brotandos.ankot

import android.view.ViewManager
import android.widget.AutoCompleteTextView
import android.widget.RadioGroup
import org.jetbrains.anko.AnkoViewDslMarker
import org.jetbrains.anko.custom.ankoView

/**
 * @author: Brotandos
 * @date: 26.02.2018.
 */
fun ViewManager.textView(
        text: CharSequence?,
        vararg initializations: (@AnkoViewDslMarker android.widget.TextView).() -> Unit
): android.widget.TextView
= ankoView({ android.widget.TextView(it) }, theme = 0) {
    for (init in initializations) init()
    setText(text)
}

fun ViewManager.textView(
        text: Int,
        vararg initializations: (@AnkoViewDslMarker android.widget.TextView).() -> Unit
): android.widget.TextView
= ankoView({ android.widget.TextView(it) }, theme = 0) {
    for (init in initializations) init()
    setText(text)
}

fun ViewManager.textView (
        vararg initializations: (@AnkoViewDslMarker android.widget.TextView).() -> Unit
): android.widget.TextView
= ankoView({ android.widget.TextView(it) }, 0) { for (init in initializations) init() }


fun ViewManager.editText(
        vararg initializations: (@AnkoViewDslMarker android.widget.EditText).() -> Unit
) : android.widget.EditText
= ankoView({ android.widget.EditText(it) }, theme = 0) { for (init in initializations) init() }

fun ViewManager.editText(
        text: CharSequence?,
        vararg initializations: (@AnkoViewDslMarker android.widget.EditText).() -> Unit
): android.widget.EditText
= ankoView({ android.widget.EditText(it) }, theme = 0) {
    for (init in initializations) init()
    setText(text)
}

fun ViewManager.editText(
        text: Int,
        vararg initializations: (@AnkoViewDslMarker android.widget.EditText).() -> Unit
): android.widget.EditText
= ankoView({ android.widget.EditText(it) }, theme = 0) {
    for (init in initializations) init()
    setText(text)
}


fun ViewManager.suggestEdit (
        vararg initializations: (@AnkoViewDslMarker android.widget.AutoCompleteTextView).() -> Unit
) : android.widget.AutoCompleteTextView
= ankoView({ android.widget.AutoCompleteTextView(it) }, 0) { for (init in initializations) init() }

fun ViewManager.suggestEdit (
        text: CharSequence,
        vararg initializations: (@AnkoViewDslMarker android.widget.AutoCompleteTextView).() -> Unit
) : android.widget.AutoCompleteTextView
= ankoView({ android.widget.AutoCompleteTextView(it) }, 0) {
    for (init in initializations) init()
    setText(text)
}

fun ViewManager.suggestEdit (
        textRes: Int,
        vararg initializations: (@AnkoViewDslMarker android.widget.AutoCompleteTextView).() -> Unit
): android.widget.AutoCompleteTextView
= ankoView({ android.widget.AutoCompleteTextView(it) }, 0) {
    for (init in initializations) init()
    setText(textRes)
}


fun ViewManager.button (
        text: CharSequence?,
        vararg initializations: (@AnkoViewDslMarker android.widget.Button).() -> Unit
) : android.widget.Button = ankoView({ android.widget.Button(it) }, 0) {
    for (init in initializations) init()
    setText(text)
}


fun ViewManager.imageView (
        vararg initializations: (@AnkoViewDslMarker android.widget.ImageView).() -> Unit
) : android.widget.ImageView = ankoView({ android.widget.ImageView(it) }, 0) {
    for (init in initializations) init()
}


fun ViewManager.imageView (
        imageResource: Int,
        vararg initializations: (@AnkoViewDslMarker android.widget.ImageView).() -> Unit
) : android.widget.ImageView = ankoView({ android.widget.ImageView(it) }, 0) {
    for (init in initializations) init()
    setImageResource(imageResource)
}


inline fun ViewManager.ankoFrame(init: (@AnkoViewDslMarker AnkoFrameLayout).() -> Unit): android.widget.FrameLayout
= ankoView({ AnkoFrameLayout(it) }, theme = 0) { init() }

fun ViewManager.ankoFrame(vararg initializations: (@AnkoViewDslMarker AnkoFrameLayout).() -> Unit): android.widget.FrameLayout
= ankoView({ AnkoFrameLayout(it) }, theme = 0) { for (init in initializations) init() }


inline fun ViewManager.ankoVertical(init: (@AnkoViewDslMarker AnkoLinearLayout).() -> Unit): android.widget.LinearLayout
= ankoView({ AnkoLinearLayout(it) }, theme = 0) {
    init()
    orientation = android.widget.LinearLayout.VERTICAL
}

fun ViewManager.ankoVertical(vararg initializations: (@AnkoViewDslMarker AnkoLinearLayout).() -> Unit): android.widget.LinearLayout
= ankoView({ AnkoLinearLayout(it) }, theme = 0) {
    for (init in initializations) init()
    orientation = android.widget.LinearLayout.VERTICAL
}

inline fun ViewManager.ankoHorizontal(init: (@AnkoViewDslMarker AnkoLinearLayout).() -> Unit): android.widget.LinearLayout
= ankoView({ AnkoLinearLayout(it) }, theme = 0) {
    init()
    orientation = android.widget.LinearLayout.HORIZONTAL
}

fun ViewManager.ankoHorizontal(vararg initializations: (@AnkoViewDslMarker AnkoLinearLayout).() -> Unit): android.widget.LinearLayout
= ankoView({ AnkoLinearLayout(it) }, theme = 0) {
    for (init in initializations) init()
    orientation = android.widget.LinearLayout.HORIZONTAL
}

fun ViewManager.ankoRelative(init: (@AnkoViewDslMarker AnkoRelativeLayout).() -> Unit): android.widget.RelativeLayout
= ankoView({ AnkoRelativeLayout(it) }, 0) { init() }

fun ViewManager.ankoRelative(vararg initializations: (@AnkoViewDslMarker AnkoRelativeLayout).() -> Unit): android.widget.RelativeLayout
= ankoView({ AnkoRelativeLayout(it) }, 0) {
    for (init in initializations) init()
}

fun ViewManager.radioGroup(vararg initializations: (@AnkoViewDslMarker RadioGroup).() -> Unit): android.widget.RadioGroup
= ankoView({ android.widget.RadioGroup(it) }, 0) {
    for (init in initializations) init()
}

fun ViewManager.navView(vararg initializations: (@AnkoViewDslMarker android.support.design.widget.NavigationView).() -> Unit) : android.support.design.widget.NavigationView
= ankoView({ android.support.design.widget.NavigationView(it) }, 0) {
    for (init in initializations) init()
}

fun ViewManager.ankoList(vararg initializations: (@AnkoViewDslMarker android.support.v7.widget.RecyclerView).() -> Unit): android.support.v7.widget.RecyclerView
= ankoView({ android.support.v7.widget.RecyclerView(it) }, 0) {
    for (init in initializations) init()
}
package com.brotandos.ankot

import android.view.ViewManager
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


fun ViewManager.button (
        text: CharSequence?,
        vararg initializations: (@AnkoViewDslMarker android.widget.Button).() -> Unit
) : android.widget.Button = ankoView({ android.widget.Button(it) }, 0) {
    for (init in initializations) init()
    setText(text)
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

inline fun ViewManager.navView(vararg initializations: (@AnkoViewDslMarker android.support.design.widget.NavigationView).() -> Unit) : android.support.design.widget.NavigationView
= ankoView({ android.support.design.widget.NavigationView(it) }, 0) {
    for (init in initializations) init()
}
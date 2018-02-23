package com.brotandos.ankot

import android.view.ViewManager
import android.widget.EditText
import org.jetbrains.anko.AnkoViewDslMarker
import org.jetbrains.anko.custom.ankoView

/**
 * @author: Brotandos
 * @date: 23.02.2018.
 */
fun ViewManager.editText (
        text: CharSequence?,
        vararg initializations: (@AnkoViewDslMarker android.widget.EditText).() -> Unit
): android.widget.EditText = ankoView({ EditText(it) }, theme = 0) {
    for (init in initializations) init()
    setText(text)
}
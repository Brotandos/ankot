package com.brotandos.ankot

import android.support.v7.widget.RecyclerView
import android.view.ViewManager
import android.widget.RadioButton
import android.widget.RadioGroup
import org.jetbrains.anko.AnkoViewDslMarker
import org.jetbrains.anko._RadioGroup
import org.jetbrains.anko.custom.ankoView

/**
 * @author: Brotandos
 * @date: 26.02.2018.
 */
fun ViewManager.textView (
        text: CharSequence?,
        vararg initializations: (@AnkoViewDslMarker android.widget.TextView).() -> Unit
): android.widget.TextView = ankoView({ android.widget.TextView(it) }, theme = 0) {
    for (init in initializations) init()
    setText(text)
}

fun ViewManager.textView (
        text: CharSequence?,
        vararg initializations: (@AnkoViewDslMarker android.widget.TextView).() -> Unit,
        additionalInit: (@AnkoViewDslMarker android.widget.TextView).() -> Unit
): android.widget.TextView = ankoView({ android.widget.TextView(it) }, theme = 0) {
    for (init in initializations) init()
    additionalInit()
    setText(text)
}

fun ViewManager.textView (
        text: Int,
        vararg initializations: (@AnkoViewDslMarker android.widget.TextView).() -> Unit
): android.widget.TextView = ankoView({ android.widget.TextView(it) }, theme = 0) {
    for (init in initializations) init()
    setText(text)
}

fun ViewManager.textView (
        text: Int,
        vararg initializations: (@AnkoViewDslMarker android.widget.TextView).() -> Unit,
        additionalInit: (@AnkoViewDslMarker android.widget.TextView).() -> Unit
): android.widget.TextView = ankoView({ android.widget.TextView(it) }, theme = 0) {
    for (init in initializations) init()
    additionalInit()
    setText(text)
}

fun ViewManager.textView (
        vararg initializations: (@AnkoViewDslMarker android.widget.TextView).() -> Unit
): android.widget.TextView
= ankoView({ android.widget.TextView(it) }, 0) { for (init in initializations) init() }

fun ViewManager.textView (
        vararg initializations: (@AnkoViewDslMarker android.widget.TextView).() -> Unit,
        additionalInit: (@AnkoViewDslMarker android.widget.TextView).() -> Unit
): android.widget.TextView = ankoView({ android.widget.TextView(it) }, 0) {
    for (init in initializations) init()
    additionalInit()
}


fun ViewManager.editText (
        vararg initializations: (@AnkoViewDslMarker android.widget.EditText).() -> Unit
) : android.widget.EditText
= ankoView({ android.widget.EditText(it) }, theme = 0) { for (init in initializations) init() }

fun ViewManager.editText (
        vararg initializations: (@AnkoViewDslMarker android.widget.EditText).() -> Unit,
        additionalInit: (@AnkoViewDslMarker android.widget.EditText).() -> Unit
) : android.widget.EditText = ankoView({ android.widget.EditText(it) }, theme = 0) {
    for (init in initializations) init()
    additionalInit()
}

fun ViewManager.editText (
        text: CharSequence?,
        vararg initializations: (@AnkoViewDslMarker android.widget.EditText).() -> Unit
): android.widget.EditText
= ankoView({ android.widget.EditText(it) }, theme = 0) {
    for (init in initializations) init()
    setText(text)
}

fun ViewManager.editText (
        text: CharSequence?,
        vararg initializations: (@AnkoViewDslMarker android.widget.EditText).() -> Unit,
        additionalInit: (@AnkoViewDslMarker android.widget.EditText).() -> Unit
): android.widget.EditText = ankoView({ android.widget.EditText(it) }, theme = 0) {
    for (init in initializations) init()
    additionalInit()
    setText(text)
}

fun ViewManager.editText (
        text: Int,
        vararg initializations: (@AnkoViewDslMarker android.widget.EditText).() -> Unit
): android.widget.EditText = ankoView({ android.widget.EditText(it) }, theme = 0) {
    for (init in initializations) init()
    setText(text)
}

fun ViewManager.editText (
        text: Int,
        vararg initializations: (@AnkoViewDslMarker android.widget.EditText).() -> Unit,
        additionalInit: (@AnkoViewDslMarker android.widget.EditText).() -> Unit
): android.widget.EditText = ankoView({ android.widget.EditText(it) }, theme = 0) {
    for (init in initializations) init()
    additionalInit()
    setText(text)
}


fun ViewManager.suggestEdit (
        vararg initializations: (@AnkoViewDslMarker android.widget.AutoCompleteTextView).() -> Unit
) : android.widget.AutoCompleteTextView = ankoView({ android.widget.AutoCompleteTextView(it) }, 0) { for (init in initializations) init() }

fun ViewManager.suggestEdit (
        vararg initializations: (@AnkoViewDslMarker android.widget.AutoCompleteTextView).() -> Unit,
        additionalInit: (@AnkoViewDslMarker android.widget.AutoCompleteTextView).() -> Unit
) : android.widget.AutoCompleteTextView = ankoView({ android.widget.AutoCompleteTextView(it) }, 0) {
    for (init in initializations) init()
    additionalInit()
}

fun ViewManager.suggestEdit (
        text: CharSequence,
        vararg initializations: (@AnkoViewDslMarker android.widget.AutoCompleteTextView).() -> Unit
) : android.widget.AutoCompleteTextView = ankoView({ android.widget.AutoCompleteTextView(it) }, 0) {
    for (init in initializations) init()
    setText(text)
}

fun ViewManager.suggestEdit (
        text: CharSequence,
        vararg initializations: (@AnkoViewDslMarker android.widget.AutoCompleteTextView).() -> Unit,
        additionalInit: (@AnkoViewDslMarker android.widget.AutoCompleteTextView).() -> Unit
) : android.widget.AutoCompleteTextView = ankoView({ android.widget.AutoCompleteTextView(it) }, 0) {
    for (init in initializations) init()
    additionalInit()
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

fun ViewManager.suggestEdit (
        textRes: Int,
        vararg initializations: (@AnkoViewDslMarker android.widget.AutoCompleteTextView).() -> Unit,
        additionalInit: (@AnkoViewDslMarker android.widget.AutoCompleteTextView).() -> Unit
): android.widget.AutoCompleteTextView = ankoView({ android.widget.AutoCompleteTextView(it) }, 0) {
    for (init in initializations) init()
    additionalInit()
    setText(textRes)
}

fun ViewManager.button (
        vararg initializations: (@AnkoViewDslMarker android.widget.Button).() -> Unit
) : android.widget.Button
= ankoView({ android.widget.Button(it) }, 0) { for (init in initializations) init() }

fun ViewManager.button (
        vararg initializations: (@AnkoViewDslMarker android.widget.Button).() -> Unit,
        additionalInit: (@AnkoViewDslMarker android.widget.Button).() -> Unit
) : android.widget.Button = ankoView({ android.widget.Button(it) }, 0) {
    for (init in initializations) init()
    additionalInit()
}

fun ViewManager.button (
        text: CharSequence?,
        vararg initializations: (@AnkoViewDslMarker android.widget.Button).() -> Unit
) : android.widget.Button = ankoView({ android.widget.Button(it) }, 0) {
    for (init in initializations) init()
    setText(text)
}

fun ViewManager.button (
        text: CharSequence?,
        vararg initializations: (@AnkoViewDslMarker android.widget.Button).() -> Unit,
        additionalInit: (@AnkoViewDslMarker android.widget.Button).() -> Unit
) : android.widget.Button = ankoView({ android.widget.Button(it) }, 0) {
    for (init in initializations) init()
    additionalInit()
    setText(text)
}


fun ViewManager.radioButton (
        text: String
): android.widget.RadioButton = ankoView({ android.widget.RadioButton(it) }, 0) {
    this.text = text
}

fun ViewManager.radioButton (
        text: String, init: (@AnkoViewDslMarker RadioButton).() -> Unit
): android.widget.RadioButton = ankoView({ android.widget.RadioButton(it) }, 0) {
    this.text = text
    init()
}

fun ViewManager.radioButton (
        text: String,
        vararg initializations: (@AnkoViewDslMarker RadioButton).() -> Unit
): android.widget.RadioButton = ankoView({ android.widget.RadioButton(it) }, 0) {
    this.text = text
    initializations.forEach { it() }
}

fun ViewManager.radioButton (
        text: String,
        vararg initializations: (@AnkoViewDslMarker RadioButton).() -> Unit,
        additionalInit: (@AnkoViewDslMarker RadioButton).() -> Unit
): android.widget.RadioButton = ankoView({ android.widget.RadioButton(it) }, 0) {
    this.text = text
    initializations.forEach { it() }
    additionalInit()
}


fun ViewManager.imageView (
        vararg initializations: (@AnkoViewDslMarker android.widget.ImageView).() -> Unit
) : android.widget.ImageView = ankoView({ android.widget.ImageView(it) }, 0) {
    for (init in initializations) init()
}

fun ViewManager.imageView (
        vararg initializations: (@AnkoViewDslMarker android.widget.ImageView).() -> Unit,
        additionalInit: (@AnkoViewDslMarker android.widget.ImageView).() -> Unit
) : android.widget.ImageView = ankoView({ android.widget.ImageView(it) }, 0) {
    for (init in initializations) init()
    additionalInit()
}

fun ViewManager.imageView (
        imageResource: Int,
        vararg initializations: (@AnkoViewDslMarker android.widget.ImageView).() -> Unit
) : android.widget.ImageView = ankoView({ android.widget.ImageView(it) }, 0) {
    for (init in initializations) init()
    setImageResource(imageResource)
}

fun ViewManager.imageView (
        imageResource: Int,
        vararg initializations: (@AnkoViewDslMarker android.widget.ImageView).() -> Unit,
        additionalInit: (@AnkoViewDslMarker android.widget.ImageView).() -> Unit
) : android.widget.ImageView = ankoView({ android.widget.ImageView(it) }, 0) {
    for (init in initializations) init()
    additionalInit()
    setImageResource(imageResource)
}


inline fun ViewManager.ankoFrame (init: (@AnkoViewDslMarker AnkoFrameLayout).() -> Unit): android.widget.FrameLayout
= ankoView({ AnkoFrameLayout(it) }, theme = 0) { init() }

fun ViewManager.ankoFrame (vararg initializations: (@AnkoViewDslMarker AnkoFrameLayout).() -> Unit): android.widget.FrameLayout
= ankoView({ AnkoFrameLayout(it) }, theme = 0) { for (init in initializations) init() }

fun ViewManager.ankoFrame (
        vararg initializations: (@AnkoViewDslMarker AnkoFrameLayout).() -> Unit,
        additionalInit: (@AnkoViewDslMarker AnkoFrameLayout).() -> Unit
): android.widget.FrameLayout = ankoView({ AnkoFrameLayout(it) }, theme = 0) {
    for (init in initializations) init()
    additionalInit()
}


inline fun ViewManager.ankoVertical (
        init: (@AnkoViewDslMarker AnkoLinearLayout).() -> Unit
): android.widget.LinearLayout = ankoView({ AnkoLinearLayout(it) }, theme = 0) {
    init()
    orientation = android.widget.LinearLayout.VERTICAL
}

fun ViewManager.ankoVertical (
        vararg initializations: (@AnkoViewDslMarker AnkoLinearLayout).() -> Unit
): android.widget.LinearLayout = ankoView({ AnkoLinearLayout(it) }, theme = 0) {
    for (init in initializations) init()
    orientation = android.widget.LinearLayout.VERTICAL
}

fun ViewManager.ankoVertical (
        vararg initializations: (@AnkoViewDslMarker AnkoLinearLayout).() -> Unit,
        additionalInit: (@AnkoViewDslMarker AnkoLinearLayout).() -> Unit
): android.widget.LinearLayout = ankoView({ AnkoLinearLayout(it) }, theme = 0) {
    for (init in initializations) init()
    additionalInit()
    orientation = android.widget.LinearLayout.VERTICAL
}

inline fun ViewManager.ankoHorizontal (
        init: (@AnkoViewDslMarker AnkoLinearLayout).() -> Unit
): android.widget.LinearLayout = ankoView({ AnkoLinearLayout(it) }, theme = 0) {
    init()
    orientation = android.widget.LinearLayout.HORIZONTAL
}

fun ViewManager.ankoHorizontal (
        vararg initializations: (@AnkoViewDslMarker AnkoLinearLayout).() -> Unit
): android.widget.LinearLayout = ankoView({ AnkoLinearLayout(it) }, theme = 0) {
    for (init in initializations) init()
    orientation = android.widget.LinearLayout.HORIZONTAL
}

fun ViewManager.ankoHorizontal (
        vararg initializations: (@AnkoViewDslMarker AnkoLinearLayout).() -> Unit,
        additionalInit: (@AnkoViewDslMarker AnkoLinearLayout).() -> Unit
): android.widget.LinearLayout = ankoView({ AnkoLinearLayout(it) }, theme = 0) {
    for (init in initializations) init()
    additionalInit()
    orientation = android.widget.LinearLayout.HORIZONTAL
}


fun ViewManager.ankoRelative (init: (@AnkoViewDslMarker AnkoRelativeLayout).() -> Unit): android.widget.RelativeLayout
= ankoView({ AnkoRelativeLayout(it) }, 0) { init() }

fun ViewManager.ankoRelative (
        vararg initializations: (@AnkoViewDslMarker AnkoRelativeLayout).() -> Unit,
        additionalInit: (@AnkoViewDslMarker AnkoRelativeLayout).() -> Unit
): android.widget.RelativeLayout = ankoView({ AnkoRelativeLayout(it) }, 0) {
    for (init in initializations) init()
    additionalInit()
}


fun ViewManager.radioGroup (
        vararg initializations: (@AnkoViewDslMarker RadioGroup).() -> Unit
): android.widget.RadioGroup = ankoView({ android.widget.RadioGroup(it) }, 0) {
    for (init in initializations) init()
}

fun ViewManager.radioGroup (
        vararg initializations: (@AnkoViewDslMarker RadioGroup).() -> Unit,
        additionalInit: (@AnkoViewDslMarker RadioGroup).() -> Unit
): android.widget.RadioGroup = ankoView({ android.widget.RadioGroup(it) }, 0) {
    for (init in initializations) init()
    additionalInit()
}

fun ViewManager.radioGroup(
        orientation: Int,
        init: (@AnkoViewDslMarker _RadioGroup).() -> Unit
): android.widget.RadioGroup = ankoView({ _RadioGroup(it) }, 0) {
    init()
    this.orientation = orientation
}

fun ViewManager.radioGroup(
        orientation: Int,
        vararg initializations: (@AnkoViewDslMarker _RadioGroup).() -> Unit
): android.widget.RadioGroup = ankoView({ _RadioGroup(it) }, 0) {
    initializations.forEach { it() }
    this.orientation = orientation
}

fun ViewManager.radioGroup(
        orientation: Int,
        vararg initializations: (@AnkoViewDslMarker _RadioGroup).() -> Unit,
        additionalInit: (@AnkoViewDslMarker _RadioGroup).() -> Unit
): android.widget.RadioGroup = ankoView({ _RadioGroup(it) }, 0) {
    initializations.forEach { it() }
    additionalInit()
    this.orientation = orientation
}


fun ViewManager.navView (
        vararg initializations: (@AnkoViewDslMarker android.support.design.widget.NavigationView).() -> Unit,
        additionalInit: (@AnkoViewDslMarker android.support.design.widget.NavigationView).() -> Unit
) : android.support.design.widget.NavigationView = ankoView({ android.support.design.widget.NavigationView(it) }, 0) {
    for (init in initializations) init()
    additionalInit()
}

fun ViewManager.ankoList(vararg initializations: (@AnkoViewDslMarker android.support.v7.widget.RecyclerView).() -> Unit): android.support.v7.widget.RecyclerView
= ankoView({ android.support.v7.widget.RecyclerView(it) }, 0) {
    for (init in initializations) init()
}

fun ViewManager.ankoList (
        vararg initializations: (@AnkoViewDslMarker RecyclerView).() -> Unit,
        additionalInit: (@AnkoViewDslMarker RecyclerView).() -> Unit
) = ankoView({ RecyclerView(it) }, theme = 0) {
    for(init in initializations) init()
    additionalInit()
}
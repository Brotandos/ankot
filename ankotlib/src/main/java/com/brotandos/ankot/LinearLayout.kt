package com.brotandos.ankot

import android.view.Gravity
import android.widget.LinearLayout

/**
 * @author: Brotandos
 * @date: 23.02.2018.
 */
val contentCenter: LinearLayout.() -> Unit = {
    gravity = Gravity.CENTER
}

val contentEquator: LinearLayout.() -> Unit = {
    gravity = Gravity.CENTER_VERTICAL
}

val contentGreenwich: LinearLayout.() -> Unit = {
    gravity = Gravity.CENTER_HORIZONTAL
}
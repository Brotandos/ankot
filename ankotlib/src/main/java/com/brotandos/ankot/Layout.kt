package com.brotandos.ankot

import android.content.Context
import android.view.Gravity
import android.view.View
import android.view.ViewManager
import android.widget.FrameLayout
import android.widget.LinearLayout
import org.jetbrains.anko.*
import org.jetbrains.anko.custom.ankoView

/**
 * @author: Brotandos
 * @date: 22.02.2018.
 */

/*
    inline val center: .LayoutParams.() -> Unit
        get() = { gravity = Gravity.CENTER_HORIZONTAL or Gravity.CENTER_VERTICAL }
    inline val greenwich: .LayoutParams.() -> Unit
        get() = { gravity = Gravity.CENTER_HORIZONTAL }
    inline val equator: .LayoutParams.() -> Unit
        get() = { gravity = Gravity.CENTER_VERTICAL }
    inline val east: .LayoutParams.() -> Unit
        get() = { gravity = Gravity.END }
    inline val west: .LayoutParams.() -> Unit
        get() = { gravity = Gravity.START }
    inline val centerEast: .LayoutParams.() -> Unit
        get() = { gravity = Gravity.CENTER_VERTICAL or Gravity.END }
    inline val centerWest: .LayoutParams.() -> Unit
        get() = { gravity = Gravity.CENTER_VERTICAL or Gravity.START}
    inline val submissive: .LayoutParams.() -> Unit
        get() = { width = wrapContent; height = wrapContent }
    inline val row: .LayoutParams.() -> Unit
        get() = { width = matchParent; height = wrapContent }
    inline val column: .LayoutParams.() -> Unit
        get() = { width = wrapContent; height = matchParent }
    inline val dominant: .LayoutParams.() -> Unit
        get() = { width = matchParent; height = matchParent }

    /**
     * Margin setting functions
     * 'dp' stands for 'dip'
     * 'm' stands for 'margin'
     * 't' stands for 'top'
     * 'l' stands for 'left'
     * 'r' stands for 'right'
     * 'b' stands for 'bottom'
     * 'e' stands for 'end'
     * 's' stands for 'start'
     * 'c' stands for 'coefficient'
     * */
    fun dpM(c: Int): .LayoutParams.() -> Unit = {
        val value = dip(c)
        leftMargin = value
        rightMargin = value
        topMargin = value
        bottomMargin = value
    }
    fun dpM(l: Int, t: Int, r: Int, b: Int): .LayoutParams.() -> Unit = {
        setMargins(dip(l), dip(t), dip(r), dip(b))
    }
    fun dpHorizontalM(c: Int): .LayoutParams.() -> Unit = {
        val value = dip(c)
        marginStart = value
        marginEnd = value
    }
    fun dpVerticalM(c: Int): .LayoutParams.() -> Unit = {
        val value = dip(c)
        topMargin = value
        bottomMargin = value
    }
    fun dpTopM(c: Int): .LayoutParams.() -> Unit = {
        this.topMargin = dip(c)
    }
    fun dpBottomM(c: Int): .LayoutParams.() -> Unit = {
        this.bottomMargin = dip(c)
    }
    fun dpStartM(c: Int): .LayoutParams.() -> Unit = {
        this.marginStart = dip(c)
    }
    fun dpEndM(c: Int): .LayoutParams.() -> Unit = {
        this.marginEnd = dip(c)
    }

    fun <T: view> T.lparams(vararg params: .LayoutParams.() -> Unit) : T {
        layoutParams = .LayoutParams(wrapContent, wrapContent).apply {
            for (param in params) param()
        }
        return this
    }
*/

class AnkoFrameLayout(ctx: Context) : _FrameLayout(ctx) {
    inline val center: FrameLayout.LayoutParams.() -> Unit
        get() = { gravity = Gravity.CENTER_HORIZONTAL or Gravity.CENTER_VERTICAL }
    inline val greenwich: FrameLayout.LayoutParams.() -> Unit
        get() = { gravity = Gravity.CENTER_HORIZONTAL }
    inline val equator: FrameLayout.LayoutParams.() -> Unit
        get() = { gravity = Gravity.CENTER_VERTICAL }
    inline val east: FrameLayout.LayoutParams.() -> Unit
        get() = { gravity = Gravity.END }
    inline val west: FrameLayout.LayoutParams.() -> Unit
        get() = { gravity = Gravity.START }
    inline val centerEast: FrameLayout.LayoutParams.() -> Unit
        get() = { gravity = Gravity.CENTER_VERTICAL or Gravity.END }
    inline val centerWest: FrameLayout.LayoutParams.() -> Unit
        get() = { gravity = Gravity.CENTER_VERTICAL or Gravity.START}
    inline val submissive: FrameLayout.LayoutParams.() -> Unit
        get() = { width = wrapContent; height = wrapContent }
    inline val row: FrameLayout.LayoutParams.() -> Unit
        get() = { width = matchParent; height = wrapContent }
    inline val column: FrameLayout.LayoutParams.() -> Unit
        get() = { width = wrapContent; height = matchParent }
    inline val dominant: FrameLayout.LayoutParams.() -> Unit
        get() = { width = matchParent; height = matchParent }

    /**
     * Margin setting functions
     * 'dp' stands for 'dip'
     * 'm' stands for 'margin'
     * 't' stands for 'top'
     * 'l' stands for 'left'
     * 'r' stands for 'right'
     * 'b' stands for 'bottom'
     * 'e' stands for 'end'
     * 's' stands for 'start'
     * 'c' stands for 'coefficient'
     * */
    fun dpM(c: Int): FrameLayout.LayoutParams.() -> Unit = {
        val value = dip(c)
        leftMargin = value
        rightMargin = value
        topMargin = value
        bottomMargin = value
    }
    fun dpM(l: Int, t: Int, r: Int, b: Int): FrameLayout.LayoutParams.() -> Unit = {
        setMargins(dip(l), dip(t), dip(r), dip(b))
    }
    fun dpHorizontalM(c: Int): FrameLayout.LayoutParams.() -> Unit = {
        val value = dip(c)
        marginStart = value
        marginEnd = value
    }
    fun dpVerticalM(c: Int): FrameLayout.LayoutParams.() -> Unit = {
        val value = dip(c)
        topMargin = value
        bottomMargin = value
    }
    fun dpTopM(c: Int): FrameLayout.LayoutParams.() -> Unit = {
        this.topMargin = dip(c)
    }
    fun dpBottomM(c: Int): FrameLayout.LayoutParams.() -> Unit = {
        this.bottomMargin = dip(c)
    }
    fun dpStartM(c: Int): FrameLayout.LayoutParams.() -> Unit = {
        this.marginStart = dip(c)
    }
    fun dpEndM(c: Int): FrameLayout.LayoutParams.() -> Unit = {
        this.marginEnd = dip(c)
    }

    fun <T: View> T.lparams(vararg params: FrameLayout.LayoutParams.() -> Unit) : T {
        layoutParams = FrameLayout.LayoutParams(wrapContent, wrapContent).apply {
            for (param in params) param()
        }
        return this
    }
}

inline fun ViewManager.ankoFrame(init: (@AnkoViewDslMarker AnkoFrameLayout).() -> Unit): android.widget.FrameLayout
= ankoView({ AnkoFrameLayout(it) }, theme = 0) { init() }

fun ViewManager.ankoFrame(vararg initializations: (@AnkoViewDslMarker AnkoFrameLayout).() -> Unit): android.widget.FrameLayout
= ankoView({ AnkoFrameLayout(it) }, theme = 0) { for (init in initializations) init() }

class AnkoLinearLayout(ctx: Context): _LinearLayout(ctx) {
    inline val center: LinearLayout.LayoutParams.() -> Unit
        get() = { gravity = Gravity.CENTER_HORIZONTAL or Gravity.CENTER_VERTICAL }
    inline val greenwich: LinearLayout.LayoutParams.() -> Unit
        get() = { gravity = Gravity.CENTER_HORIZONTAL }
    inline val equator: LinearLayout.LayoutParams.() -> Unit
        get() = { gravity = Gravity.CENTER_VERTICAL }
    inline val east: LinearLayout.LayoutParams.() -> Unit
        get() = { gravity = Gravity.END }
    inline val west: LinearLayout.LayoutParams.() -> Unit
        get() = { gravity = Gravity.START }
    inline val centerEast: LinearLayout.LayoutParams.() -> Unit
        get() = { gravity = Gravity.CENTER_VERTICAL or Gravity.END }
    inline val centerWest: LinearLayout.LayoutParams.() -> Unit
        get() = { gravity = Gravity.CENTER_VERTICAL or Gravity.START}
    inline val submissive: LinearLayout.LayoutParams.() -> Unit
        get() = { width = wrapContent; height = wrapContent }
    inline val row: LinearLayout.LayoutParams.() -> Unit
        get() = { width = matchParent; height = wrapContent }
    inline val column: LinearLayout.LayoutParams.() -> Unit
        get() = { width = wrapContent; height = matchParent }
    inline val dominant: LinearLayout.LayoutParams.() -> Unit
        get() = { width = matchParent; height = matchParent }

    /**
     * Margin setting functions
     * 'dp' stands for 'dip'
     * 'm' stands for 'margin'
     * 't' stands for 'top'
     * 'l' stands for 'left'
     * 'r' stands for 'right'
     * 'b' stands for 'bottom'
     * 'e' stands for 'end'
     * 's' stands for 'start'
     * 'c' stands for 'coefficient'
     * */
    fun dpM(c: Int): LinearLayout.LayoutParams.() -> Unit = {
        val value = dip(c)
        leftMargin = value
        rightMargin = value
        topMargin = value
        bottomMargin = value
    }
    fun dpM(l: Int, t: Int, r: Int, b: Int): LinearLayout.LayoutParams.() -> Unit = {
        setMargins(dip(l), dip(t), dip(r), dip(b))
    }
    fun dpHorizontalM(c: Int): LinearLayout.LayoutParams.() -> Unit = {
        val value = dip(c)
        marginStart = value
        marginEnd = value
    }
    fun dpVerticalM(c: Int): LinearLayout.LayoutParams.() -> Unit = {
        val value = dip(c)
        topMargin = value
        bottomMargin = value
    }
    fun dpTopM(c: Int): LinearLayout.LayoutParams.() -> Unit = {
        this.topMargin = dip(c)
    }
    fun dpBottomM(c: Int): LinearLayout.LayoutParams.() -> Unit = {
        this.bottomMargin = dip(c)
    }
    fun dpStartM(c: Int): LinearLayout.LayoutParams.() -> Unit = {
        this.marginStart = dip(c)
    }
    fun dpEndM(c: Int): LinearLayout.LayoutParams.() -> Unit = {
        this.marginEnd = dip(c)
    }

    fun <T: View> T.lparams(vararg params: LinearLayout.LayoutParams.() -> Unit) : T {
        layoutParams = LinearLayout.LayoutParams(wrapContent, wrapContent).apply {
            for (param in params) param()
        }
        return this
    }

    fun <T: View> T.lparams(weight: Float, vararg params: LinearLayout.LayoutParams.() -> Unit) : T {
        layoutParams = LinearLayout.LayoutParams(wrapContent, wrapContent).apply {
            this.weight = weight
            for (param in params) param()
        }
        return this
    }
}

inline fun ViewManager.ankoVertical(init: (@AnkoViewDslMarker AnkoLinearLayout).() -> Unit): android.widget.LinearLayout
= ankoView({ AnkoLinearLayout(it) }, theme = 0) {
    init()
    orientation = LinearLayout.VERTICAL
}

fun ViewManager.ankoVertical(vararg initializations: (@AnkoViewDslMarker AnkoLinearLayout).() -> Unit): android.widget.LinearLayout
= ankoView({ AnkoLinearLayout(it) }, theme = 0) {
    for (init in initializations) init()
    orientation = LinearLayout.VERTICAL
}

inline fun ViewManager.ankoHorizontal(init: (@AnkoViewDslMarker AnkoLinearLayout).() -> Unit): android.widget.LinearLayout
= ankoView({ AnkoLinearLayout(it) }, theme = 0) {
    init()
    orientation = LinearLayout.HORIZONTAL
}

fun ViewManager.ankoHorizontal(vararg initializations: (@AnkoViewDslMarker AnkoLinearLayout).() -> Unit): android.widget.LinearLayout
= ankoView({ AnkoLinearLayout(it) }, theme = 0) {
    for (init in initializations) init()
    orientation = LinearLayout.HORIZONTAL
}
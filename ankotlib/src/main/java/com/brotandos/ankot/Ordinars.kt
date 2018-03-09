package com.brotandos.ankot

import android.support.design.widget.NavigationView
import android.view.animation.Animation
import android.widget.ImageView

/**
 * @author: Brotandos
 * @date: 26.02.2018.
 */
val fitSystemWindow: NavigationView.() -> Unit = {
    fitsSystemWindows = true
}

val ImageView.resourceId: Int
    get() {
        val field = javaClass.getDeclaredField("mResource")
        field.isAccessible = true
        return field.getInt(this)
    }

fun animationListener (
        onStart: ((Animation?) -> Unit)? = null,
        onRepeat: ((Animation?) -> Unit)? = null,
        onEnd: ((Animation?) -> Unit)? = null
) = object : Animation.AnimationListener {
    override fun onAnimationStart(animation: Animation?) { if (onStart != null) onStart(animation) }
    override fun onAnimationRepeat(animation: Animation?) { if (onRepeat != null) onRepeat(animation) }
    override fun onAnimationEnd(animation: Animation?) { if (onEnd != null) onEnd(animation) }
}
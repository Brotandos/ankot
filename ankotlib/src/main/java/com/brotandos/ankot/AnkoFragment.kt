package com.brotandos.ankot

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.dip
import org.jetbrains.anko.support.v4.UI

/**
 * @author: Brotandos
 * @date: 14.03.2018.
 */
abstract class AnkoFragment : Fragment() {
    fun Fragment.KUI(init: AnkoContext<Fragment>.() -> Unit) = UI(init).view

    abstract fun markup(): View

    override fun onCreateView(i: LayoutInflater, vg: ViewGroup?, b: Bundle?) = markup()

    @Deprecated("Use layout's dp val instead")
    inline val Int.dp: Int get() = context!!.dip(this)
}
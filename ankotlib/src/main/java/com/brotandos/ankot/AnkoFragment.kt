package com.brotandos.ankot

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.dip
import org.jetbrains.anko.support.v4.UI

/**
 * @author: Brotandos
 * @date: 14.03.2018.
 */
abstract class AnkoFragment : Fragment() {
    abstract fun ui(): AnkoContext<Fragment>.() -> Unit

    override fun onCreateView(i: LayoutInflater, vg: ViewGroup?, b: Bundle?) = UI { ui() }.view

    inline val Int.dp: Int get() = context!!.dip(this)
}
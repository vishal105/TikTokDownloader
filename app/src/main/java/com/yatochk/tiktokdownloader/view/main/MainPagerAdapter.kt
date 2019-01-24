package com.yatochk.tiktokdownloader.view.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.yatochk.tiktokdownloader.R
import com.yatochk.tiktokdownloader.dagger.App

class MainPagerAdapter(fragmentManager: FragmentManager, private val fragments: List<Fragment>) :
    FragmentStatePagerAdapter(fragmentManager) {

    override fun getCount(): Int = fragments.size

    override fun getItem(p0: Int): Fragment = fragments[p0]

    override fun getPageTitle(position: Int): CharSequence? =
        when (position) {
            0 -> App.component.context.getString(R.string.tab_download)
            else -> App.component.context.getString(R.string.tab_history)
        }
}
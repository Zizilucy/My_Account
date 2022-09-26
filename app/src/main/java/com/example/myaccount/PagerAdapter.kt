package com.example.myaccount

import android.content.res.Resources
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount() : Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        when (position){
            0 -> return PaymentFragment ()
            1 -> return ProductsFragment()
            else ->  { throw Resources.NotFoundException("Position Not Found") }
        }
    }
}
package com.example.dymachap7.factory

import androidx.fragment.app.Fragment
import com.example.dymachap7.factory.views.HomeFragment
import com.example.dymachap7.factory.views.ProfileFragment
import com.example.dymachap7.factory.views.SettingsFragment

class FragmentFactory {

    companion object {
        fun createFragment(type: FragmentType): Fragment {
            return when(type) {
                FragmentType.Home -> HomeFragment()
                FragmentType.Profile -> ProfileFragment()
                FragmentType.Settings -> SettingsFragment()
            }
        }
    }
}
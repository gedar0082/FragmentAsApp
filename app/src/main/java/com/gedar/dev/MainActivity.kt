package com.gedar.dev

import android.os.Bundle
import androidx.fragment.app.FragmentActivity

class MainActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, FeatureFragment.newInstance(2))
            .commit()
    }
}
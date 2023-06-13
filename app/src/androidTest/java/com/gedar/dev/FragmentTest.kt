package com.gedar.dev

import androidx.core.os.bundleOf
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.lifecycle.Lifecycle
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class FragmentTest {

    @After
    fun tearDown() {
//        решение проблемы остановки JUnit https://stackoverflow.com/questions/35042779/how-to-disable-android-studio-unit-tests-androidtest
        while (true) {}
    }


    @Test
    fun testLaunch() {
        val scenario = launchFragmentInContainer<FeatureFragment>(
            bundleOf("ARG" to 12),
            R.style.Theme_FragmentAsApp,
            Lifecycle.State.RESUMED
        )

    }

}
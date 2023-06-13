package com.gedar.dev

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment


class FeatureFragment : Fragment() {

    companion object {
        private const val ARG = "ARG"
        fun newInstance(arg: Int) : Fragment = FeatureFragment().apply {
            arguments = bundleOf(ARG to arg)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return ComposeView(requireContext()).apply {
            setContent {
                var variable by remember {
                    mutableStateOf(requireArguments().getInt(ARG))
                }
                Text(text = "передан $variable", modifier = Modifier
                    .wrapContentSize()
                    .clickable { variable++ })
            }
        }
    }


}
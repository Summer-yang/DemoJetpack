package com.summer.demo.jetpack.components.architecture.data.binding


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import com.summer.demo.jetpack.R
import com.summer.demo.jetpack.databinding.FragmentFragmentDataBindingBinding

/**
 * A simple [Fragment] subclass.
 *
 */
class FragmentDataBinding : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_data_binding, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val binding: FragmentFragmentDataBindingBinding = DataBindingUtil.setContentView(activity!!, R.layout.fragment_fragment_data_binding)
        val dataUser = DataUser("Jack", "Lily")
        binding.user = dataUser

        val bindingView:FragmentFragmentDataBindingBinding? = FragmentFragmentDataBindingBinding.inflate(layoutInflater)

    }

}

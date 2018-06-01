package com.summer.demo.jetpack.components.architecture

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.summer.demo.jetpack.R
import kotlinx.android.synthetic.main.fragment_architecture.*

class ArchitectureFragment : Fragment(), View.OnClickListener {

    companion object {
        fun newInstance() = ArchitectureFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_architecture, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        dataBinding.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.dataBinding -> {
                Navigation.findNavController(v).navigate(R.id.fragmentDataBinding)
            }
        }
    }
}

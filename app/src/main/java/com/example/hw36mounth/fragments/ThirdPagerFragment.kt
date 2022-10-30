package com.example.hw36mounth.fragments

import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import com.example.hw36mounth.adapters.ListAdapters
import com.example.hw36mounth.base.BaseFragment
import com.example.hw36mounth.databinding.FragmentThirdPagerBinding
import com.example.hw36mounth.fragments.viewModel.FragmentViewModel

class ThirdPagerFragment : BaseFragment<FragmentThirdPagerBinding , FragmentViewModel>() {

    private lateinit var viewModel: FragmentViewModel
    private lateinit var data:ArrayList<String>

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentThirdPagerBinding {
        return FragmentThirdPagerBinding.inflate(layoutInflater)
    }

    override fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity())[FragmentViewModel::class.java]
    }

    override fun initView() {
        viewModel.operation.observe(viewLifecycleOwner) {
            val adapter = ListAdapters(it)
            binding.recyclerView2.adapter = adapter
        }

    }
}
package com.example.hw36mounth.fragments

import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import com.example.hw36mounth.base.BaseFragment
import com.example.hw36mounth.databinding.FragmentSecondPagerBinding
import com.example.hw36mounth.fragments.viewModel.FragmentViewModel

class SecondPagerFragment : BaseFragment<FragmentSecondPagerBinding , FragmentViewModel>() {

    private lateinit var viewModel: FragmentViewModel

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentSecondPagerBinding {
        return FragmentSecondPagerBinding.inflate(layoutInflater)
    }

    //viewModel.counter.observe(this) {
    //            binding.tvCounter.text = it.toString()
    //        }

    override fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity())[FragmentViewModel::class.java]
    }

    override fun initView() {
        viewModel.counter.observe(viewLifecycleOwner) {
            binding.tvCounter.text = it.toString()
        }


    }
}
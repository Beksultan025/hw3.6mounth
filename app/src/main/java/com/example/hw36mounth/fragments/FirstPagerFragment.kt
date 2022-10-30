package com.example.hw36mounth.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.hw36mounth.R
import com.example.hw36mounth.base.BaseFragment
import com.example.hw36mounth.databinding.FragmentFirstPagerBinding
import com.example.hw36mounth.fragments.viewModel.FragmentViewModel

class FirstPagerFragment : BaseFragment<FragmentFirstPagerBinding , FragmentViewModel>() {

    private lateinit var viewModel: FragmentViewModel

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentFirstPagerBinding {
        return FragmentFirstPagerBinding.inflate(layoutInflater)
    }

    override fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity())[FragmentViewModel::class.java]
    }

    override fun initListener() {
        binding.btnPlus.setOnClickListener {
            viewModel.onIncrementClick()
        }

        binding.btnMinus.setOnClickListener {
            viewModel.onDecrementClick()
        }

    }

}

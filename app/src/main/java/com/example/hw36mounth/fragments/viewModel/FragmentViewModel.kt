package com.example.hw36mounth.fragments.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hw36mounth.base.BaseViewModel

class FragmentViewModel : BaseViewModel() {

    private var mCounter = 0
    private var mOperations = arrayListOf<String>()

    val counter = MutableLiveData<Int>()
    val operation = MutableLiveData<ArrayList<String>>()

    fun onIncrementClick() {
        mCounter++
        counter.value = mCounter
        mOperations.add("+")
        operation.value = mOperations
    }

    fun onDecrementClick() {
        mCounter--
        counter.value = mCounter
        mOperations.add("-")
        operation.value = mOperations
    }
}
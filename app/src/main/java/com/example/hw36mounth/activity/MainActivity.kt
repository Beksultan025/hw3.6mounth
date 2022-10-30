package com.example.hw36mounth.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw36mounth.R
import com.example.hw36mounth.adapters.PagerAdapter
import com.example.hw36mounth.base.BaseActivity
import com.example.hw36mounth.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun inflateViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun initViews() {
        binding.viewPager.adapter = PagerAdapter(this)
    }
}
package com.gabo.authretrofit.ui.home

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.gabo.authretrofit.base.BaseFragment
import com.gabo.authretrofit.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<HomeViewModel, FragmentHomeBinding>(HomeViewModel::class) {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentHomeBinding
        get() = FragmentHomeBinding::inflate

    private val args: HomeFragmentArgs by navArgs()

    @SuppressLint("SetTextI18n")
    override fun setupView(savedInstanceState: Bundle?) {
        args.loginModel?.let {
            binding.tvHome.text = "token: ${it.token}"
        }
        args.registerModel?.let {
            binding.tvHome.text = "token: ${it.token}\n\nid:${it.id}"
        }
    }


}
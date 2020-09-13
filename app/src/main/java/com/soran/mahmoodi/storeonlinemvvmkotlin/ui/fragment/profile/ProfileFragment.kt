package com.soran.mahmoodi.storeonlinemvvmkotlin.ui.fragment.profile

import androidx.databinding.library.baseAdapters.BR
import androidx.lifecycle.ViewModelProvider
import com.soran.mahmoodi.storeonlinemvvmkotlin.R
import com.soran.mahmoodi.storeonlinemvvmkotlin.databinding.FragmentProfileBinding
import com.soran.mahmoodi.storeonlinemvvmkotlin.ui.base.BaseFragment
import com.soran.mahmoodi.storeonlinemvvmkotlin.utils.SimpleViewModelFactory
import javax.inject.Inject

class ProfileFragment : BaseFragment<ProfileViewModel, FragmentProfileBinding>() {
    lateinit var mViewModel: ProfileViewModel

    lateinit var factory: SimpleViewModelFactory
        @Inject set

    override fun getLayoutId(): Int {
        return R.layout.fragment_profile
    }

    override fun getViewModel(): ProfileViewModel {
        mViewModel = ViewModelProvider(requireActivity(), factory).get(ProfileViewModel::class.java)
        return mViewModel
    }

    override fun getDataBinding(): Int {
        return BR.viewModel
    }
}
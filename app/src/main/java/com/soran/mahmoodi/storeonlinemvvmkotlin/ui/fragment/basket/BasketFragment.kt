package com.soran.mahmoodi.storeonlinemvvmkotlin.ui.fragment.basket

import androidx.databinding.library.baseAdapters.BR
import androidx.lifecycle.ViewModelProvider
import com.soran.mahmoodi.storeonlinemvvmkotlin.R
import com.soran.mahmoodi.storeonlinemvvmkotlin.databinding.FragmentBasketBinding
import com.soran.mahmoodi.storeonlinemvvmkotlin.ui.base.BaseFragment
import com.soran.mahmoodi.storeonlinemvvmkotlin.utils.SimpleViewModelFactory
import javax.inject.Inject

class BasketFragment : BaseFragment<BasketViewModel, FragmentBasketBinding>() {
    lateinit var mViewModel: BasketViewModel

    lateinit var factory: SimpleViewModelFactory
        @Inject set

    override fun getLayoutId(): Int {
        return R.layout.fragment_basket
    }

    override fun getViewModel(): BasketViewModel {
        mViewModel = ViewModelProvider(requireActivity(), factory).get(BasketViewModel::class.java)
        return mViewModel
    }

    override fun getDataBinding(): Int {
        return BR.viewModel
    }
}
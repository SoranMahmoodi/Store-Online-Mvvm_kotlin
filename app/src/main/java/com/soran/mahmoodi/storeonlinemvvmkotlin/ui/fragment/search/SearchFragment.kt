package com.soran.mahmoodi.storeonlinemvvmkotlin.ui.fragment.search

import androidx.databinding.library.baseAdapters.BR
import androidx.lifecycle.ViewModelProvider
import com.soran.mahmoodi.storeonlinemvvmkotlin.R
import com.soran.mahmoodi.storeonlinemvvmkotlin.databinding.FragmentSearchBinding
import com.soran.mahmoodi.storeonlinemvvmkotlin.ui.base.BaseFragment
import com.soran.mahmoodi.storeonlinemvvmkotlin.utils.SimpleViewModelFactory
import javax.inject.Inject

class SearchFragment : BaseFragment<SearchViewModel, FragmentSearchBinding>() {
    lateinit var mViewModel: SearchViewModel
    lateinit var factory: SimpleViewModelFactory
        @Inject set

    override fun getLayoutId(): Int {
        return R.layout.fragment_search
    }

    override fun getViewModel(): SearchViewModel {
        mViewModel = ViewModelProvider(requireActivity(), factory).get(SearchViewModel::class.java)
        return mViewModel
    }

    override fun getDataBinding(): Int {
        return BR.viewModel
    }
}
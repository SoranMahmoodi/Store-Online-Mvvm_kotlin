package com.soran.mahmoodi.storeonlinemvvmkotlin.ui.fragment.category

import androidx.lifecycle.ViewModelProvider
import com.soran.mahmoodi.storeonlinemvvmkotlin.BR
import com.soran.mahmoodi.storeonlinemvvmkotlin.R
import com.soran.mahmoodi.storeonlinemvvmkotlin.databinding.FragmentCategoryBinding
import com.soran.mahmoodi.storeonlinemvvmkotlin.ui.base.BaseFragment
import com.soran.mahmoodi.storeonlinemvvmkotlin.utils.SimpleViewModelFactory
import javax.inject.Inject

class CategoryFragment : BaseFragment<CategoryViewModel, FragmentCategoryBinding>() {
    lateinit var mViewModel: CategoryViewModel
    lateinit var factory: SimpleViewModelFactory
        @Inject set

    override fun getLayoutId(): Int {
       return R.layout.fragment_category
    }

    override fun getViewModel(): CategoryViewModel {
        mViewModel =
            ViewModelProvider(requireActivity(), factory).get(CategoryViewModel::class.java)
        return mViewModel
    }

    override fun getDataBinding(): Int {
       return BR.viewModel
    }
}
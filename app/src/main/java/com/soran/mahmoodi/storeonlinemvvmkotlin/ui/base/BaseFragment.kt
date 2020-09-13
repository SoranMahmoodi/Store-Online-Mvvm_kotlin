package com.soran.mahmoodi.storeonlinemvvmkotlin.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.android.support.DaggerFragment

abstract class BaseFragment<V : ViewModel, T : ViewDataBinding> : DaggerFragment() {

    private lateinit var mViewModel: V
    public lateinit var mDataBinding: T

    @LayoutRes
    abstract fun getLayoutId(): Int

    abstract fun getViewModel(): V

    abstract fun getDataBinding(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel = getViewModel()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mDataBinding = DataBindingUtil.inflate(inflater, getLayoutId(), container, false)
        mDataBinding.setVariable(getDataBinding(), mViewModel)
        mDataBinding.executePendingBindings()
        return mDataBinding.root
    }


}
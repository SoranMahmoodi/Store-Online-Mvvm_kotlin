package com.soran.mahmoodi.storeonlinemvvmkotlin.ui.fragment.main

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.soran.mahmoodi.storeonlinemvvmkotlin.BR
import com.soran.mahmoodi.storeonlinemvvmkotlin.R
import com.soran.mahmoodi.storeonlinemvvmkotlin.adapter.CardBrandAdapter
import com.soran.mahmoodi.storeonlinemvvmkotlin.databinding.FragmentMainBinding
import com.soran.mahmoodi.storeonlinemvvmkotlin.ui.base.BaseFragment
import com.soran.mahmoodi.storeonlinemvvmkotlin.utils.CustomRecyclerView
import com.soran.mahmoodi.storeonlinemvvmkotlin.utils.SimpleViewModelFactory
import kotlinx.android.synthetic.main.fragment_main.*
import javax.inject.Inject

class MainFragment : BaseFragment<MainViewModel, FragmentMainBinding>() {

    private lateinit var rvMainNewProduct: CustomRecyclerView
    private var cardBrandAdapter: CardBrandAdapter = CardBrandAdapter()
    lateinit var mViewModel: MainViewModel
    lateinit var factory: SimpleViewModelFactory
        @Inject set

    override fun getLayoutId(): Int {
        return R.layout.fragment_main
    }

    override fun getViewModel(): MainViewModel {
        mViewModel = ViewModelProvider(requireActivity(), factory)[MainViewModel::class.java]
        return mViewModel
    }

    override fun getDataBinding(): Int {
        return BR.viewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews(view)
        getNewProducts()
        getCradBrand()
    }

    fun setupViews(view: View) {
        rvMainNewProduct = view.findViewById(R.id.rv_fragmentMain_productNew)
        rv_fragmentMain_barend.apply {
            layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, true)
        }
    }

    fun getNewProducts() {
        mViewModel.getObserverLiveData().observe(viewLifecycleOwner, Observer {
            rvMainNewProduct.attach(it)
            rvMainNewProduct.setTextTitle("محصولات جدید")
            rvMainNewProduct.setTextSeeAll("مشاهده همه")
        })
        mViewModel.getProducts()
    }

    fun getCradBrand() {
        mViewModel.getObserverCard()
            .observe(viewLifecycleOwner, Observer {
                cardBrandAdapter.getCards(it)
                rv_fragmentMain_barend.adapter = cardBrandAdapter
            })
        mViewModel.getCardBrand()
    }

}
package com.soran.mahmoodi.storeonlinemvvmkotlin.ui.fragment.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.soran.mahmoodi.storeonlinemvvmkotlin.model.Card
import com.soran.mahmoodi.storeonlinemvvmkotlin.model.Products
import com.soran.mahmoodi.storeonlinemvvmkotlin.repository.RepositoryManger
import com.soran.mahmoodi.storeonlinemvvmkotlin.ui.base.BaseViewModel
import com.soran.mahmoodi.storeonlinemvvmkotlin.utils.ProductResource
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MainViewModel @Inject constructor(repositoryManger: RepositoryManger) :
    BaseViewModel(repositoryManger) {
    companion object {
        private const val TAG = "MainViewModel"
    }

    private val observerCardBrand: MutableLiveData<List<Card>> = MutableLiveData()
    private val observerProduct: MutableLiveData<List<Products>> =
        MutableLiveData();

    fun getObserverLiveData(): LiveData<List<Products>> {
        return observerProduct
    }

    fun getObserverCard(): LiveData<List<Card>> {
        return observerCardBrand
    }

    fun getCardBrand() {
        getCompositeDisposable().add(
            getRepositoryManager().getCardBrand()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    { cards -> observerCardBrand.postValue(cards) },
                    { error -> Log.i(TAG, "getCardBrand: $error") })
        )
    }

    fun getProducts() {
        getCompositeDisposable().add(
            getRepositoryManager().getProduct(2)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    { product -> observerProduct.postValue(product) },
                    { error -> Log.i(TAG, "getProducts: $error") }
                )
        )
    }


}


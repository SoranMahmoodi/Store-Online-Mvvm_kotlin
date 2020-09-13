package com.soran.mahmoodi.storeonlinemvvmkotlin.repository

import com.soran.mahmoodi.storeonlinemvvmkotlin.model.Card
import com.soran.mahmoodi.storeonlinemvvmkotlin.model.Products
import com.soran.mahmoodi.storeonlinemvvmkotlin.repository.network.ApiServiceImpl
import io.reactivex.Single
import javax.inject.Inject

class RepositoryMangerImpl @Inject constructor(var apiServiceImpl: ApiServiceImpl) :
    RepositoryManger {

    override fun getProduct(orderId: Int): Single<List<Products>> {
        return apiServiceImpl.getProduct(orderId)
    }

    override fun getCardBrand(): Single<List<Card>> {
        return apiServiceImpl.getCardBrand()
    }
}
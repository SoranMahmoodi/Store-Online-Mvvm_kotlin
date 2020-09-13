package com.soran.mahmoodi.storeonlinemvvmkotlin.repository.network

import com.soran.mahmoodi.storeonlinemvvmkotlin.model.Card
import com.soran.mahmoodi.storeonlinemvvmkotlin.model.Products
import io.reactivex.Single
import retrofit2.Retrofit
import javax.inject.Inject

class ApiServiceImpl @Inject constructor(retrofit: Retrofit) : ApiService {

    private var apiService: ApiService = retrofit.create(ApiService::class.java)
    override fun getProduct(orderId: Int): Single<List<Products>> {
        return apiService.getProduct(orderId = orderId)
    }

    override fun getCardBrand(): Single<List<Card>> {
        return apiService.getCardBrand()
    }
}
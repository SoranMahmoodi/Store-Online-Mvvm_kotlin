package com.soran.mahmoodi.storeonlinemvvmkotlin.repository.network

import com.soran.mahmoodi.storeonlinemvvmkotlin.model.Card
import com.soran.mahmoodi.storeonlinemvvmkotlin.model.Products
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("products")
    fun getProduct(@Query("order") orderId: Int): Single<List<Products>>

    @GET("cards")
    fun getCardBrand(): Single<List<Card>>
}
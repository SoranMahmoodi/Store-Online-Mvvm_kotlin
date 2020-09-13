package com.soran.mahmoodi.storeonlinemvvmkotlin.model

import com.google.gson.annotations.SerializedName

data class Products(
    @SerializedName("product_current_price") val product_current_price: String,
    @SerializedName("product_description") val product_description: String,
    @SerializedName("product_id") val product_id: String,
    @SerializedName("product_image_urls") val product_image_urls: String,
    @SerializedName("product_previous_price") val product_previous_price: String,
    @SerializedName("product_title") val product_title: String

)
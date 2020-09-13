package com.soran.mahmoodi.storeonlinemvvmkotlin.utils

class ProductResource <T> constructor(
     status: ProductStatus,
     data: T?,
     massage: String?
) {


    fun loading(data: T?): ProductResource<T> {
        return ProductResource(ProductStatus.LOADING, data, null)
    }

    fun  success(data: T): ProductResource<T> {
        return ProductResource(ProductStatus.SUCCESS, data, null)
    }

    fun  error(data: T?, massage: String?): ProductResource<T> {
        return ProductResource(ProductStatus.ERROR, data, massage)
    }

}
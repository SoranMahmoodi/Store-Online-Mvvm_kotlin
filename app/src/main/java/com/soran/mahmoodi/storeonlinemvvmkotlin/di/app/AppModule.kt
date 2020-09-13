package com.soran.mahmoodi.storeonlinemvvmkotlin.di.app

import com.soran.mahmoodi.storeonlinemvvmkotlin.repository.RepositoryManger
import com.soran.mahmoodi.storeonlinemvvmkotlin.repository.RepositoryMangerImpl
import com.soran.mahmoodi.storeonlinemvvmkotlin.repository.network.ApiService
import com.soran.mahmoodi.storeonlinemvvmkotlin.utils.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

@Module
class AppModule {

    @AppScope
    @Provides
    fun providerRepositoryManger(repositoryMangerImpl: RepositoryMangerImpl): RepositoryManger {
        return repositoryMangerImpl
    }

    @AppScope
    @Provides
    fun providerRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
    }

    @AppScope
    @Provides
    fun providerApiService(retrofit: Retrofit):ApiService{
        return retrofit.create(ApiService::class.java)
    }

}
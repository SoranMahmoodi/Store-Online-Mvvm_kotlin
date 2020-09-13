package com.soran.mahmoodi.storeonlinemvvmkotlin.di.app

import androidx.lifecycle.ViewModelProvider
import com.soran.mahmoodi.storeonlinemvvmkotlin.utils.SimpleViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelProviderFactoryModule {

    @Binds
    abstract fun providerViewModelFactory(simpleViewModelFactory: SimpleViewModelFactory): ViewModelProvider.Factory
}
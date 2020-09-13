package com.soran.mahmoodi.storeonlinemvvmkotlin.di.app

import com.soran.mahmoodi.storeonlinemvvmkotlin.di.main.MainActivityModule
import com.soran.mahmoodi.storeonlinemvvmkotlin.di.main.MainActivityScope
import com.soran.mahmoodi.storeonlinemvvmkotlin.di.main.MainActivityViewModelModule
import com.soran.mahmoodi.storeonlinemvvmkotlin.ui.activity.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @MainActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class, MainActivityViewModelModule::class, FragmentProvider::class])
    abstract fun providerMainActivity(): MainActivity
}
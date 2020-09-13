package com.soran.mahmoodi.storeonlinemvvmkotlin.utils

import com.soran.mahmoodi.storeonlinemvvmkotlin.di.app.AppComponent
import com.soran.mahmoodi.storeonlinemvvmkotlin.di.app.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class BaseApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val appComponent: AppComponent = DaggerAppComponent.builder().application(this).build()
        appComponent.inject(this)
        return appComponent
    }
}
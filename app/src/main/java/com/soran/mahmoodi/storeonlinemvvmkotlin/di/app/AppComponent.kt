package com.soran.mahmoodi.storeonlinemvvmkotlin.di.app

import android.app.Application
import com.soran.mahmoodi.storeonlinemvvmkotlin.utils.BaseApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication

@AppScope
@Component(modules = [AndroidSupportInjectionModule::class, ActivityBuilder::class, AppModule::class,ViewModelProviderFactoryModule::class])
interface AppComponent : AndroidInjector<DaggerApplication> {
    fun inject(baseApplication: BaseApplication)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }
}
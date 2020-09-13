package com.soran.mahmoodi.storeonlinemvvmkotlin.di.main

import androidx.lifecycle.ViewModel
import com.soran.mahmoodi.storeonlinemvvmkotlin.di.app.ViewModelKey
import com.soran.mahmoodi.storeonlinemvvmkotlin.ui.fragment.main.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MainFragmentViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainFragmentViewModel(mainViewModel: MainViewModel): ViewModel
}
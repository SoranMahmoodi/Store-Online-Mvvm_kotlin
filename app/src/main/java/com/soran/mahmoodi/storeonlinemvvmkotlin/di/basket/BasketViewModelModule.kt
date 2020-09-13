package com.soran.mahmoodi.storeonlinemvvmkotlin.di.basket

import androidx.lifecycle.ViewModel
import com.soran.mahmoodi.storeonlinemvvmkotlin.di.app.ViewModelKey
import com.soran.mahmoodi.storeonlinemvvmkotlin.ui.fragment.basket.BasketViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class BasketViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(BasketViewModel::class)
    abstract fun bindBasketViewModel(basketViewModel: BasketViewModel): ViewModel
}
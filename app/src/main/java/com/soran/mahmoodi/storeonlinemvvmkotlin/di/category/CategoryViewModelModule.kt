package com.soran.mahmoodi.storeonlinemvvmkotlin.di.category

import androidx.lifecycle.ViewModel
import com.soran.mahmoodi.storeonlinemvvmkotlin.di.app.ViewModelKey
import com.soran.mahmoodi.storeonlinemvvmkotlin.ui.fragment.basket.BasketViewModel
import com.soran.mahmoodi.storeonlinemvvmkotlin.ui.fragment.category.CategoryViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class CategoryViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(CategoryViewModel::class)
    abstract fun bindCategoryViewModel(categoryViewModel: CategoryViewModel): ViewModel
}
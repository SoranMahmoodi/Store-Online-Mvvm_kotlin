package com.soran.mahmoodi.storeonlinemvvmkotlin.di.search

import androidx.lifecycle.ViewModel
import com.soran.mahmoodi.storeonlinemvvmkotlin.di.app.ViewModelKey
import com.soran.mahmoodi.storeonlinemvvmkotlin.ui.fragment.search.SearchViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class SearchViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(SearchViewModel::class)
    abstract fun bindSearchViewModel(searchViewModel: SearchViewModel):ViewModel
}
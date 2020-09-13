package com.soran.mahmoodi.storeonlinemvvmkotlin.di.app

import com.soran.mahmoodi.storeonlinemvvmkotlin.di.basket.BasketFragmentModule
import com.soran.mahmoodi.storeonlinemvvmkotlin.di.basket.BasketScope
import com.soran.mahmoodi.storeonlinemvvmkotlin.di.basket.BasketViewModelModule
import com.soran.mahmoodi.storeonlinemvvmkotlin.di.category.CategoryFragmentModule
import com.soran.mahmoodi.storeonlinemvvmkotlin.di.category.CategoryScope
import com.soran.mahmoodi.storeonlinemvvmkotlin.di.category.CategoryViewModelModule
import com.soran.mahmoodi.storeonlinemvvmkotlin.di.main.MainFragmentModule
import com.soran.mahmoodi.storeonlinemvvmkotlin.di.main.MainFragmentScope
import com.soran.mahmoodi.storeonlinemvvmkotlin.di.main.MainFragmentViewModelModule
import com.soran.mahmoodi.storeonlinemvvmkotlin.di.profile.ProfileFragmentModule
import com.soran.mahmoodi.storeonlinemvvmkotlin.di.profile.ProfileScope
import com.soran.mahmoodi.storeonlinemvvmkotlin.di.profile.ProfileViewModelModule
import com.soran.mahmoodi.storeonlinemvvmkotlin.di.search.SearchFragmentModule
import com.soran.mahmoodi.storeonlinemvvmkotlin.di.search.SearchScope
import com.soran.mahmoodi.storeonlinemvvmkotlin.di.search.SearchViewModelModule
import com.soran.mahmoodi.storeonlinemvvmkotlin.ui.fragment.basket.BasketFragment
import com.soran.mahmoodi.storeonlinemvvmkotlin.ui.fragment.category.CategoryFragment
import com.soran.mahmoodi.storeonlinemvvmkotlin.ui.fragment.main.MainFragment
import com.soran.mahmoodi.storeonlinemvvmkotlin.ui.fragment.profile.ProfileFragment
import com.soran.mahmoodi.storeonlinemvvmkotlin.ui.fragment.search.SearchFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentProvider {

    @MainFragmentScope
    @ContributesAndroidInjector(modules = [MainFragmentModule::class, MainFragmentViewModelModule::class])
    abstract fun providerMainFragment(): MainFragment

    @CategoryScope
    @ContributesAndroidInjector(modules = [CategoryFragmentModule::class, CategoryViewModelModule::class])
    abstract fun providerCategoryFragment(): CategoryFragment

    @SearchScope
    @ContributesAndroidInjector(modules = [SearchFragmentModule::class, SearchViewModelModule::class])
    abstract fun providerSearchFragment(): SearchFragment

    @BasketScope
    @ContributesAndroidInjector(modules = [BasketFragmentModule::class, BasketViewModelModule::class])
    abstract fun providerBasketFragment(): BasketFragment

    @ProfileScope
    @ContributesAndroidInjector(modules = [ProfileFragmentModule::class, ProfileViewModelModule::class])
    abstract fun providerProfileFragment(): ProfileFragment
}
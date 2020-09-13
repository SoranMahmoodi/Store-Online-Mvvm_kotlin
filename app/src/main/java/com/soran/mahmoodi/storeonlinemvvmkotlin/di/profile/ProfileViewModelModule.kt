package com.soran.mahmoodi.storeonlinemvvmkotlin.di.profile

import androidx.lifecycle.ViewModel
import com.soran.mahmoodi.storeonlinemvvmkotlin.di.app.ViewModelKey
import com.soran.mahmoodi.storeonlinemvvmkotlin.ui.fragment.profile.ProfileViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ProfileViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel::class)
    abstract fun bindProfileViewModel(profileViewModel: ProfileViewModel): ViewModel
}
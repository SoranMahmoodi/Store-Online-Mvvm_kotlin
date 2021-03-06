package com.soran.mahmoodi.storeonlinemvvmkotlin.ui.fragment.basket

import android.util.Log
import com.soran.mahmoodi.storeonlinemvvmkotlin.repository.RepositoryManger
import com.soran.mahmoodi.storeonlinemvvmkotlin.ui.base.BaseViewModel
import javax.inject.Inject

class BasketViewModel @Inject constructor(repositoryManger: RepositoryManger) :
    BaseViewModel(repositoryManger) {

    init {
        Log.i("ViewModel", "view Model working...................... ")
    }
}
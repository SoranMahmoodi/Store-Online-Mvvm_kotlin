package com.soran.mahmoodi.storeonlinemvvmkotlin.ui.fragment.search

import android.util.Log
import com.soran.mahmoodi.storeonlinemvvmkotlin.repository.RepositoryManger
import com.soran.mahmoodi.storeonlinemvvmkotlin.ui.base.BaseViewModel
import javax.inject.Inject

class SearchViewModel @Inject constructor(repositoryManger: RepositoryManger) :
    BaseViewModel(repositoryManger) {

    init {
        Log.i("ViewModel", "view Model working...................... ")
    }
}
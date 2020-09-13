package com.soran.mahmoodi.storeonlinemvvmkotlin.ui.base

import androidx.lifecycle.ViewModel
import com.soran.mahmoodi.storeonlinemvvmkotlin.repository.RepositoryManger
import io.reactivex.disposables.CompositeDisposable

abstract class BaseViewModel constructor(private var repositoryManger: RepositoryManger) :
    ViewModel() {
   private var compositeDisposable: CompositeDisposable = CompositeDisposable()

    fun getRepositoryManager(): RepositoryManger {
        return repositoryManger
    }

    fun getCompositeDisposable(): CompositeDisposable {
        return compositeDisposable
    }

    override fun onCleared() {
        compositeDisposable.dispose()
        super.onCleared()
    }
}
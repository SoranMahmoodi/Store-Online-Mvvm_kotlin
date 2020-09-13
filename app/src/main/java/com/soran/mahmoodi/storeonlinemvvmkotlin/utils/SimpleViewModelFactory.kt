package com.soran.mahmoodi.storeonlinemvvmkotlin.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.soran.mahmoodi.storeonlinemvvmkotlin.repository.RepositoryManger
import java.lang.Exception
import java.lang.IllegalArgumentException
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

 class SimpleViewModelFactory @Inject constructor(
    var creators: Map<Class<out ViewModel>,@JvmSuppressWildcards Provider<ViewModel>>
) :
    ViewModelProvider.Factory {


    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val creator: Provider<out ViewModel>? = creators[modelClass]
        if (creator == null) {
            for ((key, value) in creators) {
                if (modelClass.isAssignableFrom(key)) {
                    creator == value
                    break
                }
            }
        }
        if (creator == null) {
            throw IllegalArgumentException("unknown model class " + modelClass)
        }
        try {
            return creator?.get() as T
        } catch (e: Exception) {
            throw Exception(e.toString())
        }
    }
}
package com.soran.mahmoodi.storeonlinemvvmkotlin.ui.activity.main

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.soran.mahmoodi.storeonline.utils.setupWithNavController
import com.soran.mahmoodi.storeonlinemvvmkotlin.R
import com.soran.mahmoodi.storeonlinemvvmkotlin.utils.SimpleViewModelFactory
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    lateinit var factory: SimpleViewModelFactory
        @Inject set

    lateinit var mViewModel: MainActivityViewModel
    lateinit var currentController: LiveData<NavController>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            setupBottomNavigation()
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        val bnvFragmentMain = findViewById<BottomNavigationView>(R.id.bnv_fragmentMain)
        val navGraphId = listOf(
            R.navigation.navigation,
            R.navigation.category,
            R.navigation.search,
            R.navigation.basket,
            R.navigation.profile
        )

        val controller = bnvFragmentMain.setupWithNavController(
            navGraphIds = navGraphId,
            fragmentManager = supportFragmentManager,
            containerId = R.id.container_bottom_navigation,
            intent = intent
        )

        currentController = controller
    }


    override fun onSupportNavigateUp(): Boolean {
        return currentController?.value?.navigateUp() ?: false
    }
}
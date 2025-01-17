package com.tamerlan.effectivetravels.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.tamerlan.effectivetravels.R
import javax.inject.Inject


class MainActivity : AppCompatActivity() {



    private lateinit var viewModel: com.tamerlan.main.presentation.MainViewModel
//
//    //
    @Inject
    lateinit var viewModelFactory: com.tamerlan.main.presentation.ViewModelFactory
//
    private val component by lazy {
        (application as EffectiveTravelsApp).appComponent
}

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        viewModel = ViewModelProvider(this, viewModelFactory)[com.tamerlan.main.presentation.MainViewModel::class.java]
        Log.d("MainViewModel", "onCreate: ${viewModel.getOfferList()}")




    }
}
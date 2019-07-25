package com.black3.app.lifecycleviewmodelramdonimage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imagePhoto : ImageView = findViewById(R.id.imagePhoto)
        //var model = MainActivityViewModel()

        //Extraemos el ViewModel a través del ViewModelProviders y le damos el nombre de la clase que se está dando de alta
        var model = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)

        Picasso.get().load(model.callUrlImage()).into(imagePhoto)
        Log.e("Tag Picasso", "Putting the image in the imagePhoto")

    }
}

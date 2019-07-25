package com.black3.app.lifecycleviewmodelramdonimage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.e
import android.widget.Button
import android.widget.ImageView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    //lateinit var imagePhoto1 : ImageView
    //lateinit var imagePhoto2 : ImageView
    //lateinit var btnGetUrlImage : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imagePhoto2 : ImageView = findViewById(R.id.imagePhoto2)
        var imagePhoto1 : ImageView = findViewById(R.id.imagePhoto1)
        var btnGetUrlImage : Button = findViewById(R.id.btnGetUrlImage)
        //var model = MainActivityViewModel()

        //Extraemos el ViewModel a través del ViewModelProviders y le damos el nombre de la clase que se está dando de alta
        var model = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)

        var urlImage = model.callUrlImage()
        urlImage?.observe(this, Observer {
            print("Se ejecuta si la url es modificada")

            Picasso.get().load(it).into(imagePhoto1)
            Picasso.get().load(it).into(imagePhoto2)

            e("Tag Picasso", "Putting the image in the imagePhoto")
        })

        btnGetUrlImage.setOnClickListener {
            model.randomNumberUrl()
        }

    }
}

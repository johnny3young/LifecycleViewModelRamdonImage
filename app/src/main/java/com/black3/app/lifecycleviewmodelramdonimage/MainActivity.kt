package com.black3.app.lifecycleviewmodelramdonimage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imagePhoto : ImageView = findViewById(R.id.imagePhoto)
        var model = MainActivityViewModel()

        Picasso.get().load(model.callUrlImage()).into(imagePhoto)
        Log.e("Tag Picasso", "Colocando imagen en el imagePhoto")

    }
}

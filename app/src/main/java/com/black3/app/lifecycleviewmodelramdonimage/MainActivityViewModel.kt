package com.black3.app.lifecycleviewmodelramdonimage

import android.util.Log
import android.util.Log.e

class MainActivityViewModel {

    //Esta clase tiene la responsabilidad de respoder lo que le pida la UI
    private var urlImage : String? = null

    fun callUrlImage() : String? {
        if (urlImage == null){
            urlImage = randomNumberUrl()
        }
        return urlImage
    }

    fun randomNumberUrl() : String {
        return "https://picsum.photos/${(3..5).random()}00/${(3..5).random()}00"
        Log.e("ramdomNumberUrl","Imagen aleatoria desde el método randomNumberUrl")
    }
}

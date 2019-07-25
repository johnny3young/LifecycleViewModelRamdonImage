package com.black3.app.lifecycleviewmodelramdonimage

import android.util.Log
import androidx.lifecycle.ViewModel

//Implementamos ViewModel de LifeCycle para poder mantener la misma imagen al rotar el celular
class MainActivityViewModel : ViewModel() {

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
        Log.e("ramdomNumberUrl","Image random from the method randomNumberUrl")
    }
}

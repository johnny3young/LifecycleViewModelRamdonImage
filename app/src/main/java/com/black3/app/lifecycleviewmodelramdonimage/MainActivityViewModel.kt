package com.black3.app.lifecycleviewmodelramdonimage

import android.util.Log.e
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//Implementamos ViewModel de LifeCycle para poder mantener la misma imagen al rotar el celular
class MainActivityViewModel : ViewModel() {

    //Esta clase tiene la responsabilidad de respoder lo que le pida la UI
    //Para convertir el String en "observer" cambiamos private var urlImage : String? = null a private var urlImage : MutableLiveData<String?>? = null
    private var urlImage : MutableLiveData<String?>? = null

    fun callUrlImage() : MutableLiveData<String?>? {
        if (urlImage == null){
            urlImage = MutableLiveData()
            randomNumberUrl()
        }
        return urlImage
    }

    fun randomNumberUrl() {
        urlImage?.value = "https://picsum.photos/${(3..5).random()}00/${(3..5).random()}00"
        e("ramdomNumberUrl","Image random from the method randomNumberUrl")
    }
}

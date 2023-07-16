package com.example.learning_jetpack_compose

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.example.learning_jetpack_compose.models.Quote
import com.google.gson.Gson

object DataManager {
    var data = emptyArray<Quote>()
    val isDataLoaded = mutableStateOf(false)
    fun loadAssetsFromFile(context: Context) {
        val inputStream = context.assets.open("quotes.json")
        val size = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        data = gson.fromJson(json, Array<Quote>::class.java)
        isDataLoaded.value = true
    }
}
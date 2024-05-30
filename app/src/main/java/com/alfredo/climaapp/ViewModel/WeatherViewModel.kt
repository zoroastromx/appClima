package com.alfredo.climaapp.ViewModel

import androidx.lifecycle.ViewModel
import com.alfredo.climaapp.Repository.WeatherRepository
import com.alfredo.climaapp.Server.ApiClient
import com.alfredo.climaapp.Server.ApiServices

class WeatherViewModel(val repository: WeatherRepository): ViewModel() {

    constructor(): this(WeatherRepository(ApiClient().getClient().create(ApiServices::class.java)))

    fun loadCurrentWeather(lat: Double, lng: Double, unit: String) =
        repository.getCurrentWeather(lat, lng, unit)

}
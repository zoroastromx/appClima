package com.alfredo.climaapp.Repository

import com.alfredo.climaapp.Server.ApiServices

class WeatherRepository(val api:ApiServices) {
   fun getCurrentWeather(lat:Double, lng:Double, unit:String) =
       api.getCurrentWeather(lat,lng,unit,"")
}
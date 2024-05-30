package com.alfredo.climaapp.Repository

import com.alfredo.climaapp.Server.ApiServices

class WeatherRepository(val api:ApiServices) {
   fun getCurrentWeather(lat:Double, lng:Double, unit:String) =
       api.getCurrentWeather(lat,lng,unit,"5fc2c47ffe1d2973a16978618e341a30")
}
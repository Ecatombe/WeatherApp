package com.fabio.weatherapp.feature_weather.domain.repository

import com.fabio.weatherapp.feature_weather.domain.util.Resource
import com.fabio.weatherapp.feature_weather.domain.weather.WeatherInfo

interface WeatherRepository {

    suspend fun getWeatherData(
        lat: Double,
        long: Double
    ): Resource<WeatherInfo>
}
package com.fabio.weatherapp.feature_weather.presentation

import com.fabio.weatherapp.feature_weather.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)

package com.vokrob.weather_forecast_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.vokrob.weather_forecast_2.screens.MainScreen
import com.vokrob.weather_forecast_2.ui.theme.Weather_forecast_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Weather_forecast_2Theme {
                MainScreen()
            }
        }
    }
}
















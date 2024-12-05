package com.vokrob.weather_forecast_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.vokrob.weather_forecast_2.screens.MainCard
import com.vokrob.weather_forecast_2.screens.TabLayout
import com.vokrob.weather_forecast_2.ui.theme.Weather_forecast_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Weather_forecast_2Theme {
                Image(
                    painter = painterResource(id = R.drawable.sky),
                    contentDescription = "im1", modifier = Modifier
                        .fillMaxSize()
                        .alpha(0.5f),
                    contentScale = ContentScale.FillBounds
                )
                
                Column {
                    MainCard()
                    TabLayout()
                }
            }
        }
    }
}
















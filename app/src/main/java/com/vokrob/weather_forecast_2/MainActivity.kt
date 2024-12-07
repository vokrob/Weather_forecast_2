package com.vokrob.weather_forecast_2

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.vokrob.weather_forecast_2.screens.MainCard
import com.vokrob.weather_forecast_2.screens.TabLayout
import com.vokrob.weather_forecast_2.ui.theme.Weather_forecast_2Theme

const val API_KEY = "87b8e23ecfe84f1da9c160237242511"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Weather_forecast_2Theme {
                getData("Barnaul", this)

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

private fun getData(city: String, context: Context) {
    val url = "https://api.weatherapi.com/v1/forecast.json?" +
            "key=$API_KEY" +
            "&q=$city" +
            "&days=3" +
            "&aqi=no&alerts=no"
    val queue = Volley.newRequestQueue(context)
    val sRequest = StringRequest(
        Request.Method.GET,
        url,
        { response -> Log.d("MyLog", "Response: $response") },
        { Log.d("MyLog", "Volley error: $it") }
    )
    queue.add(sRequest)
}


























package com.example.cist_cat

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import com.example.cist_cat.ui.theme.CISTCaTTheme
import com.example.cist_cat.atoms.NeumorphismSample
import com.example.cist_cat.atoms.CountDownTimer
import java.time.LocalTime
import java.util.Date


class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CISTCaTTheme {
                Surface(
                    color = Color.White,
                ) {
                    val time by remember { mutableStateOf(System.currentTimeMillis()) }
                    val currentTime = LocalTime.now()
                    val nextBusTime = LocalTime.of(23,59) //TODO Get Actual value
                    CountDownTimer(currentTime = currentTime, nextBusTime = nextBusTime)
                }
            }
        }
    }
}
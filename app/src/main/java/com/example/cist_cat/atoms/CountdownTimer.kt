package com.example.cist_cat.atoms

import android.os.Build
import android.os.CountDownTimer
import android.widget.TextClock
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView
import java.time.Duration
import java.time.LocalTime
import java.util.Date

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun CountDownTimer(currentTime:LocalTime,nextBusTime:LocalTime){
    Column() {
        val countDown = Duration.between(currentTime,nextBusTime)
        val countDownMinute = countDown.toMinutes()
        val countDownSeconds = (countDown.toMillis() / 1000 ) - countDownMinute*60
        Text(text = "$currentTime")
        Text(text = "$nextBusTime")
        Text(text = "$countDownMinute")
        Text(text= "$countDownSeconds")
    }
}
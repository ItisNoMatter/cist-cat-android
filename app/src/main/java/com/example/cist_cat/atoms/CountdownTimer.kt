package com.example.cist_cat.atoms

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.delay
import java.time.Duration
import java.time.LocalTime

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun CountDownTimer(currentTime:LocalTime,nextBusTime:LocalTime){
    Column {
        val countDown = Duration.between(currentTime,nextBusTime)
        val countDownMinute = countDown.toMinutes()
        val countDownSeconds = (countDown.toMillis() / 1000 ) - countDownMinute*60
        Text(text = "$currentTime")
        Text(text = "$nextBusTime")
        Text(text = "$countDownMinute")
        Text(text= "$countDownSeconds")
    }
}

@Composable
fun MyCountUpTimer(){
    var count:Int by remember { mutableStateOf(0) }
    var isRunning by remember { mutableStateOf(false) }
    if (isRunning){
        LaunchedEffect(Unit) {
            while (true) {
                delay(1000)
                count++
            }
        }
    }
    Column {
        Text(text = count.toString(), style = MaterialTheme.typography.h1)
        Button(
            onClick ={isRunning = !isRunning},
            modifier = Modifier.fillMaxWidth()
        ) {
            if(isRunning) Text("pause")  else Text("start to count up")
        }
    }
}


@Preview
@Composable
fun Prev(){
    MyCountUpTimer()
}
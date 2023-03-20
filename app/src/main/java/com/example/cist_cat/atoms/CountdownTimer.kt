package com.example.cist_cat.atoms

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.delay
import java.time.Duration
import java.time.LocalTime

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun CountDownTimer(nextBusTime:LocalTime,onFinished: ()->Unit){
    var countDownDuration by remember { mutableStateOf(Duration.between(LocalTime.now(), nextBusTime)) }

    LaunchedEffect(nextBusTime) {//引数が更新されたら初期化しなおす
        countDownDuration = Duration.between(LocalTime.now(), nextBusTime)
    }

    LaunchedEffect(Unit){
        while (true){
            delay(1000)
            if (countDownDuration.minusMillis(1000).isNegative){
                onFinished()
            }
            countDownDuration = countDownDuration.minusMillis(1000)//ここで再コンポーズが走る
        }
    }
    Column {
        val minutes = countDownDuration.toMinutes()
        val seconds = (countDownDuration.toMillis() / 1000 ) - minutes*60
        Text(
            text = "${if(minutes<10) 0 else ""}$minutes:${if(seconds<10) 0 else ""}$seconds",
            style = MaterialTheme.typography.h1,
            color = Color(0xff979494),
            fontWeight = FontWeight.Medium
        )
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = true)
@Composable
fun CountDownTimerPreview(){
    CountDownTimer(nextBusTime = LocalTime.now().plusMinutes(1)) {}
}
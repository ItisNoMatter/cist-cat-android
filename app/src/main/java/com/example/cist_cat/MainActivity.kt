package com.example.cist_cat

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.graphics.Color
import com.example.cist_cat.ui.theme.CISTCaTTheme

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CISTCaTTheme {
                Surface(
                    color = Color.White,
                ) {
                    Text("hello cist")
                }
            }
        }
    }
}
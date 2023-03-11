package com.example.cist_cat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.ui.graphics.Color
import com.example.cist_cat.ui.theme.CISTCaTTheme
import com.example.cist_cat.atoms.NeumorphismSample


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CISTCaTTheme {
                Surface(
                    color = Color.White,
                ) {
                    NeumorphismSample(name = "aaa")
                }
            }
        }
    }
}
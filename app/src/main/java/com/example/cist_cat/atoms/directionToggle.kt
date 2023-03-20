package com.example.cist_cat.atoms

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cist_cat.ui.theme.CISTCaTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CISTCaTTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DirectionToggle()
                }
            }
        }
    }
}
@Composable
private fun DirectionToggle(){
    val checked = remember { mutableStateOf(true) }
    Switch(
        checked = checked.value,
        onCheckedChange = { checked.value = it },
    )
}

@Preview(showBackground = true, widthDp = 320)
@Composable
private fun DirectionTogglePreview(){
    CISTCaTTheme {
        DirectionToggle()
    }
}
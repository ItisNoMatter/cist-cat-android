package com.example.cist_cat

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cist_cat.atoms.*
import com.example.cist_cat.ui.theme.CISTCaTTheme
import me.nikhilchaudhari.library.neumorphic
import me.nikhilchaudhari.library.shapes.Pressed
import java.time.LocalTime

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CISTCaTTheme {
                Surface(
                    color = Color.White,
                ) {
                    CistCatApp()
                }
            }
        }
    }
}
@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun CistCatApp(){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.size(0.dp,8.dp))
        Logo(modifier = Modifier.size(200.dp,50.dp))
        Spacer(modifier = Modifier.size(0.dp,8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 8.dp)

        ) {
            DirectionToggle()
            Spacer(Modifier.weight(1f))
            Text("4月1日　水曜日")
        }
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(12.dp))
                .neumorphic(neuShape = Pressed.Rounded(12.dp))
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                DepartureDropdownMenu()
                Text("から次の発車まで",)
            }
            CountDownTimer(nextBusTime = LocalTime.now().plusHours(1)) {
                
            }

            Row {
                Text(text = "Next",color = Color(0xff979494),)
                Spacer(Modifier.weight(1f))
            }
            TimeTableWindow()
        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Preview(widthDp = 300, showBackground = true)
@Composable
fun AppPreview(){
    CistCatApp()
}
package com.example.cist_cat.atoms

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cist_cat.ui.theme.CISTCaTTheme
import me.nikhilchaudhari.library.neumorphic
import me.nikhilchaudhari.library.shapes.Pressed

data class BusList(val hour:String, val minute:String, val remark:Int)

val dummy:MutableList<BusList> = mutableListOf(
    BusList(hour = "18", minute = "45", remark = 0),
    BusList(hour = "19", minute = "05", remark = 0),
    BusList(hour = "19", minute = "25", remark = 1),
    BusList(hour = "20", minute = "15", remark = 1),
    BusList(hour = "21", minute = "00", remark = 0),
    BusList(hour = "21", minute = "35", remark = 2)
)

@Composable
fun DirectionToggle() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .size(330.dp, 230.dp)
            .clip(RoundedCornerShape(12.dp))
            .neumorphic(neuShape = Pressed.Rounded(12.dp))
            .padding(12.dp)
            .verticalScroll(rememberScrollState())
    ){
        for (bus:BusList in dummy) {
            val busTime:String = bus.hour + ":" + bus.minute

                Row (modifier = Modifier) {
                    for (i in 1..bus.remark) {
                        Text(
                            text = "*",
                            color =
                            if (bus.remark == 1) Color(0xffffa59f)
                            else Color(0xffa79fff),
                            fontSize = 28.sp
                        )
                    }
                    Text(text = busTime, fontSize = 28.sp)
                }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TimeTableWindow() {
    CISTCaTTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            DirectionToggle()
        }
    }
}
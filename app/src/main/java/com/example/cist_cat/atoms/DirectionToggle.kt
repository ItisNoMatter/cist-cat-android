package com.example.cist_cat.atoms


import androidx.compose.foundation.layout.Row
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

import androidx.compose.ui.tooling.preview.Preview
import com.example.cist_cat.ui.theme.CISTCaTTheme

@Composable
fun DirectionToggle(){
    val outwardTrip = remember { mutableStateOf(true) }
    if(outwardTrip.value){
        Row{
            Button(
                colors = ButtonDefaults.textButtonColors(
                    backgroundColor = androidx.compose.ui.graphics.Color(0xFFFFA59F),
                    contentColor = androidx.compose.ui.graphics.Color.White,
                    disabledContentColor = androidx.compose.ui.graphics.Color.LightGray
                ),
                onClick = {}
            ){
                Text("往路")
            }
            Button(
                colors = ButtonDefaults.textButtonColors(
                    backgroundColor = androidx.compose.ui.graphics.Color.White,
                    contentColor = androidx.compose.ui.graphics.Color.Gray,
                    disabledContentColor = androidx.compose.ui.graphics.Color.LightGray
                ),
                onClick = { outwardTrip.value = !outwardTrip.value }
            ){
                Text("復路")
            }
        }
    }else{
        Row{
            Button(
                colors = ButtonDefaults.textButtonColors(
                    backgroundColor = androidx.compose.ui.graphics.Color.White,
                    contentColor = androidx.compose.ui.graphics.Color.Gray,
                    disabledContentColor = androidx.compose.ui.graphics.Color.LightGray
                ),
                onClick = { outwardTrip.value = !outwardTrip.value }
            ){
                Text("往路")
            }
            Button(
                colors = ButtonDefaults.textButtonColors(
                    backgroundColor = androidx.compose.ui.graphics.Color(0xFFFFA59F),
                    contentColor = androidx.compose.ui.graphics.Color.White,
                    disabledContentColor = androidx.compose.ui.graphics.Color.LightGray
                ),
                onClick = {}
            ){
                Text("復路")
            }
        }
    }

}

@Preview(showBackground = true, widthDp = 320)
@Composable
private fun DirectionTogglePreview(){
    CISTCaTTheme {
        DirectionToggle()
    }
}
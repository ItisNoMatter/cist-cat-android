package com.example.cist_cat.atoms

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import me.nikhilchaudhari.library.neumorphic
import me.nikhilchaudhari.library.shapes.Pressed


@Composable
fun DepartureDropdownMenu(departure: String) {
    val stop = listOf<String>("千歳","南千歳","研究棟","本部棟")
    var expanded by remember { mutableStateOf(false) }


    Row(
        modifier = Modifier
            .padding(vertical = 24.dp)
            .size(75.dp, 50.dp)
            .clip(RoundedCornerShape(12.dp))
            .neumorphic(neuShape = Pressed.Rounded(10.dp))
            .padding(12.dp)
    )
    {
        IconButton(onClick = { expanded = true }) {
            Text(
                text = departure,
                )
        }
        DropdownMenu(
            modifier = Modifier
                .neumorphic(neuShape = Pressed.Rounded(10.dp)),
            expanded = expanded,
            onDismissRequest = { expanded = false },

            )
        {
            Column {
                for (i in 0..3) {
                    DropdownMenuItem(onClick = {

                    }) {
                        Text( text = stop[i] )
                    }
                    Divider()
                }
            }
        }
    }
}


@Composable
@Preview
fun DepartureDropdownMenuPreview() {
    DepartureDropdownMenu(departure = "行き先")
}




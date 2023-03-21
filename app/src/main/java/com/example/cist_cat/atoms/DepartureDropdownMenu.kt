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
fun DepartureDropdownMenu() {
    var expanded by remember { mutableStateOf(false) }

    Row(
        modifier = Modifier
            .padding(32.dp)
            .size(300.dp, 100.dp)
            .clip(RoundedCornerShape(12.dp))
            .neumorphic(neuShape = Pressed.Rounded(12.dp))
            .padding(12.dp)
    )
    {
        IconButton(onClick = { expanded = true }) {
            Text(text = "行き先")
        }
        DropdownMenu(
            modifier = Modifier
                .neumorphic(neuShape = Pressed.Rounded(12.dp)),
            expanded = expanded,
            onDismissRequest = { expanded = false },

            )
        {

            Column {
                DropdownMenuItem(onClick = { /*TODO*/ }) {
                    Text(text = "千歳駅")
                }
                Divider()
                DropdownMenuItem(onClick = { /*TODO*/ }) {
                    Text(text = "南千歳駅")
                }
                Divider()
                DropdownMenuItem(onClick = { /*TODO*/ }) {
                    Text(text = "研究棟")
                }
            }
        }
    }
}

@Composable
@Preview
fun DepartureDropdownMenuPreview() {
    DepartureDropdownMenu()
}




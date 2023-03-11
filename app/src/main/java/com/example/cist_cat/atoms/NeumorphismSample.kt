package com.example.cist_cat.atoms

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cist_cat.ui.theme.CISTCaTTheme
import me.nikhilchaudhari.library.neumorphic
import me.nikhilchaudhari.library.shapes.Pressed

@Composable
fun NeumorphismSample(name: String) {
    Row(
        modifier = Modifier
            .padding(32.dp)
            .size(300.dp, 100.dp)
            .clip(RoundedCornerShape(12.dp))
            .neumorphic(neuShape = Pressed.Rounded(12.dp))
            .padding(12.dp)
    ){
        Text(text = name)
    }

}

@Preview(showBackground = true)
@Composable
fun NeumorphismSamplePreview() {
    CISTCaTTheme {
        NeumorphismSample(name = "Android")
    }
}
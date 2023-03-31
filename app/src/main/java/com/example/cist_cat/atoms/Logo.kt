package com.example.cist_cat.atoms
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.cist_cat.R


@Composable
fun Logo(modifier: Modifier = Modifier,){
    Image(
        modifier = modifier,
        painter = painterResource(R.drawable.logo),
        contentDescription ="logo" )
}
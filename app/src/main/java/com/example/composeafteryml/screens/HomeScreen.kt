package com.example.composeafteryml

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.composeafteryml.global.Screen

@Composable
fun HomeScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize().background(androidx.compose.ui.graphics.Color.Red), contentAlignment = Alignment.Center)
    {
        Text(modifier = Modifier.clickable {
            navController.navigate(route = "detail_screen/"+1)
                                           } ,
            text = "Home",
            color = MaterialTheme.colors.primary,
            fontSize = 15.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(navController = rememberNavController())
}
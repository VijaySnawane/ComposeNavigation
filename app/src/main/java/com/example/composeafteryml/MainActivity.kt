package com.example.composeafteryml

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.composeafteryml.screens.A
import com.example.composeafteryml.ui.theme.ComposeAfterYmlTheme

class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAfterYmlTheme {
                A()
            }
        }
    }
}
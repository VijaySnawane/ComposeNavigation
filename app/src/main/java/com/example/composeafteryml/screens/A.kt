package com.example.composeafteryml.screens

import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navDeepLink
val uri = "https://www.example.com"
@Composable
fun A() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.B.route)
    {
        composable(route = Screen.B.route)
        {
            B(navController)
        }
        composable(route = Screen.C.route,
            deepLinks = listOf(navDeepLink { uriPattern = "$uri/{id}" }))
        { backStackEntry ->
            val dogId = backStackEntry.arguments?.getString(DOGID)
            requireNotNull(dogId) { "dogId parameter wasn't found. Please make sure it's set!" }
            C(navController, dogId, navigateUp =
            {
                navController.popBackStack()
            })
        }
    }
}

@Composable
fun B(navHostController: NavHostController) {
    Text(text = "Vijay Sonawane", Modifier.clickable {
        navHostController.navigate("c/11")
    })
}

@Composable
fun C(navHostController: NavHostController, dogId: String, navigateUp: () -> Unit) {
    Text(text = "Sonali Sonawane ${dogId}", Modifier.clickable {
        navigateUp()
    })
}

sealed class Screen(val route: String) {
    object B : Screen("b")
    object C : Screen("c/{$DOGID}")
}

const val DOGID: String = "dogId"
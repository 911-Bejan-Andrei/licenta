package com.example.licenta.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.licenta.constants.AuthenticationScreen
import com.example.licenta.constants.Graph
import com.example.licenta.screens.auth.LoginScreen

fun NavGraphBuilder.authNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.AUTHENTICATION,
        startDestination = AuthenticationScreen.Login.route
    ) {
        composable(route = AuthenticationScreen.Login.route) {
            LoginScreen(
                onClick = {
                    navController.popBackStack()
                    navController.navigate(Graph.MAIN)
                },
            )
        }
    }
}

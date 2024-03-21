package com.example.licenta.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.licenta.constants.BottomBarScreen
import com.example.licenta.constants.Graph
import com.example.licenta.screens.app.HomeScreen
import com.example.licenta.screens.app.LibraryScreen
import com.example.licenta.screens.app.SearchScreen

@Composable
fun MainNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.MAIN,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Search.route) {
            SearchScreen()
        }
        composable(route = BottomBarScreen.Library.route) {
            LibraryScreen()
        }
    }
}

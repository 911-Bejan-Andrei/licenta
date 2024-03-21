package com.example.licenta.screens.app

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.licenta.custom_composables.BottomBarNavigation
import com.example.licenta.graphs.MainNavGraph

@SuppressLint("UnusedMaterialScaffoldPaddingParameter", "UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavHostController = rememberNavController()) {
    Scaffold(
        bottomBar = { BottomBarNavigation(navController = navController) }
    ) {
        MainNavGraph(navController = navController)
    }
}


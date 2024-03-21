package com.example.licenta

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.licenta.ui.theme.LicentaTheme
import com.example.licenta.graphs.RootNavigationGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LicentaTheme {
                RootNavigationGraph(navController = rememberNavController())
            }
        }
    }
}
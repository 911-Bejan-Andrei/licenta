package com.example.licenta.constants

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    data object Home : BottomBarScreen(
        route = "HOME",
        title = "HOME",
        icon = Icons.Default.Home
    )

    data object Search : BottomBarScreen(
        route = "SEARCH",
        title = "SEARCH",
        icon = Icons.Default.Search
    )

    data object Library : BottomBarScreen(
        route = "LIBRARY",
        title = "LIBRARY",
        icon = Icons.Default.Menu
    )
}
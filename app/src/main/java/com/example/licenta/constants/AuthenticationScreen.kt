package com.example.licenta.constants

sealed class AuthenticationScreen(val route: String) {
    data object Login : AuthenticationScreen(route = "LOGIN")
    object SignUp : AuthenticationScreen(route = "SIGN_UP")
    object Forgot : AuthenticationScreen(route = "FORGOT")
}
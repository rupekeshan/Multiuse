package com.rupekeshan.multiuse.presentation.navigation

sealed class Screen(val route: String) {
    object LoginScreen : Screen("login")
    object BookListScreen : Screen("booklist")
}
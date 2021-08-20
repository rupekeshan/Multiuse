package com.rupekeshan.multiuse.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rupekeshan.multiuse.presentation.screens.booklist.BookListScreen
import com.rupekeshan.multiuse.presentation.screens.login.LoginScreen


@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.LoginScreen.route){
        composable(Screen.LoginScreen.route){
            LoginScreen()
        }
        composable(Screen.BookListScreen.route){
            BookListScreen()
        }
    }
}
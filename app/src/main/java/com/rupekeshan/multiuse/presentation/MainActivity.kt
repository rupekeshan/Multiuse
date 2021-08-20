package com.rupekeshan.multiuse.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import com.rupekeshan.multiuse.presentation.screens.booklist.BookListScreen
import com.rupekeshan.multiuse.presentation.theme.DefaultTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DefaultTheme {
                // A surface container using the 'background' color from the theme
                Column {
                    Text(text = "Master")
                    BookListScreen()
                }
            }
        }
    }
}
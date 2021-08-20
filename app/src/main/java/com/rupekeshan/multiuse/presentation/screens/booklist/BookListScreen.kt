package com.rupekeshan.multiuse.presentation.screens.booklist

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun BookListScreen(bookListViewModel: BookListViewModel = hiltViewModel()) {
    LazyColumn {
        items(bookListViewModel.book.value) { data ->
            Row {
                Text(text = data.isbn, color = Color.Black)
                Text(text = data.title)
            }
        }
    }

}
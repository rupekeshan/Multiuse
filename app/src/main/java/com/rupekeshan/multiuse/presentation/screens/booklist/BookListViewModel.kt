package com.rupekeshan.multiuse.presentation.screens.booklist

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rupekeshan.multiuse.domain.BookItem
import com.rupekeshan.multiuse.repo.BookRepository
import com.rupekeshan.multiuse.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class BookListViewModel @Inject constructor(val bookRepository: BookRepository) : ViewModel() {

    var book = mutableStateOf<List<BookItem>>(listOf())

    init {
        getBook()
    }

    private fun getBook(){
        viewModelScope.launch {
            val result = bookRepository.getBooks();
            when (result) {
                is Resource.Success -> {
                    book.value = result.data!!
                }
                is Resource.Error -> {

                }
            }
        }
    }


}
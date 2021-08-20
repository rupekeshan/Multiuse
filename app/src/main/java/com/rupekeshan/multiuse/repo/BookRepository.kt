package com.rupekeshan.multiuse.repo

import com.rupekeshan.multiuse.data.network.BookFirebase
import com.rupekeshan.multiuse.domain.BookItem
import com.rupekeshan.multiuse.util.Resource
import javax.inject.Inject

class BookRepository @Inject constructor(
    val firebase: BookFirebase
) {

    suspend fun getBooks(): Resource<MutableList<BookItem>> {
        return Resource.Success(firebase.getBook())
    }
}
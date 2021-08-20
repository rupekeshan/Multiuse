package com.rupekeshan.multiuse.data.network

import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.rupekeshan.multiuse.domain.BookItem
import kotlinx.coroutines.tasks.await

class BookFirebase {

    private val firestore = Firebase.firestore

    suspend fun getBook(): MutableList<BookItem> {
        return firestore.collection("books").get().await().toObjects(BookItem::class.java)
    }
}
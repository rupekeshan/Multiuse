package com.rupekeshan.multiuse.domain

data class BookItem(
    val authors: List<String> = listOf(),
    val categories: List<Any> = listOf(),
    val isbn: String = "",
    val longDescription: String = "",
    val pageCount: Int = 0,
    val publishedDate: HashMap<String,String> = hashMapOf(),
    val shortDescription: String = "",
    val status: String = "",
    val thumbnailUrl: String = "",
    val title: String = ""
){
    override fun toString(): String {
        return "BookItem(authors=$authors, categories=$categories, isbn='$isbn', longDescription='$longDescription', pageCount=$pageCount, publishedDate=$publishedDate, shortDescription='$shortDescription', status='$status', thumbnailUrl='$thumbnailUrl', title='$title')"
    }
}

package com.example.dictionaryapp.data.api.dto.model

data class WordItem(
    val word: String,
    val meanings: List<Meaning>,
    val phonetic: String
) {
    companion object {
    }
}
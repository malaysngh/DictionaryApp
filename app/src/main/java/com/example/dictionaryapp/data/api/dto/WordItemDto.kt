package com.example.dictionaryapp.data.api.dto

data class WordItemDto(
    val meanings: List<MeaningDto>?=null,
    val word: String?=null,
    val phonetic: String? = null
)
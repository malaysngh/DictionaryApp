package com.example.dictionaryapp.presentation

import com.example.dictionaryapp.data.api.dto.model.WordItem

data class MainState(
    val isLoading: Boolean = false,
    val searchWord: String = "",

    val wordItem: WordItem? = null
)
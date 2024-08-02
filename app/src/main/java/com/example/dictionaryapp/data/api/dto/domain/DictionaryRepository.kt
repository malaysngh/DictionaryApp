package com.example.dictionaryapp.data.api.dto.domain

import com.example.dictionaryapp.data.api.dto.model.WordItem
import com.example.dictionaryapp.utils.Result
import kotlinx.coroutines.flow.Flow

interface DictionaryRepository {
    suspend fun getWordResult(
        word: String
    ): Flow<Result<WordItem>>
}
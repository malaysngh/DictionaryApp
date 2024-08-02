package com.example.dictionaryapp.data.api.dto

data class MeaningDto(
    val definitions: List<DefinitionDto>?=null,
    val partOfSpeech: String?=null

)
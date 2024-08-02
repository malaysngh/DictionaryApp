package com.example.dictionaryapp.data.api.dto.mapper

import com.example.dictionaryapp.data.api.dto.DefinitionDto
import com.example.dictionaryapp.data.api.dto.MeaningDto
import com.example.dictionaryapp.data.api.dto.WordItemDto
import com.example.dictionaryapp.data.api.dto.model.Definition
import com.example.dictionaryapp.data.api.dto.model.Meaning
import com.example.dictionaryapp.data.api.dto.model.WordItem


fun WordItemDto.toWordItem() = WordItem (
    word = word ?: "",
    meanings = meanings?.map {
        it.toMeaning()
    } ?: emptyList(),
    phonetic = phonetic ?: ""
)

fun MeaningDto.toMeaning() = Meaning(
    definition = definitionDtoToDefinition(definitions?.get(0)),
    partOfSpeech = partOfSpeech ?: ""
)


fun definitionDtoToDefinition(
    definitionDto: DefinitionDto?
) = Definition(
    definition = definitionDto?.definition ?: "",
    example = definitionDto?.example ?: ""
)
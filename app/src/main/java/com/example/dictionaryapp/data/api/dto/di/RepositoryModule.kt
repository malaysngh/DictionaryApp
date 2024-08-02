package com.example.dictionaryapp.data.api.dto.di

import com.example.dictionaryapp.data.api.dto.domain.DictionaryRepository
import com.example.dictionaryapp.data.api.dto.repository.DictionaryRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindDictionaryRepository(
        dictionaryRepositoryImpl: DictionaryRepositoryImpl
    ): DictionaryRepository

}
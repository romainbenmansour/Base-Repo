package com.icarie.data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Dispatchers
import javax.inject.Qualifier
import kotlin.coroutines.CoroutineContext

@Qualifier
annotation class RepositoryCoroutineContext

@Module
@InstallIn(SingletonComponent::class)
class CoroutineModule {

    @Provides
    @RepositoryCoroutineContext
    fun provideRepositoryCoroutineContext(): CoroutineContext =
        Dispatchers.IO + CoroutineName("Repository")
}

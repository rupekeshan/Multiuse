package com.rupekeshan.multiuse.di

import com.rupekeshan.multiuse.data.network.BookFirebase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    @Singleton
    fun provideNetwork(): BookFirebase {
        return BookFirebase();
    }

}
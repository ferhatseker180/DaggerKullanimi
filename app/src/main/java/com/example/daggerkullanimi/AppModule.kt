package com.example.daggerkullanimi

import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    fun provideAdres() : Adres {

        return Adres("Karabağlar/İzmir")
    }
}
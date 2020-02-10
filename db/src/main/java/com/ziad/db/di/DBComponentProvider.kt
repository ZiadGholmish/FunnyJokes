package com.ziad.db.di

interface DBComponentProvider {
    fun provideDbComponent(): DBComponent
}
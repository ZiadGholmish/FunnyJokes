package com.ziad.db_prepare

interface DBPreparer {
    suspend fun prepareData(): Boolean
}
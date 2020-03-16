package com.ziad.db.repo.impl

import com.ziad.db.db.JokesDao
import com.ziad.db.entities.JokeEntity
import com.ziad.db.repo.interfaces.JokesRepo

class JokesRepoImpl(private val jokesDao: JokesDao) : JokesRepo {
    override suspend fun get(id: String): List<JokeEntity> {
        return jokesDao.get(id)
    }

    override suspend fun getAll(): List<JokeEntity> {
        return jokesDao.getAll().sortedBy { it.score }
    }

    override suspend fun getAllByCategory(category: String): List<JokeEntity> {
        return jokesDao.getAllByCategory(category = category).sortedBy { it.score }

    }

    override suspend fun insert(jokes: JokeEntity) {
        return jokesDao.insert(jokes)
    }

    override suspend fun update(joke: JokeEntity) {
        jokesDao.update(joke)
    }

    override suspend fun delete(joke: JokeEntity) {
        jokesDao.delete(joke)
    }
}
package com.ziad.base

sealed class ResultModel<out T : Any>
data class Success<T : Any>(val data: T) : ResultModel<T>()
data class Failure(val error: String) : ResultModel<Nothing>()


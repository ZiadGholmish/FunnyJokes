package com.ziad.base

sealed class RequestState {

    object Loading : RequestState()

    object Complete : RequestState()

}
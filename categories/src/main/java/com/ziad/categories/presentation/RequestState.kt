package com.ziad.categories.presentation

sealed class RequestState {

    object Loading : RequestState()

    object Complete : RequestState()

}
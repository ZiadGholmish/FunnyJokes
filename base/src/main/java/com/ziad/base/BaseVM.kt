package com.ziad.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class BaseVM : ViewModel() {
    val emptyState = MutableLiveData<Boolean>()
    val requestState = MutableLiveData<RequestState>()
    val errorState = MutableLiveData<Failure>()
}
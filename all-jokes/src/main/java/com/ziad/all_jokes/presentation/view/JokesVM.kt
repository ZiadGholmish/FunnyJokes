package com.ziad.all_jokes.presentation.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ziad.all_jokes.data.models.Joke
import com.ziad.all_jokes.domain.usecases.GetAllJokesUseCase
import com.ziad.base.RequestState
import kotlinx.coroutines.launch
import javax.inject.Inject


class JokesVM @Inject constructor(private val getAllJokesUseCase: GetAllJokesUseCase) :
    ViewModel() {

    private val jokesList: MutableLiveData<List<Joke>> = MutableLiveData()
    fun jokes(): LiveData<List<Joke>> = jokesList
    val emptyState = MutableLiveData<Boolean>()
    val requestState = MutableLiveData<RequestState>()

    fun getJokes() {
        viewModelScope.launch {
            requestState.value = RequestState.Loading
            val cats = getAllJokesUseCase.execute()
            requestState.value = RequestState.Complete
            if (cats.isNullOrEmpty()) {
                emptyState.value = true
            } else {
                jokesList.value = cats
            }
        }
    }

}
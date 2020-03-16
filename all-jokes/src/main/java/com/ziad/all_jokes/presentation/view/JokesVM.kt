package com.ziad.all_jokes.presentation.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ziad.all_jokes.data.models.Joke
import com.ziad.all_jokes.domain.usecases.GetAllJokesUseCase
import com.ziad.base.RequestState
import com.ziad.favorites_core.usecases.FavJokeUseCase
import com.ziad.favorites_core.usecases.UnFavJokeUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject


class JokesVM @Inject constructor(
    private val getAllJokesUseCase: GetAllJokesUseCase,
    private val favJokeUseCase: FavJokeUseCase,
    private val unFavJokeUseCase: UnFavJokeUseCase
) :
    ViewModel() {

    private val jokesList: MutableLiveData<List<Joke>> = MutableLiveData()
    fun jokes(): LiveData<List<Joke>> = jokesList

    val emptyState = MutableLiveData<Boolean>()
    val requestState = MutableLiveData<RequestState>()

    fun getJokes(category: String?) {
        viewModelScope.launch {
            requestState.value = RequestState.Loading
            val cats = getAllJokesUseCase.execute(category = category)
            requestState.value = RequestState.Complete
            if (cats.isNullOrEmpty()) {
                emptyState.value = true
            } else {
                jokesList.value = cats
            }
        }
    }

    fun fav(jokeId: String) {
        viewModelScope.launch {
            val updatedList = jokesList.value?.map {
                if (it.id == jokeId)
                    return@map it.copy(isFav = true)
                return@map it
            }
            jokesList.postValue(updatedList)
            favJokeUseCase.execute(jokeId)
        }
    }

    fun unFav(jokeId: String) {
        viewModelScope.launch {
            val updatedList = jokesList.value?.map {
                if (it.id == jokeId)
                    return@map it.copy(isFav = false)
                return@map it
            }
            jokesList.postValue(updatedList)
            unFavJokeUseCase.execute(jokeId)
        }
    }

}
package com.ziad.favorites.presentation.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ziad.base.RequestState
import com.ziad.favorites.data.models.FavJoke
import com.ziad.favorites.domain.usecases.GetFavsJokesUseCase
import com.ziad.favorites_core.usecases.FavJokeUseCase
import com.ziad.favorites_core.usecases.UnFavJokeUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

class FavsViewModel @Inject constructor(
    private val favsJokesUseCase: GetFavsJokesUseCase,
    private val favJokeUseCase: FavJokeUseCase,
    private val unFavJokeUseCase: UnFavJokeUseCase
) :
    ViewModel() {

    private val jokesList: MutableLiveData<List<FavJoke>> = MutableLiveData()
    fun jokes(): LiveData<List<FavJoke>> = jokesList

    val emptyState = MutableLiveData<Boolean>()
    val requestState = MutableLiveData<RequestState>()

    fun getFavs() {
        viewModelScope.launch {
            requestState.value = RequestState.Loading
            val cats = favsJokesUseCase.execute()
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
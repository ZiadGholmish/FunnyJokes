package com.ziad.categories.presentation.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ziad.categories.data.models.Category
import com.ziad.categories.domain.usecases.GetAllCategoriesUseCase
import com.ziad.base.RequestState
import kotlinx.coroutines.launch
import javax.inject.Inject

class CategoriesVM @Inject constructor(private val getAllCategoriesUseCase: GetAllCategoriesUseCase) :
    ViewModel() {

    private val categoriesList: MutableLiveData<List<Category>> = MutableLiveData()
    fun categories(): LiveData<List<Category>> = categoriesList
    val emptyState = MutableLiveData<Boolean>()
    val requestState = MutableLiveData<com.ziad.base.RequestState>()

    fun getCategories() {
        viewModelScope.launch {
            requestState.value =
                com.ziad.base.RequestState.Loading
            val cats = getAllCategoriesUseCase.execute()
            requestState.value =
                com.ziad.base.RequestState.Complete
            if (cats.isNullOrEmpty()) {
                emptyState.value = true
            } else {
                categoriesList.value = cats
            }
        }
    }

}
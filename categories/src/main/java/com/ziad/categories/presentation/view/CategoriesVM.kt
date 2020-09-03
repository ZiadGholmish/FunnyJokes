package com.ziad.categories.presentation.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ziad.base.BaseVM
import com.ziad.base.Failure
import com.ziad.categories.data.models.Category
import com.ziad.categories.domain.usecases.GetAllCategoriesUseCase
import com.ziad.base.RequestState
import com.ziad.base.Success
import kotlinx.coroutines.launch
import javax.inject.Inject

class CategoriesVM @Inject constructor(private val getAllCategoriesUseCase: GetAllCategoriesUseCase) :
    BaseVM() {

    private val categoriesList: MutableLiveData<List<Category>> = MutableLiveData()
    fun categories(): LiveData<List<Category>> = categoriesList

    fun getCategories() {
        viewModelScope.launch {
            requestState.value = RequestState.Loading
            getAllCategoriesUseCase.execute().let { result ->
                when (result) {
                    is Success<List<Category>> -> {
                        if (result.data.isNullOrEmpty()) {
                            emptyState.value = true
                        } else {
                            categoriesList.value = result.data
                        }
                    }
                    is Failure -> {
                        errorState.value = result
                    }
                }
            }
            requestState.value = RequestState.Complete
        }
    }

}
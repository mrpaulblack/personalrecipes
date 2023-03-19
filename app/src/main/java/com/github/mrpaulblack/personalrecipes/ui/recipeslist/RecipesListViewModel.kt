package com.github.mrpaulblack.personalrecipes.ui.recipeslist

import androidx.lifecycle.ViewModel
import com.github.mrpaulblack.personalrecipes.data.IRepository
import com.github.mrpaulblack.personalrecipes.data.Repository

class RecipesListViewModel : ViewModel() {
    private val data: IRepository = Repository()

    val recipesList = data.firebaseGetOverview()
}
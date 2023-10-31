package com.example.sqc.Presentation.viewModel

import androidx.lifecycle.ViewModel
import com.example.sqc.data.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class MainViewModel @Inject constructor(private val mainRepository: MainRepository):ViewModel() {
    val data = mainRepository.getDetails()
}
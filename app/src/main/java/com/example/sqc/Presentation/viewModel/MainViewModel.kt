package com.example.sqc.Presentation.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sqc.Presentation.utils.LoginInfo
import com.example.sqc.data.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class MainViewModel @Inject constructor(private val mainRepository: MainRepository):ViewModel() {

    fun getToken(email:String, password:String){
        val data = viewModelScope.launch {
            mainRepository.getDetails(LoginInfo(email = email,password=password))
        }
    }

}

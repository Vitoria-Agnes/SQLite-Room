package com.exercicio4.msqlitecomroom

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.exercicio4.msqlitecomroom.date.UserDatabase
import com.exercicio4.msqlitecomroom.date.UserRepository
import com.exercicio4.msqlitecomroom.date.Usuario
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel (application: Application): AndroidViewModel(application){

    val selectUsers : LiveData<List<Usuario>>
    val repository : UserRepository

    init {
        val userDao = UserDatabase.getDatabase(application).userDao()
        repository = UserRepository(userDao)
        selectUsers = repository.selectUsers
    }

    fun addUser(usuario: Usuario){
        viewModelScope.launch(Dispatchers.IO){
            repository.addUser(usuario)
        }
    }
}
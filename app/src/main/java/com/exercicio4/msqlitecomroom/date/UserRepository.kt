package com.exercicio4.msqlitecomroom.date

import com.exercicio4.msqlitecomroom.date.UserDao
import com.exercicio4.msqlitecomroom.date.Usuario

class UserRepository (private val userDao: UserDao) {

    val selectUsers= userDao.selecUsers()

    fun addUser(usuario: Usuario){
        userDao.addUser(usuario)
    }
}
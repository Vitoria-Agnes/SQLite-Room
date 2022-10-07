package com.exercicio4.msqlitecomroom.date

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "user_table")
class Usuario(

    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val nome : String,
    val sobrenome: String,
    var idade : Int
) {
}
package com.fei.kotlinapp

/**
 * Created by Kennen on 2017/11/15.
 */
interface IUserView {

    fun getID(): Int
    fun getUserName(): String
    fun getAge(): Int
    fun setUsername(username: String)
    fun setAge(age: Int)
    fun onSaveSuccess()

}
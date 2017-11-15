package com.fei.kotlinapp

/**
 * Created by Kennen on 2017/11/15.
 */
interface IUserPresenter {

    fun saveUser(id: Int, username: String, age: Int)
    fun loadUser(id: Int)

}
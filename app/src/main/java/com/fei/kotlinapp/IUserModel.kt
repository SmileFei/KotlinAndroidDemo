package com.fei.kotlinapp

/**
 * Created by Kennen on 2017/11/15.
 */
interface IUserModel {

    fun setId(id: Int)
    fun setUsername(username: String)
    fun setAge(age: Int)
    fun save()
    fun load(id: Int): User

}
package com.fei.kotlinapp

import android.util.Log

/**
 * Created by Kennen on 2017/11/15.
 */
class UserPresenter(val view: IUserView) : IUserPresenter {

    private val mUserModel: UserModel = UserModel()

    override fun saveUser(id: Int, username: String, age: Int) {
        Log.d("test_log", "saveUser : $id,$username,$age")
        mUserModel.setId(id)
        mUserModel.setUsername(username)
        mUserModel.setAge(age)
        mUserModel.save()
        view.onSaveSuccess()
    }

    override fun loadUser(id: Int) {
        Log.d("test_log", "loadUser : $id")
        val user = mUserModel.load(id)
        view.setUsername(user.userName)
        view.setAge(user.age)
    }


}
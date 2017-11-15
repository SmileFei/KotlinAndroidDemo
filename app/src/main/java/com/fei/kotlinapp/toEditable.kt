package com.fei.kotlinapp

import android.text.Editable

/**
 * Created by Kennen on 2017/11/15.
 */
fun toEditable(str: String): Editable {
    return Editable.Factory().newEditable(str)
}
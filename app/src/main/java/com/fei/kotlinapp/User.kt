package com.fei.kotlinapp

/**
 * 数据类
 *
 * 要求：
 * 1、主构造函数应该至少有一个参数；
 * 2、主构造函数的所有参数必须标注为 val 或者 var ；
 * 3、数据类不能是 abstract，open，sealed，或者 inner ；
 * 4、数据类不能继承其它的类（但可以实现接口）。
 * 5、在 JVM 中如果构造函数是无参的，则所有的属性必须有默认的值，(参看Constructors);
 *
 * Created by Kennen on 2017/11/14.
 */
data class User(val userName: String, val age: Int){
    val userId: String = ""
    val userNumber: Double = 0.0

}
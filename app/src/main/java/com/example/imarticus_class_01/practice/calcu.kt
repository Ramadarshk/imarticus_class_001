package com.example.imarticus_class_01.practice

class Calcu(var i: Int ,var  i1: Int) {
    fun add(a: Int , b: Int): Int {
        return a + b
    }

    fun multiply(a: Int , b: Int): Int {
        return a * b
    }
}
fun main(){
    data class User(var name: String)
    val user = Calcu(i=0,i1=2)
  user.apply{ i = 4
      i1=5
    pr(add(i,i1).toString())
    }
println(user)
    //println(modifiedUser)
}

fun pr(name: String) {
println(name)
}



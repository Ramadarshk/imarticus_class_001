package com.example.imarticus_class_01.practice

// ctrl+shift+a for all shortcut in android studio
 class student(var regno:String, var name:String,var classno:String)

val upperCase1: (String) -> String = { str: String -> str.uppercase() }
val upperCase2: (String) -> String = { str -> str.uppercase() }
val upperCase3 = { str: String -> str.uppercase() }
val upperCase5: (String) -> String = { it.uppercase() }
val upperCase6: (String) -> String = String::uppercase

val sumlambd:(Int ,Int)->Int= {a:Int,b:Int-> a+b }
val messageprint:(Int, Int,String)->Int= {a:Int,b:Int,c:String ->
 println("message is $c ra dutta")
a*b}
val hell:(Int,String)->String= { a , b ->
 "person Id is $b and password is $a"
}
var kel={i:Int-> i+30}
val kele  = ::keri
fun keri(b:Int,c:Int):Int{
 return b+c
}
fun tr(a:Int,b:Int,twodigit:(Int)->String):String{
 return "${twodigit(a)}  ${twodigit(b)}"
}

fun main()
{
 val b:(Int)->String={a->
  if (a<10){
   "0$a"
  }
  else{
   "$a"
  }
 }
 println(tr(4,6,b))
 println(kele(10,50))
 println(kel(90))
 println(sumlambd(10,20))
 println(messageprint(10,20,"hello"))
 println(hell(1020,"admin"))
 println(upperCase1("hello"))
println(upperCase2("hello"))
println(upperCase3("hello"))
println(upperCase5("hello"))
println(upperCase6("hello"))}

//In order to understand partially applied functions
//first we should understand fullyAppiled functions
//  a fuulyapplied functions is we use used all the arguments at a time  in a
//function
//ex:
//  def main(x:Int,y:Int)={
//    return x+y
//  }
//  println(main(20,30))

//A partilly applied is a function is where we are going to use wild card characters
//  in a function
//example
//def sun(x:Int,y:int)={
//  return x+y
//}
//val sum=sun(10,_)
//
//println(sum(10))
//
//
//object Hello{
//  def sum(x:Int,y:Int,z:Int)={
//    x+y+z
//  }
//  def main(args:Array[String]): Unit = {
//    var x=sum(20,30,_)
//    println(x(10))
//
//  }
//}
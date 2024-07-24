//Currying:
//  the process of transforming a function that takes multiple arguments
//    into a function that takes single argument is known as
//    currying a function.
//
//object Hello{
//
//  def sum(x:Int,y:Int)=x+y
//  def sum1(x:Int)=(y:Int)=>x+y
//  def sum2(x:Int)(y:Int)=x+y
//  def main(args:Array[String]): Unit = {
//
////    println(sum(20,30))
////    println(sum1(20)(30))
////val add=sum1(20)(_)
////    println(add(30))
////
////println(sum2(20)(30))
//val add2=sum2(30)_
//    println(add2(20))
//
//  }
//}
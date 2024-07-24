//closure:
//  basically a closure is a function which  can acces a variable declred inside or outside a
//    function .
//
//      syntax:
//        var num=10
//    def sum(x)=>x+num
//
//the below function uses a variable which is declared outside the function
//object Hello{
//  var num=10
//  def sum(x:Int)=x+num
//  def main (args:Array[String]): Unit = {
//    println(sum(20))
//
//  }
//}
//
//we have two types of closure namely
//Impure closure and pure closure
//a closure is said to be impure if the variable used by function is declared by using
//  a keyword called var
//why becuase the behaviour of that variable is changing if it is declared with var as it is mutable
//
//
//object Hello{
//  var num=45
//  def sum(x:Int)={
//    num=x+num
//    num
//  }
//  def main(args:Array[String]): Unit = {
////    num=105
//
//    sum(25)
////    println(num)
//
//  }
//}
//
//pure Closure:
//  A closure is said to be a pure closure if the variable is declared with a keyword called val
//as we know that when we declare a variable with val keyword it is immutable.
//  so the value cant be updated.
//
//object Hello{
//
//  val num=40
//  def sum(x:Int)={
//    x+num
//  }
//  def main(args:Array[String]): Unit = {
//
//    println(sum(45))
//    println(num)
//
//  }
//}




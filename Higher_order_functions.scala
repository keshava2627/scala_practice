//Higher order functions:
//  basically an higher order function is type of function which can take
//    function as an argument and returns function as a result
//
//syntax:
//  def fuction_name(x:datatype,y:datatype,f:(datatype,datatype)=>datatype):datatype=f(var1,var2)


//object Hello{
//  def math(x:Double,y:Double,z:Double,f:(Double,Double)=>Double):Double=f(f(x,y),z)
//  def main(args:Array[String]): Unit = {
//    println(math(30,20,45,(x,y)=>x+y))
//
//  }
//}
//
//object Hello{
//  def fun(x:Int,y:Int,f:(Int,Int)=>Int)=f(x,y)
//  def main(args:Array[String]): Unit = {
//    println(fun(30,20,(x,y)=>x max y))
//  }
//}
//
//we can also use wildcard characters like _ in scala showing that beauty of scala over
//other programming languages.
//
//object Hello{
//  def fun(x:Int,y:Int,f:(Int,Int)=>Int)=f(x,y)
//  def main(args:Array[String]): Unit = {
//
//    println(fun(20,30,_ max _))
//
//  }
//}
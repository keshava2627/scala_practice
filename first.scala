
//every Scala Program will start from object Class name as similar to java
//and followed by def main is main function the function execution start from main function
//  it will take Array of String args as parameter.

//defining a variable in scala
//to define a variable in scala we can use either val or var keyword followed by variable name and then data type
//assigned to a value.
//syntax:
//      var x:Int=30; variable declaration and Intialization
//      val x:Int=30;
//the main difference between val and var is val is immutable whereas var is mutable.
//
//as we know mutable means the value can be reassigned or updated later whereas immutable means we cant
//  reassign or update the value. if we forcefully try to do that we will get an error like
//reassign is not possible in case of val
//as we know scala is statically typed means the variable can be declred along with the data type and
//that variable will accept that datatype values only.
//scala is inter operable means that either scala or java code can be used in your scala or java
////project.
//when a variable declared with keyword called lazy that means it can only instantiate or assign the value to that
//  variable if and only if it is used atleast once at runtime.
//Syntax:
//       lazy val x:int=30;

//simple scala hello world program
//object Hello{
//  def main(args:Array[String]): Unit = {
//    println("hello from scala");
//
//  }
//}

//here the variable is globally accesed accross all the methods inside the object method.
//object Hello{
//  var x=30;
//  def main(args:Array[String]): Unit = {
//    println(x)
//
//  }
//}

//here you will get 25 as output as it can search variable locally if it finds a local variable inside main
//  method it can access and print that value.if it doesnt find any local variable declared it can search globally
//  wether the specified variable is declared.if it doesnt find any it will through an error called the variable variable ae is
//  not defined.
//object Hello{
//  var x=30;
//  def main(args:Array[String]): Unit = {
//    var x=25;
//    println(x)
//
//  }
//}

//as variable x is a type of var so it is mutable so the value can be reassigned or updated.

//object Hello{
//  def main(args:Array[String]): Unit = {
//    var x:Int=30
//    x=25;
//    println(x)
//
//  }
//}

//as we know val is immutable i.e that this variable cant be reassigned or updated later once declared
//  so here you will get an error when you run this particular code.
//object Hello{
//  val x=30;
//  def main(args:Array[String]): Unit = {
//    val x:int=30
//    x=25
//    println(x)
//
//  }
//}


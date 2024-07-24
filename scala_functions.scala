//funtions:
//  basically a function is said to be executed a block of code repeatedly.
//    when the logic is repeating again and again in our program flow
//    we can place that repeating code in a function and call them wherever we need
//  write once read many
//    syntax:
//    def functionName(arguments):return type={
//    statements to be executed.
//  }

//here w write a simple function that takes 2 arguments and return the addition of those numbers
//
//object Hello{
//
//  def add(x:Int,y:Int):Int={
//    return x+y
//  }
//  def main(args:Array[String]): Unit = {
//
//    println(add(30,40))
//println((add(30,35)))
//
//  }
//}
//
//here if we are writing one line functions we have an option to ommit return keyord and curly braces as well
//  we can also ommit the return type if we doesnt know the return type of the function as well
//object Hello {
//  def add(x: Int, y: Int): Int = {
//    return x + y
//  }
//
//  def sub(x: Int, y: Int): Int = {
//    return x - y
//  }
//
//  def mul(x: Int, y: Int): Int = {
//    return x * y
//  }
//
//  def div(x: Int, y: Int): Int = {
//    return x / y
//  }
//
//  def main(args: Array[String]): Unit = {
//    println(add(20, 30))
//    println(sub(20, 30))
//    println(mul(20, 30))
//    println(div(20, 30))
//  }
//}
//
//
//here we can declare an object and place all our functions in that object
//and we can call that functions wherever we need we can consider it as a module or else it as a package.
//
//object Hello{
//
//  object Math{
//    def add(x: Int, y: Int)= x + y
//
//    def sub(x: Int, y: Int)=x - y
//
//    def mul(x: Int, y: Int)=x * y
//
//    def div(x: Int, y: Int) = x / y
//    def square(x:Int)=x*x
////
//    def cube(x:Int)=x*x*x
//
//
//
//  }
//
//  def main(args:Array[String]): Unit = {
//
//    println(Math.add(30,20))
//    println(Math.sub(30,30))
//    println(Math.mul(30,30))
//    println(Math.div(30,30))
//    println(Math.square(30))
//    println(Math square 30)
//    println(Math cube 30 )
//
//  }
//}

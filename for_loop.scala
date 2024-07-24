//for loop using to function
//  basically for loop can be used when number of iterations is known.
//in scala for loop syntax as follows
//  for(i<-start to end){
//    statements to execute
//  }
//here to is method which will give a range and when we use to it will include both start and
//  end paramaeters.
//here we dont need to declare a variable using var keyword as for loop will automatically detect it as
//  a variable.

//
//object Hello{
//  def main(args:Array[String]): Unit = {
//    for(i<-1 to 10){
//      println("i="+i)
//    }
//  }
//}
//
//for loop Using untill
//  here untill will ommit the end parameter
//  and rest of the thing will be worked as for loop.
//  for(i<-1 untill 10){
//    statements to execute
//  }
//object Hello{
//  def main(args:Array[String]): Unit = {
//    for(i<-1 untill 10){
//      println("x="+i)
//    }
//  }
//}
//
//basically to and untill or methods in scala that will take a parameter
//for using to method.
//  for(i<-1.to(5)){
//    statements to execute.
//  }
//
//for(i<-1.untill(5)){
//  statements to execute.
//}
//
//object Hello{
//  def main(args:Array[String]): Unit = {
//    for(i<-1.to(30)){
//      println("x="+i)
//    }
//  }
//}
//
//object Hello{
//  def main(args:Array[String]): Unit = {
//    for(i<-1.until(5)){
//      println("x="+i)
//    }
//  }
//}

//object Hello{
//  def main(args:Array[String]): Unit = {
//    for(i<-1 until 10){
//      println("x="+i)
//    }
//  }
//}
//
//for loop iteration over a list
//  for(i<-lst){
//    statements to execute.
//  }
//object Hello{
//  def main(args:Array[String]): Unit = {
//    var lst=List(30,40,70,50)
//    for(i<-lst){
//      println("x="+i)
//    }
//  }
//}
//
//we can also filter the lst values  specifiying an if condition in for loop.
//  for(i<-lst;if i>5){
//    println("x="+i)
//  }


//object Hello{
//  def main(args:Array[String]): Unit = {
//    var lst=List(1,2,3,4,5,6,7,8,9)
//    for(i<-lst;if i<6){
//      println("x="+i)
//    }
//  }
//}

//
//we can also add multiple variables inside a for loop by specifying a semi-colon as follows
//  for(i<-1.to(5);j<-1.to(3)){
//    println(i+" "+j)
//  }
//
//object Hello{
//  def main(args:Array[String]): Unit = {
//    for(i<-1.to(30);j<-1.to(3)){
//      println(i+" "+j)
//    }
//  }
//}
//
//
//we can also use for loop as an expression we can assign it to variable.
//var res=for{i<-lst;if i<10} yeild{
//  statements to execute.
//}
//println(res)

//when we use yeild keyword it will always return List.
//
//object Hello{
//  def main(args:Array[String]): Unit = {
//    var lst=List(20,19,15,34,35,6,87,98)
//    var res=for{i<-lst;if i<=20} yield {
//      i
//    }
//    println(res)
//  }
//}
////Control Statements:
////       control statements are used to control flow of execution of your program
////         basically we have if else statements.
////    if (condition)== True{
////      execute this block of code.
////    }else{
////      execute this block of code
////    }
//
////
////here in this condition it evaluates to true so the if block code should be
////  executed.
//
////object Hello{
////  def main(args:Array[String]): Unit = {
////    var age:Int=20;
////
////    if(age>=18){
////      println("you are eligible to vote");
////    }else{
////      println("you are not eligible to vote");
////    }
////  }
////}
////
////
////Here in this secnario the condition 15>=18 evualtes to False so the else block should be executed.
////
////object Hello{
////  def main(args:Array[String]): Unit = {
////    var age=15;
////
////    if(age>=18){
////      println("you are eligible.");
////    }else{
////      println("you are not eligible.");
//////    }
////  }
////}
////
////
////object Hello{
////  def main(args:Array[String]): Unit = {
////    var age=40;
////    var res=if(age>=18)"you are eligible." else "you are not eligible";
////    println(res)
////  }
////}
//
////
////object Hello{
////  def main(args:Array[String]): Unit = {
////    var age=45;
////    if (age>=45) {
////      println("yes")
////    }
////  }
////}
//
//
//////in this secnario the if condition evalutes to true why because we are using logical or operator.
////as we know or operator will evaulates to true if either one of the condition is true.
////
////object Hello{
////  def main(args:Array[String]): Unit = {
////    var x=20;
////    var y=30;
////    if(x>=20 || y>30){
////      println("yes");
////    }else{
////      println("No");
////    }
////  }
//////}
////
////here in this secnario we are using logical and operator as we know that 
////  and operator will evalute true if both conditions evaulates to true.
////  here in this if condition the first condition x>=20 evaltes to true 
////and the other condition will evaltes to False so True and False will evualte to False in 
////logical and operator.
////object Hello{
////  def main(args:Array[String]): Unit = {
////    var x=20;
////    var y=30;
////
////    if(x>=20 && y>30){
////      println("yes");
////    }else{
////      println("No");
////    }
////  }
//}
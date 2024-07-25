//class:
//a class is nothing but blue print for creating an object.

class User(private var Name:String,var Age:Int){
  def printName(): Unit = {
    println(Name)
  }
}

object classes{
  def main(args:Array[String]): Unit = {
  var user=new User("sai",28);

    println(user.Age)
    user.Age=28
    println(user.Age)
    user.printName()
  }
}
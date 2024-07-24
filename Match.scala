//Match Expression:
//  basically match expression is smilaar to switch case in other programming langauages
//  whenever the given arugumnt satisifes the given case it will return that case and execute the follwoing block
//of code in that case.
//if it doesnt met any case it will catch by default error and w will print default as no
//  case is matched.
//we can also use match as an expresion and asign it to a value.
//  syntax as follows:
//  argument match{
//    case condition=>statements
//    case condition=>statements
//    case condition=>statements....
//    case _=>"default_value"
//  }

//object Hello{
//  def main(args:Array[String]): Unit = {
//    var x=100
//    x match{
//      case 10 => println(x)
//      case 20 => println(x)
//      case 40 => println(x)
//      case 35 => println(x)
//
//      case _=>println("deafult")
//    }
//  }
//}
//
//object Hello{
//  def main(args:Array[String]): Unit = {
//    var x=101
//    var res=x match{
//      case 30=>x
//      case 25=>x
//      case 100=>x
//      case _=>"default"
//    }
//    println(res)
//  }
//}
//
//object Hello{
//  def main(args:Array[String]): Unit = {
//    var x=3
//   var res= x match{
//      case 1|3|5|7|9 =>"odd"
//      case 2|4|6|8|10 =>"even"
//    }
//    println(res)
//  }
//}
//Options:
//  options is also a datatype which gives an instance of Some or None.

object Option{
  val lst=List(1,2,3)
  val map=Map(1->"Hello",2->"Hi",3->"good")
  val opt:Option[Int]=None
  def main(args:Array[String]): Unit = {
    println(lst.find(_>4).getOrElse("no value found."))//here getOrElse method will execute if it doesnt find any value satisfying the condition.
    println(map.get(4).getOrElse("no key found"))
    println(opt.isEmpty)
  }
}



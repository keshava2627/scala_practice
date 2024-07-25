//ReduceLeft:
//  reduce left is a method in scala that takes binary operator as an input and returns the result.
//ReduceRight:
//  reduce right is also do same like reduce left the only difference is it will start from right end
//    whereas reduce left start from left end.
//
//    flodleft:
//    flodleft is also a method in scala which works similar to reduceleft but the only difference is here we can pass a start value as an
//      initail argument.
//    fold right is also same
//
//  scan left &scan Right:
//    scan left&right is also methods in scala which works similar to foldleft but the only difference
//      is that scan will also give intermediate results.

//All these funtions can e applied on collection datatypes.

object Reduce{
  val lst=List(1,2,3,4,5,6,7,8,9,10)
  val names=List("ram","hello","hi")
  def main(args:Array[String]): Unit = {

    println(lst.reduceLeft(_+_))
    println(lst.reduceRight(_+_))
    println(lst.reduceLeft(_-_))
    println(lst.reduceRight(_-_))
    println(lst.foldLeft(2)(_+_))
    println(lst.foldRight(2)(_+_))
    println(names.reduceLeft(_+_))
    println(names.reduceRight(_+_))
    println(names.foldLeft("ki")(_+_))
    println(names.foldRight("ki")(_+_))
    println(lst.scanLeft(2)(_+_))
    println(names.scanLeft("KI")(_+_))

  }
}

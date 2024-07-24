//Map:
//  Map is similar to dictionary in python where it can store in
//    key value pair.
//    Map is also a colection datatype in scala
//    Maps are also of two types in scala
//    i.e mutable and immutable Maps.
//    In Map duplicate values is allowed whereas duplicate keys is not allowed
//    if we forcefully insert duplicate key it will assign the latest and updated key.
//

object Hel{
  val mymap:Map[String,Int]=Map("801"->801,"802"->802,"803"->803,"804"->804,"804"->805)
  val mymap1:Map[String,Int]=Map("805"->805,"806"->806)
  def main(args:Array[String]): Unit = {
    println(mymap)
    println(mymap.keys)
    println(mymap.values)
    mymap.keys.foreach{
      key=>
        println("key "+key)
        println("value "+mymap(key))
    }

    println(mymap.contains("8011"))
    println(mymap.concat(mymap1))
    println(mymap++mymap1)
    println(mymap.head)
    println(mymap.tail)
    println(mymap.isEmpty)
    println(mymap.size)
    println(mymap.max)
    println(mymap.min)
    println(mymap.last)
  }
}
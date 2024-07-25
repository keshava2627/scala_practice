////map:
////  map is function in scala which can iterate over a list and apply any transformation if defined on each element
////    in list and forms a another list.
////
//
//flatMap:
//  flatMap is method in scala which will flatten the results.
//flatten:
//  flatten is also a method in scala which will flatten reslts and returns a single list of results.
//filter:
//  filter is a method in scala which will return results that satisfies the condition.

object Mapclass{
  val lst=List(1,2,3,4,5,6,7,8,9,10)
  val mymap=Map(1->"keshva",2->"sai",3->"vijay")
  def main(args:Array[String]): Unit = {

    println(lst)
    println(lst.map(_+2))
    println(lst.map(_*2))
    println(lst.map(_/2))
    println(lst.map(_%2))
    println(lst.map(x=>x+"hi"))
    println(lst.map(x=>"hi"*x))
    println(mymap.map(x=>"hi"+x))
    println(mymap.mapValues(x=>"hi"+x))
    println(List(List(1,2,3),List(4,5,6)).flatten)
    println(lst.flatMap(x=>List(x,x+1)))
    println(lst.filter(x=>x%2==0))
    println(lst.filter(x=>x%2!=0))

  }
}
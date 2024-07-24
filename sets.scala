//sets:
//  sets in scala are similar to sets in python
//  but here we have two types of sets
//    1.mutable sets.
//    2.Immutable sets.
//mutable sets can manipulated in which manipulate and update set within the same object.
//immutable sets cant be manipulated.
//  to make sets muttable we should make sure that we use scala.collection.mutable.Set
//all methods of sets can be applied same as python.
//here in sets insertion will not be maintained.
//and sets doesnt allow duplicate values.

object Hi{
  val myset:Set[Int]=Set(1,2,3,4,2,5,6,3)
  var myset1=Set(1,2,3,4,2,4,3,4)
  var myset2=scala.collection.mutable.Set(1,2,3,4,5)
  def main(args:Array[String]): Unit = {
    println(myset2+10)
    println(myset++myset1)
    println(myset.++(myset2))
    println(myset.head)
    println(myset.head)
    println(myset.tail)
    println(myset.&(myset1))
    println(myset.intersect(myset2))
    println(myset.union(myset1))
    println(myset.isEmpty)
    println(myset.max)
    println(myset.min)
    println(myset.subsetOf(myset2))
    for(i<-myset){
      println(i)
    }

    myset.foreach(println)
  }
}
//Lists:
//  Lists is a collection datatype which is similar to Arrays in scala
//    but there are only two fundamental differences between Lists And Arrays in scala
//  Lists are immutable in scala i.e once declared we can update the Lists Or Manupulate the list.
//if we do so it will always create a new object in memory.
//  Lists in scala can only store similar data type values.
//Nil is a list in scala which will return an Empty List.
//for appending value we can use concise :: this operator is used to append value into a existing list
//but the original list cant be updated.



object Hello{
  val lst:List[Int]=List(1,2,3,4,5)
  val lst1:List[String]=List("mani","raju","somesh")
  def main(args:Array[String]): Unit = {
//    println(2::lst) here it will return 2,1,2,3,4,5 as output as 2 is pre appended with the List
//    println(lst)
//    println(lst1)
//    println(Nil)it will return an empty List
//      println(2::3::4::Nil)it will return List(2,3,4)

//iterating over list using is possible in two ways in scala
//    1.using foreach loop
//    2.using for loop.
////lst.foreach(println)it will retrun elements of a list one by one as it is println
//for(name<-lst1){
//  println(name)
//}
//
//println(lst.length)it will return length of the list the return type will be Int.

//println(lst.reverse)this method reverse the list elements in list and return the list.
//println(lst.head)this method will return the first element of the list.
//println(lst.tail)this method will return the elements of the list by ommiting element at first position.

//println(lst.isEmpty)this method will check wether the given list is empty or not and will return boolean value.

//println(lst.max)this method will return the max element from the list.
//
////println(lst.min)this method will return min element from the list.
//like wise there are many in built methods are also associated with the list in scala.
  }
}


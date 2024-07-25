//Tuple:
//  A tuple is also a collecrion datatype basically we can call it as collection data Structure.
//in scala unlike other collection datatype like Array,Map,Lists store values of same datatype.
//whereas Tuple can store any datatype values. and tuples are immutable.
//once declred its size is fixed.

object Tuple{
  val mytuple=(1,2,3,4,"keshava",true)//this is one way of declaring a tuple in scala.
  val mytuple1=Tuple1(2)//it is also a valid declaration of tuple in scala.
  val mytuple2=Tuple5("keshava",2,3,4,(3,4))//when we are going to declare tuples like this we have to take care that
  //we have to specify by Tuple followed by no of elements in tuple.and when we are declaring tple like this
  //we can store upto 22 elements i.e Tuple22.
  val mytuple4=EmptyTuple//it will return an empty tuple.
  def main(args:Array[String]): Unit = {

    println(mytuple)//it will return tuple
    println(mytuple._1)//it will return element at first position in tuple.
    println(mytuple._5)//it will return element at 5th position in tuple.
    println(mytuple1._1)//it will return element at 1 position.
    println(mytuple2._5._2)//here it will acess element at 5 position in main tuple and then return element at 2 position in sub tuple.
    println(mytuple4)//return empty Tuple.
    //iterating over tuple
    //we cannot iterate over tuple if we want to iterate over tuple we make sure that productIterator is called on tuple.
    mytuple2.productIterator.foreach{
      i=>println(i)
    }

  }
}
package dataStructures

data class Fruit(val name:String, var weight:Double)

fun main() {
  // val numbers: IntArray = intArrayOf(1,2,3,4,5,6)
  // val numbers = intArrayOf(1,2,3,4,5,6)

  val numbers = arrayOf(1,2,3,4,5,6)
  println(numbers)
  println(numbers.contentToString())

  var numberD = doubleArrayOf(2.4,4.6,5.6,7.9)
  println(numberD.contentToString())

  var fruits = arrayOf(Fruit("mango",6.7),Fruit("Banana",4.5),Fruit("guava",3.3))
  for (id in fruits){
    println("${id.name} ")
  }

  val mixData = arrayOf("Monday",1,4,1.5,Fruit("apple",4.5))
  for(element in mixData){
    print("$element ")
  }
}
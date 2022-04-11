package dataStructures

data class fruit(val name: String, val price: Double)

fun main() {

  // Sets -> Unordered list with no duplicates
  val fruits = setOf<String>("Apple","Mango","Orange","Grapes","Apple")
  println(fruits.size)
  println(fruits.toSortedSet())

  val newFruits = fruits.toMutableList()
  newFruits.add("Pears")
  newFruits.add("Water Melon")
  println(newFruits)
  println(newFruits.elementAt(4))

  // Maps -> Key value pair
  val daysOfTheWeek = mapOf(1 to "Mon", 2 to "Tue", 3 to "Wed", 4 to "Thu", 5 to "Fri")
  println(daysOfTheWeek[2])
  for (key in daysOfTheWeek.keys){
    println("$key for ${daysOfTheWeek[key]}")
  }

  val newDays = daysOfTheWeek.toMutableMap()
  newDays[6]="Sat"
  newDays[7]="Sun"

  println(newDays.toSortedMap())

  var mapOfFruits = mapOf("Mon" to fruit("mango", 45.1), "Tue" to fruit("Apple",54.4))
  println(mapOfFruits)
}
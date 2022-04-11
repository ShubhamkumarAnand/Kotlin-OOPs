package dataStructures

fun main() {
  // Empty Dynamic Array
  val numbers = ArrayList<String>()
  numbers.add("One")
  numbers.add("Two")
  for(id in numbers){
    println("$id ")
  }

  //Collection
  var arrayList:ArrayList<String> = ArrayList(5)
  var list:MutableList<String> = mutableListOf<String>()

  list.add("Ole")
  list.add("cr7")
  list.add("LM10")

  arrayList.addAll(list);

  println(arrayList)

  val itr = arrayList.iterator()
  while (itr.hasNext()){
    println(itr.next())
  }
  println("Size of array List : ${arrayList.size}")

  println(arrayList.get(2))
}
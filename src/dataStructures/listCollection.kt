package dataStructures

fun main() {
  // By default, list is immutable
  var months = listOf("jan","feb","mar")
  var mixList = listOf<Any>(1,2.5,'G',"People",true)

  println(mixList.size)
  println(mixList[3])
  for(month in months){
    println(month)
  }

  var addMonth = months.toMutableList()
  val extraMonth = arrayOf("apr","may","jun")
  addMonth.addAll(extraMonth)
  addMonth.add("jul")
  println(addMonth)

  val days = mutableListOf<String>("Mon","Tue","Wed","Thr","Fri")
  days[3] = "sun"
//  days.removeAt(2)
  var removeList = mutableListOf<String>("sun", "Fri")
  days.removeAll(removeList)
  println(days)

}
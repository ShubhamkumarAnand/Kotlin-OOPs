package dataStructures

fun main() {
  // Lambda -> A Function which has no name
  val sum:(Int,Int) -> Int = { a: Int, b: Int ->
    a + b
  }
  println(sum(10,12))

  val diff = {a:Int, b:Int -> println(a-b)}
  diff(10,3)
}
// Concept of the Data Class

data class User(val id: Int, var name: String)

fun main(){
  val user1 = User(1, "imskanand")
  user1.name = "aatma"

  val user2 = User(2, "doja")
  println(user1 == user2)

  println("User Details $user1")
  val updatedUser = user1.copy(name = "Maichael")
  println(user1)
  println(updatedUser)

  println(user1.component1())
  println(user1.component2())

  val (id,name)= updatedUser
  println("ID : $id and Name : $name")
}
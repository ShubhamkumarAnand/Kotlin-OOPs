// Primary Constructor -> (Value passed in the class)
class Person constructor(firstName: String = "Aatma", lastName: String = "Pandey"){

//  Member Variables -> Properties
  var myAge : Int ? = null
  var hobby: String = "Read books"
  var firstName:String? = null

// Initializer Block
  init {
  this.firstName = firstName
    println("Created Person Object for $firstName $lastName")
  }

//  Secondary constructor
  constructor(firstName: String,lastName: String,myAge:Int):this(firstName,lastName){
    this.myAge = myAge
    println("Created Person Object for Person $firstName $lastName and Age of $myAge")
  }

//  Member Functions -> Methods
  fun stateHobby(){
    println("$firstName\'s Hobby is to $hobby")
  }
}

fun main(){
  var imskanand = Person("Shubham","Anand",21)
  imskanand.stateHobby()

  var aatma = Person()
  aatma.hobby = "Watch Video"
  aatma.stateHobby()

  var aatmaSharma = Person(lastName = "Sharma")
  aatmaSharma.hobby="play video games"
  aatmaSharma.stateHobby()
}


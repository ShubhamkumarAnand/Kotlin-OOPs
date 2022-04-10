/*
  Concept of Getter and Setters
*/

class Car {

  lateinit var owner:String // Later Initialization of the variable

  var myBrand: String = "BMW"
    // Custom Getter
    get(){
      return field.toLowerCase()
    }

  var maxSpeed: Int = 250
    get() = field
    set(value){
      field = if(value>0) value else throw java.lang.IllegalArgumentException("Max Speed cannot be 0")
    }

  var myModel:String = "M5"
  private set

  init{
    this.owner = "Francis"
  }
  /*
    get() = brand
    set(value){
    brand = value
    }
  */
}

fun main(){
  var car = Car()

  println("Brand of my Car is ${car.myBrand}")
  car.maxSpeed = 110

  println("Max Speed of the car is ${car.maxSpeed}")
  //  car.myModel = "M3" -> Cannot Assign value [We can change the value in the class Initializer
  println("Model of the car is ${car.myModel}")
}
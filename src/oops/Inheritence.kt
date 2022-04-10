/*
 Base Class --> Super Class
 Child Class -> Parent Class
 For using the class for extending into another class you have to make it open
 By default they are not for the Inheritance
 Open Class -> Open to be the Super Class
 Sealed Class -> Not to be the parent or super or base class
 Any Class Inherits from any class
 Interface Implementation
*/
package oops

interface Drivable{
  val maxSpeed: Double
  fun drive(): String
  fun brake(){
    println("The drivable is Breaking")
  }
}

//super class of ElectricCar
open class Cars(override val maxSpeed: Double,val name: String, val brand_name:String): Drivable{
  open var range : Double =0.0
  fun extendRange(amount : Double){
    if(amount>0){
      range+= amount
    }
    println("Current Range of the Car is $range")
  }
//override fun drive: String = "Driving is Fun"
  override fun drive(): String {
    return "Interface Return"
  }
  open fun drive(distance:Double){
    println("Distance to be covered $distance KM")
  }
}

//child class of Car
class ElectricCar(maxSpeed: Double,name: String,brand: String,batteryLife:Double) : Cars(maxSpeed,name,brand){
  override var range:Double = batteryLife*6

  override fun drive(distance: Double) {
    println("Covered $distance KM by Electric Vehicle")
  }

  override fun drive(): String {
    return "Driving the electric Cars"
  }

  override fun brake() {
    super.brake()
    println("Electric Car is Breaking")
  }
}

fun main(){
  var audiA3 = Cars(220.0,"A3", "Audi")
  var teslaS = ElectricCar(250.76,"S-Model","Tesla",54.43)

  //Polymorphism
  audiA3.extendRange(100.0)
  teslaS.extendRange(300.9)

  //Polymorphism
  teslaS.drive(500.0)
  audiA3.drive(100.4)

  //polymorphism
  println(teslaS.drive())
  println(audiA3.drive())

  //polymorphism
  teslaS.brake()
  audiA3.brake()
}


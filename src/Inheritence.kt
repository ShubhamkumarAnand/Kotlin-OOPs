/*
 Base Class --> Super Class
 Child Class -> Parent Class
 For using the class for extending into another class you have to make it open
 By default they are not for the Inheritance
 Open Class -> Open to be the Super Class
 Sealed Class -> Not to be the parent or super or base class
 Any Class Inherits from any class
*/

fun main(){
  var audiA3 = Cars("A3", "Audi")
  var teslaS = ElectricCar("S-Model","Tesla",54.43)

  //Polymorphism
  audiA3.extendRange(100.0)
  teslaS.extendRange(300.9)

  //Polymorphism
  teslaS.drive(500.0)
  audiA3.drive(100.4)
}

//super class of ElectricCar
open class Cars(val name: String,val brand:String){
  open var range : Double =0.0
  fun extendRange(amount : Double){
    if(amount>0){
      range+= amount
    }
    println("Current Range of the Car is $range")
  }
  open fun drive(distance:Double){
    println("Distance to be covered $distance KM")
  }
}

//child class of Car
class ElectricCar(name: String,brand: String,batteryLife:Double) : Cars(name,brand){
  override var range:Double = batteryLife*6
  override fun drive(distance: Double) {
    println("Covered $distance KM by Electric Vehicle")
  }
}


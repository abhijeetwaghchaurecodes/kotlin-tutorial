//INHERITANCE - to have the properties of a CLASS to another CLASS of CHOICE

fun main(args: Array<String>){
    val car = Car("BMW", "RED", 1, 4)
    val plane = Plane("Boeing", "WHITE", 4, 2)

    car.move()
    car.stop()

    plane.move()
    plane.stop()

}

open class Vehicle(val name: String, val color: String){
    fun move(){
        println("$name is moving")
    }

    fun stop(){
        println("$name has stopped")
    }
}

class Car(name: String, color: String, val engines: Int, val doors: Int): Vehicle(name, color) {

}

class Plane(name: String, color: String, val engines: Int, val doors: Int): Vehicle(name, color){

}
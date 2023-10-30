/*class Car(var name: String,var model: String,var color: String,var doors: Int){
    /*var name = name
    var model = model
    var color = color
    var doors = doors*/

    fun move(){
        println("the car $name : $model is moving")
    }

    fun stop(){
        println("the car $name : $model has stopped moving")
    }



}*/

//LATEINIT - keyword used for later initialsing the value/property
/*class User(firstName: String, var lastName: String, var age: Int){
    lateinit var favouriteMovie: String
}*/

//COMPANION OBJECT
/*class Calculator(){
    companion object{
        val max: Int
        fun sum(a: Int, b: Int): Int{
            return a+b
        }
    }

}*/

object Database {
    init {
        println("Database created!")
    }
}

class User(var firstName: String, var lastName: String, var age: Int){
    init {
        println("User: $firstName was created!")
    }
}
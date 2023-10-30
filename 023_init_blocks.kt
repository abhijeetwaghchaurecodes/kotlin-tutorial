/*fun main(args: Array<String>){
    val car1 = Car("TATA", "Safari", "White", 5)   //instance
    /*car1.name = "TATA"
    car1.model = "Safari"
    car1.color = "White"
    car1.doors = 5*/

    println("Name = ${car1.name}")
    println("Model = ${car1.model}")
    println("Color = ${car1.color}")
    println("Doors = ${car1.doors}")

    car1.move()
    car1.stop()

    println("\n\n\n")
    /* val car2 = Car()
     car2.name = "FORD"
     car2.model = "  Mustang Boss 302"
     car2.color = "Pearl White"
     car2.doors = 4

     println("Name = ${car2.name}")
     println("Model = ${car2.model}")
     println("Color = ${car2.color}")
     println("Doors = ${car2.doors}")

     car2.move()
     car2.stop()*/

}

class User(var name: String, var lastName: String, var age:Int){
    val user = User("Abhijeet", "Dobinca", 23)
}*/

//OOPS - style of writingg programs in order to match with the real world
//OBJECTS - have a major significance in real life, define generic things
//CLASS - is a template to create OBJECTS
//provides MODULAR programming

//SECONDARY CONSTRUCTORS - other than the PRIMARY constructors, these are used

//INITIALIZER BLOCKS - used when we create new CLASSES

//SECONDARY CONSTRUCTORS - CODE snippet example
/*fun main(args: Array<String>){
    //val user = User("Abhijeet", "Waghchaure", 23)
    val user = User("Abhijeet")
    val friend = User("John", "Smith")

    println("Name ${user.name}")
    println("Name ${user.lastName}")
    println("Name ${user.age}")

    println("\n")

    println("Name ${friend.name}")
    println("Name ${friend.lastName}")
    println("Name ${friend.age}")
}

class User(var name: String, var lastName: String, var age: Int){

    /*var name: String

    init{
        if(name.lowercase().startsWith("a")){
            this.name = name
        }else{
            this.name = "User"
            println("the name doesn't start with the letter 'a' or 'A' ")
        }
    }*/
    constructor(name: String): this(name, "LastName", 0){
        println("2nd")
    }
    constructor(name: String, lastName: String): this(name, lastName, 0){
        println("3rd")
    }



}*/
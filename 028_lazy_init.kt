fun main(args: Array<String>){
    val user1 = User("Alex", "Dobbin", 22)
    val user2 by lazy {
        User("User1", "lastName", 0)
    }

    //unless you're not using the object, its instance will not be created if it is init by "lazy initialiser"
    //println(user2.firstName)
}

/*class User(var firstName: String, var lastName: String, var age: Int){
    init {
        println("User: $firstName was created!")
    }
}*/
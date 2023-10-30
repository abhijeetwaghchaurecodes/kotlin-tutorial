/*fun main(args: Array<String>){
    //val user = User("Abhijeet", "Waghchaure", 23)
    val user = User("Abhijeet")
    val friend = User("John", "Smith")
    //val user2 = User(age = 19, firstName = "Ioana", lastName = "Doobbi")

    println(user.firstName)
    println(user.lastName)
    println(user.age)

    println("\n")

    println(friend.firstName)
    println(friend.lastName)
    println(friend.age)

    /*println("\n")

    println("Name ${user2.firstName}")
    println("LastName ${user2.lastName}")
    println("Age ${user2.age}")*/


}

class User(var firstName: String, var lastName: String = "LastName", var age: Int = 0){
    var firstName = firstName
        get() {
            return "FirstName: $field"
        }

        set(value) {
            println("$value was assigned to firstName property")
            field = value
        }

        fun setFirstName(newValue: String){
            this.firstName = newValue
        }

        fun getFirstName() : String{
            return this.firstName
        }
}
*/
//ENCAPSULATION - to protect the inner versions of the code
//GETTER and SETTER are automatically generated
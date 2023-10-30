fun main(args: Array<String>){
    sayHello(name = "Alex", age = 22)

    val hasInternetConnection = false
    if(hasInternetConnection){
        getData(data = "Some data")
    }else{
        showMessage()
    }

}
//chunks of code which are functionable and reusable are called functions
fun sayHello(name: String, age: Int){
    println("Hello, $name! Your age is $age")
}

fun getData(data: String){
    println("Your data is: $data")
}

fun showMessage(){
    println("There's no Internet Connection")
}
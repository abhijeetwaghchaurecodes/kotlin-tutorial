/*class Operators {
}*/

fun main(args: Array<String>){
    var x = 5
    val y = 3

    //here we're doing operations
    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")

    var result = x + y
    result = result + 2

    println("result = $result")

    var a = 10
    println("a++ = ${a++}")
    println("++a = ${++a}")

}
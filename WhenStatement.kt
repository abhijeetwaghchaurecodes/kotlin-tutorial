/*class WhenStatement {
}*/

fun main(args: Array<String>){
    val alarm = 12

    val text = when(alarm){
        //in 1 <= .. <= 10 -> println("the number is in range 1..10")
        12, 7, 14 -> println("this time is $alarm")

        else -> println("this time is $alarm")
    }
}
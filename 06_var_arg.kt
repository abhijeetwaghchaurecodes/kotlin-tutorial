fun main(args: Array<String>){
    println(sum(5, 6, 7, 8, 9, 8, 10))
}

/*fun sum(a: Int, b: Int, c: Int,d: Int): Int{
    return a + b + c + d
}*/


//VARARG - special type of parameter used here
fun sum(vararg numbers: Int): Int{
    var result = 0
    for(number in numbers){
        result = result + number
    }
    return result
}
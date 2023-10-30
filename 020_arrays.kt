fun main(args: Array<String>){
    /*val names: Array<String> = arrayOf("Anish", "Shitix", "Rushi")
    val numbers: Array<Int> = arrayOf(4,5,6,7)
    names[0] = "Abhijeet"
    println("First element is ${names[0]}")
    println("The size of the array is: ${names.size}")

    for(i in numbers){
        println()
    }*/

    val max: Int = findMax(arrayOf(4,5,6,7,8))

    val min: Int = findMin(arrayOf(4,5,6,7,8))

    println("Max value is $max and Min value is $min")
}

fun findMax(numbers: Array<Int>): Int{
    var max: Int = numbers[0]

    for(number: Int in numbers){
        if(number > max){
            max = number
        }
    }
    return max
}

fun findMin(numbers: Array<Int>): Int{
    var min: Int = numbers[0]

    for(number: Int in numbers){
        if(number < min){
            min = number
        }
    }
    return min
}
/*class NullValue {
}*/

fun main(args: Array<String>){
    /*val text: String? = "Name"
    if(text != null){
        println(text.length)
    }else{
        println("the variable is null..")

    }*/

    var text: String? = "Name"
    text = null
    println(text?.length)


}
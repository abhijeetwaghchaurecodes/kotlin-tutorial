fun main(args: Array<String>){
    //sendMessage("Alexa", "Hello")
    sendMessage(message = "Hello!", name = "Alexa")
}

fun sendMessage(name: String, message: String = sendText()){  //empty text as a default parameter value
    println("Name = $name and message = $message")
}

fun sendText(): String {
    return "Some text!"
}
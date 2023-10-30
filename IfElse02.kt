/*class IfElse02 {
}*/


fun main(){
    val myNumber = 150
    if(myNumber != 150){
        println("less than 150")
    }else if (myNumber <= 150){
        println("less than equal to 150")
    }else{
        println("all the conditions are failed")
    }

    val isActive = false
    if(isActive == true){
        println("the user is active")
    }else{
        println("the user is not active")
    }
    if(!isActive){
        println("the user is active")
    }else{
        println("the user is not active")
    }
}
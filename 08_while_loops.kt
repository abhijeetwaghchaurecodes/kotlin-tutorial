fun main(args: Array<String>){

    //LOOPS as long as condition is TRUE
    /*var number = 0
    while(number <= 10){
        println(number)
        number++
    }*/

    //DO-WHILE loop
    /*do{
        println(number)
    }while (number < 10)*/
    /*var number = 0
    while(number < 10){
        if(number == 7){
            continue

        }
        println(number)
        number++
    }*/

    //CONTINUE - will skip the iteration
    //BREAK - will break the whole loop
    //PASS -

    /*for(i in 0..10){
        if(i in 3..8){
            //continue
            break
        }
        println(i)
    }*/

    var i = 0
    while(i < 5){   //see LABELS in Kotlin (@outer, etc)
        i++
        println("***$i")
    }
}

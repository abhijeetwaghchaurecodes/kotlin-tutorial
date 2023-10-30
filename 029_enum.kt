fun main(args: Array<String>){
    /*println(Direction.WEST)
    println(Direction.EAST)
    println(Direction.NORTH)
    println(Direction.SOUTH)*/

    //HOW CAN WE ITERATE THROUGH THE ENUM VALUES?
   /* for(direction in Direction.values()){
        println(direction)
    }*/

    /*println(Direction.NORTH.direction)
    println(Direction.NORTH.distance)
    println(Direction.NORTH.name)

    Direction.WEST.printData()*/

    val direction = Direction.EAST

    when(direction){
        Direction.EAST ->{
            println("this is direction EAST")
        }
        Direction.WEST -> println("this is direction WEST")
        Direction.NORTH-> println("this is direction NORTH")
        Direction.SOUTH-> println("this is direction SOUTH")
    }
}


//instances of the enum DIRECION class
enum class Direction(var direction: String, var distance: Int){
    NORTH("north", 10),
    SOUTH("south", 20),
    EAST("east", 15),
    WEST("west", 40);

    fun printData(){
        println("Direction = $direction and distance = $distance")
    }
}
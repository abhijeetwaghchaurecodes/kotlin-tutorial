import javax.xml.crypto.Data

//for creating only one instance of the particular class
//SINGLETON CLASSES
fun main(args: Array<String>){

    /*val instance = Database.getInstance()
    val instance2 = Database.getInstance()
    println(instance)
    println(instance2)*/

    println(Database)
    println(Database)
}


/*class Database private constructor(){

    companion object{
        private var instance: Database? = null

        fun getInstance(){
            if(instance == null){
                instance = Database()
            }

            return instance
        }
    }

}*/


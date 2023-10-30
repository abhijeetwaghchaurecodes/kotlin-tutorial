fun main(args: Array<String>){
    val listView = ListView(arrayOf("name1", "name2", "name3"))

    listView.ListViewItem().displayItem(2)
}

class ListView(val items: Array<String>){

    inner class ListViewItem(){

        fun displayItem(position: Int){
            println(items[position])
        }
    }
}

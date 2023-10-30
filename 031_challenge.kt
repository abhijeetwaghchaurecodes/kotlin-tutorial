package con.example.main

fun main(){
    val alexAccount = Account("Alex")
    alexAccount.deposit(1000)
    alexAccount.withdraw(500)

}

class Account(val accountName: String){
    var balance = 0
    var transactions = mutableListOf<Int>()

    fun deposit(amount: Int){
        if(amount > 0){
            transactions.add(amount)
            balance = balance + amount
            println("$amount deposited. Balance is now ${this.balance}")

        }
        else{
            println("cannot deposit negative aount")
        }
    }

    fun withdraw(withdrawal: Int){
        if(-withdrawal < 0){
            transactions.add(-withdrawal)
            this.balance = this.balance - withdrawal
            println("$withdrawal withdrawed. Balance is now ${this.balance}")
        }
        else{
            println("cannot withdraw negative sum")
        }
    }

    fun calculateBalance(): Int {
        this.balance = 0
        for(transaction in transactions){
            this.balance = this.balance + transaction
        }
        return this.balance
    }
}
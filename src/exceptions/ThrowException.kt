package exceptions

import polimorphism.InsufficientFundsException

fun main() {
    val account = BankAccount()

    try {
        account.deposit(500.0)
        account.withdraw(300.0)

    } catch (e: IvalidValueException) {
        println("Ops, invalid avalue: ${e.message}")
    }catch (e: InsufficientFundsException){
        println("Erro! Curret balamce is ${e.currentBalance}")
    }
    println(account.balance)

}

class BankAccount {
    var balance: Double = 0.0
        private set

    fun deposit(value: Double) {
        if (value < 0) {
            throw IvalidValueException(value)
        }
        balance += value
    }

    fun withdraw(value: Double) {
        if (value < 0) {
            throw IvalidValueException(value)
        }

        if (balance - value < 0 ){
            throw InsufficientFundsException(balance)
        }
        balance -= value
    }
}
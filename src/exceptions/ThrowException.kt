package exceptions

fun main() {
    val account = BankAccount()

    try {
        account.deposit(-500.0)
    } catch (e: IvalidValueException) {
        println("Ops, invalid deposit: ${e.message}")
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
        balance -= value
    }
}
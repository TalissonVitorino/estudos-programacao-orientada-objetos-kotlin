class Account(
    val accountNumber: String = "",
    val accountOwner: String = ""
) {
     var balence: Double = 0.0

    constructor() : this(accountOwner = "", accountNumber = "") {
        println("constructor()")
    }

    constructor(accountNumber: String, accountOwner: String, balance: Double) : this(accountNumber, accountOwner) {
        this.balence = balance
    }

    fun deposit(amount: Double) {
        balence += amount
    }

    fun deposit(amount: Int) {
        balence += amount
    }

    fun print() {
        println("Number: $accountNumber; Owner: $accountOwner; Balance: $balence")
    }
}


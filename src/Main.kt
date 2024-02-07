import polimorphism.Account

fun main() {
    val a1 = Account("1254-5", "marcio")
    val a2 = Account("1565-2", "pedro")
    val a3 = Account()
    val a4 = Account("2545-2", "Sabrina", 1200.0)

    a1.deposit(2000.0)
    a2.deposit(3000.0)
    a4.deposit(2000)

    a1.print()
    a2.print()
    a3.print()
    a4.print()


}
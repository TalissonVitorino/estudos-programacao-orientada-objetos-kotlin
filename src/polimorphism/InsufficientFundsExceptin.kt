package polimorphism

class InsufficientFundsException(val currentBalance: Double) : RuntimeException() {
}
package lambda

fun main() {
    val g1: (Int) -> Boolean = { n: Int -> n % 2 == 0 }
    val g2: (Int) -> Boolean = { n -> n % 2 == 0 }
    val g3 = { n: Int -> n % 2 == 0 }
}
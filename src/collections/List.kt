package collections

fun main() {
    val l1 = listOf(1, 2, 3, 4, 5)
    val l2: List<Int> = emptyList()
    val l3 = mutableListOf(1, 2, 3, 6)
    val l4 = listOfNotNull(1, 2, 3, 4, null, 6)

    l3.add(20)

    l1.forEach { (print(it)) }
    println()
    l2.forEach { (print(it)) }
    println()
    l3.forEach { (print(it)) }
    println()
    l4.forEach { (print(it)) }
}
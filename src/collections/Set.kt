package collections

fun main() {
    val s1 = setOf(1, 2, 3, 4, 5, 6)
    val s2 = mutableSetOf("A", "B", "D", "E")
    val s3 = hashSetOf("1A", "2B", "3C", "40H")

    s1.forEach { print(it) }
    println()
    s2.forEach { print(it) }
    println()
    s3.forEach { print(it) }
}
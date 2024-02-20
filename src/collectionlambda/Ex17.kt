package collectionlambda

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 5, 8, 2, 1, 21, 200, 0)
        .associateWith { it + 1 }
        .toSortedMap()
    println(numbers)

}
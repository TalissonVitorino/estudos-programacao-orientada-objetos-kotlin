package collectionlambda

fun main() {
    listOf(1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13)
        .associateWith { it + 1 }
        .toSortedMap()
        .forEach { (k, v) -> println("$k -> $v") }

}
package collectionlambda

fun main() {
    Person
        .data()
        .map { it.name }
        .shuffled()
        .take(3)
        .forEach { println(it) }
}
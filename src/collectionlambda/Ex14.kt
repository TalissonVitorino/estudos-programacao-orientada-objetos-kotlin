package collectionlambda

fun main() {
    Person
        .data()
        .groupBy { it.name[0] }
        .forEach { (k, v) -> println("$k -> $v") }
}
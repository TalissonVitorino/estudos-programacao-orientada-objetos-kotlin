package collectionlambda

fun main() {
    val cout = Person
        .data()
        .map { it.age }
        .reduce { acc, age -> acc + age }
    println(cout)
}
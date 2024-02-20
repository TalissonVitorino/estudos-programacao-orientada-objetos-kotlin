package collectionlambda

fun main() {
    val cout = Person
        .data()
        .filter { it.name.uppercase().startsWith("R") }
        .sumOf { it.age }

    println(cout)

}
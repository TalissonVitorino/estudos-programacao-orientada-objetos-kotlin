package collectionlambda

fun main() {

    Person
        .data()
        .filter { it.age >= 18 }
        .forEachIndexed { i, p -> println("${i + 1}. $p") }


}
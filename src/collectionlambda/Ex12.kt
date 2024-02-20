package collectionlambda

fun main() {
    val existsAge = Person
        .data()
        //.any {it.age == 300}
        .none { it.age == 300 }
    //.all { it.age == 300 }
    println(existsAge)

}
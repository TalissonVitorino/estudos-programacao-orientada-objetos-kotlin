package collectionlambda

fun main() {
// val age  =  Person
//       .data()
//       .find {it.name == ",jh"  }
//       ?.age
//       ?:0
//    println(age)


    val age = Person
        .data()
        .firstOrNull() { it.name == "Romeu" }
        ?.age
        ?: 0
    println(age)
}
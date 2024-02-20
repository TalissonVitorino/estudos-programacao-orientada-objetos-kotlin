package collectionlambda

fun main() {
    val produtos = mapOf(
        "Alface" to 2.5,
        "Aroz" to 6.9,
        "Banana" to 4.8,
        "sal" to 2.4

    )

    println(
        produtos
            .map { it.value }
            .max()
    )

    println(produtos
        .minBy { it.value }
        .key
    )

    produtos.filter { it.value < 5.0 }
        .keys
        .forEach { println(it) }

}
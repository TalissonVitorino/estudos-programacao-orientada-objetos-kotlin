package map

fun main() {
    val cidades = listOf("Recife", "Olinda","Olinda", "Rio claro", "Águas de São Pedro", "São Paulo")
    println(cidades)

    val uniqueCites = cidades.toSet()
    println(uniqueCites)
    println(cidades.size)
    println(uniqueCites.size)
}
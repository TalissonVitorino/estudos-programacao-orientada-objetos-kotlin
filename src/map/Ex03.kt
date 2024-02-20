package map

fun main() {

    val map = mapOf(1 to "A", 2 to "B", 3 to "C", 4 to "D" )
    map.forEach {
        println("${it.key} ==> ${it.value}")
    }

    println()

    map.forEach { (k, v) ->
        println("$k ==> $v")
    }
    println()

    map.keys.forEach {println(it)}
    println()
    map.values.forEach {println(it)}
}
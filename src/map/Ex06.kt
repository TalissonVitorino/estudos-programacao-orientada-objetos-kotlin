package map

fun main() {
    val codesMap = mapOf(

        55 to "Brasil",
        351 to "Portugal",
        54 to "Argentina",
        1 to "United States"
    )
    println(codesMap)

    val countries = codesMap.values.toSortedSet(
        Comparator.reverseOrder()).toMutableList()
    println(countries)


}
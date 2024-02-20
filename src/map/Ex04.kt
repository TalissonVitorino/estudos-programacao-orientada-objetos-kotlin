package map
/*

mapOf, matem a inserida.

hasMapOf, não mantém ordem específica "A mesma ordem".

sortedMapOf A ordenação é realizada pela chave que vai
ordenar em ordem crescente 1, 2, 3

Para fazer o inverso do sortedMapOf é so usar o
comparator.reverseOrder() assim será exibido: Ex: 3, 2, 1

 */

fun main() {
    val codesMap = mapOf(

        55 to "Brasil",
        351 to "Portugal",
        54 to "Argentina",
        1 to "United States"
    )
    println(codesMap)
}


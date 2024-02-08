package collections

fun main() {

    println(sum(2, 5, 6, 7, 8))

    val a = intArrayOf(2, 5, 6, 8, 9, 10)
    println(sum(*a))

}

//fun sum(n1: Int, n2: Int) : Int{
//   return  n1 + n2
//}

fun sum(vararg values: Int): Int {
    var sum = 0
    values.forEach { sum += it }
    return sum
}
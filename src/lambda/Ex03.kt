package lambda

fun main() {
    val r1 = transformAndConvert("$", "|", 100, { v -> v * v })
    println(r1)

    val r2 = transformAndConvert("$", "|", 300) { it * it }
    println(r2)

    val r3 = transformAndConvert("$", "|", 60) { v -> -v }
    println(r3)

    val r4 = transformAndConvert("$", "|", 4) { -it }
    println(r4)
}

fun transformAndConvert(prefix: String, suffix: String, value: Int, t: (Int) -> Int): String {
    val transform = t(value)
    return "$prefix$transform$suffix"
}

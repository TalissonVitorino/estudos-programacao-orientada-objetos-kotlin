package ooadvanced

fun main() {

    val p1 = Point(10, 5)
    val p2 = Point(5, 3)
//    val p3 = p1 + p2
//    val p4 = p2 - p3
//    val p5 = p1 * 2

    val p3 = p1.plus(p2)
    val p4 = p2.minus(p3)
    val p5 = p1.times(2)


    println(p1)
    println(p2)
    println(p3)
    println(p4)
    println(p5)
}


data class Point(val x: Int, val y: Int) {

    operator fun plus(other: Point): Point {
        return Point(
            x + other.x, y + other.y
        )
    }

    operator fun minus(other: Point): Point {
        return Point(
            x - other.x, y - other.y
        )
    }

    operator fun times(multiplier: Int): Point {
        return Point(x = x * multiplier, y = y * multiplier)
    }
}

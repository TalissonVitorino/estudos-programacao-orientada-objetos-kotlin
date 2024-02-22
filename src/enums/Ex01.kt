package enums

import enums.Month.MAY

fun main() {
    val month = MAY
    println(month.numberOfMonth)
    println(month.name)
    println(month.ordinal)

    val nextMonth = month
        .next()
        .next()
        .next()
        .next()
        .next()
        .next()
        .next()
        .next()
    println(nextMonth)

    val month11 = Month.getEnumBayNumberOMonth(5)
    println(month11)

    val monthAugust = Month.valueOf("AUGUST")
    println(monthAugust)
    println(monthAugust.getTotalDays())
}

enum class Month(val numberOfMonth: Int) {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    fun next(): Month {
        return Month
            .values()
            .find { it.numberOfMonth == numberOfMonth + 1 }
            ?: JANUARY
    }

    fun getTotalDays(): Int{
        return when (this){
            JANUARY, MARCH,APRIL,
            MAY,JUNE, JULY, AUGUST, SEPTEMBER,
            OCTOBER, NOVEMBER,DECEMBER -> 31
            FEBRUARY -> 28

        }

    }

    companion object {
        fun getEnumBayNumberOMonth(numberOfMonth: Int): Month {
            return Month
                .values()
                .first { it.numberOfMonth == numberOfMonth }
        }
    }
}
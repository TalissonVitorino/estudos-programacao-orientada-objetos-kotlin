package collections

import java.util.Comparator
import java.util.Objects

fun main() {
    val dogs = sortedSetOf(
        Comparator.comparing { dog: Dog -> dog.name },
        Dog("D3"),
        Dog("D2"),
        Dog("D5"),
        Dog("D4"),
        Dog("D1"),
    )
    println(dogs)

}

class Dog(val name: String) {
    override fun toString() = "Dog(name=$name, hashCode=${hashCode()})"

    override fun hashCode(): Int {
        return Objects.hash(name)
    }

    override fun equals(other: Any?): Boolean {
        return if (other is Dog) {
            this.name == other.name
        } else {
            false
        }
    }
}
package collections

fun main() {
    val dogs = setOf(
        Dog("D1"),
        Dog("D2"),
        Dog("D3"),
        Dog("D4"),
        Dog("D4"),
    )
    println(dogs)

}

// Ao usar "data" ela ja faz automaticamente a implementação do toStringn, equals, hashCode
data class Dog2(private val name: String) {
    override fun toString() = "Dog(name=$name, hashCode=${hashCode()})"
}
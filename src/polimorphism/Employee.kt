package polimorphism

fun main() {
    val p = Programador()
    p.work()

    val t = Teacher()
    t.work()

    val a = Programador()
    a.work()

    val b = KotlinProgramar()
    b.work()

    var c: Programador = KotlinProgramar()
    c.work()

    c = Programador()
    c.work()
}

abstract class Employee {
    abstract fun work()

}

open class Programador : Employee() {
    override fun work() {
        println("Programar working...")
    }

}

class KotlinProgramar : Programador() {

}

class Teacher : Employee() {
    override fun work() {
        println("Teacher working...")
    }

}
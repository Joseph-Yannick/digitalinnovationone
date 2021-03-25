package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1100.0, 1230.0, 1550.0)

    for (salario in salarios) {

        println(salario)
    }

    println("--------------")
    println("Maior Salário:  ${salarios.maxOrNull()}")
    println("Menor Salário:  ${salarios.minOrNull()}")
    println("Médio Salário:  ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 1549.0 }
        println("--------------")
        salariosMaiorQue2500.forEach { println(it) }

        println("--------------")
        println(salarios.count { it in 1080.0..1555.0})

        println("--------------")
        println(salarios.find { it == 1520.0 })

        println("--------------")
        println(salarios.any { it in 1100.0..1550.0 })
}
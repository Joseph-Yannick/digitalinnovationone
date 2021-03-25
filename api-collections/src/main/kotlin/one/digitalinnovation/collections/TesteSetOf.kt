package one.digitalinnovation.collections

fun main() {
    val ana = Funcionarios (nome = "Ana Luíza", salario = 1600.0, tipoContratacao = "PJ")
    val almir = Funcionarios (nome = "Almir Cerqueira", salario = 1230.0, tipoContratacao = "PJ")
    val vilma = Funcionarios (nome = "Vilma Cerqueira", salario = 1600.0, tipoContratacao = "PJ")
    val joseph = Funcionarios (nome = "Joseph Yannick", salario = 1735.0, tipoContratacao = "CLT")

    val Funcionarios1 = setOf(joseph)
    val Funcionarios2 = setOf(ana, almir, vilma)
    val resultUnion = Funcionarios1.union(Funcionarios2)
        resultUnion.forEach { println(it) }

        println("--------------------------------")
        println(Funcionarios1)

        println("--------------------------------")
        println(Funcionarios2)

        println("--------------------------------")
    val Funcionarios3 = setOf(joseph, ana, almir, vilma)
    val resultSubtract = Funcionarios1.subtract(Funcionarios2)
        resultSubtract.forEach { println(it) }

        println("--------------------------------")
    val resultIntersect = Funcionarios3.intersect(Funcionarios2)
        resultIntersect.forEach { println(it) }

}
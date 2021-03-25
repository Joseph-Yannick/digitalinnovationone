package one.digitalinnovation.collections

fun main() {
    val ana = Funcionario (nome = "Ana Luíza", salario = 1600.0, tipoContratacao = "PJ")
    val almir = Funcionario (nome = "Almir Cerqueira", salario = 1230.0, tipoContratacao = "PJ")
    val vilma = Funcionario (nome = "Vilma Cerqueira", salario = 1600.0, tipoContratacao = "PJ")
    val joseph = Funcionario (nome = "Joseph Yannick", salario = 1735.0, tipoContratacao = "CLT")

    val Funcionario1 = setOf(joseph)
    val Funcionario2 = setOf(ana, almir, vilma)
    val resultUnion = Funcionario1.union(Funcionario2)
        resultUnion.forEach { println(it) }

        println("--------------------------------")
        println(Funcionario1)

        println("--------------------------------")
        println(Funcionario2)

        println("--------------------------------")
    val Funcionario3 = setOf(joseph, ana, almir, vilma)
    val resultSubtract = Funcionario1.subtract(Funcionario2)
        resultSubtract.forEach { println(it) }

        println("--------------------------------")
    val resultIntersect = Funcionario3.intersect(Funcionario1)
        resultIntersect.forEach { println(it) }

}
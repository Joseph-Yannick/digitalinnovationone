package one.digitalinnovation.collections

fun main() {
    val ana = Funcionario (nome = "Ana Luíza", salario = 1600.0, tipoContratacao = "PJ")
    val almir = Funcionario (nome = "Almir Cerqueira", salario = 1230.0, tipoContratacao = "PJ")
    val vilma = Funcionario (nome = "Vilma Cerqueira", salario = 1600.0, tipoContratacao = "PJ")
    val joseph = Funcionario (nome = "Joseph Yannick", salario = 1735.0, tipoContratacao = "CLT")

        println("------------LIST--------------")
    val funcionario = mutableListOf(joseph, ana)
        funcionario.forEach { println(it) }

        println("------------------------------")
        funcionario.add(vilma)
        funcionario.add(almir)
        funcionario.forEach { println(it) }

        println("------------------------------")
        funcionario.remove(vilma)
        funcionario.remove(almir)
        funcionario.remove(ana)
        funcionario.forEach { println(it) }

        println("-------------SET--------------")
    val funcionarioSet = mutableSetOf(almir)
        funcionarioSet.forEach { println(it) }

        println("------------------------------")
        funcionarioSet.add(joseph)
        funcionarioSet.add(ana)
        funcionarioSet.forEach { println(it) }

        println("------------------------------")
        funcionarioSet.remove(almir)
        funcionarioSet.forEach { println(it) }
}
package one.digitalinnovation.collections

fun main() {
    val ana = Funcionarios (nome = "Ana Luíza", salario = 1600.0, tipoContratacao = "PJ")
    val almir = Funcionarios (nome = "Almir Cerqueira", salario = 1230.0, tipoContratacao = "PJ")
    val vilma = Funcionarios (nome = "Vilma Cerqueira", salario = 1600.0, tipoContratacao = "PJ")
    val joseph = Funcionarios (nome = "Joseph Yannick", salario = 1735.0, tipoContratacao = "CLT")

        println("------------LIST--------------")
    val funcionarios = mutableListOf(joseph, ana)
        funcionarios.forEach { println(it) }

        println("------------------------------")
        funcionarios.add(vilma)
        funcionarios.add(almir)
        funcionarios.forEach { println(it) }

        println("------------------------------")
        funcionarios.remove(vilma)
        funcionarios.remove(almir)
        funcionarios.remove(ana)
        funcionarios.forEach { println(it) }

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
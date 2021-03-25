package one.digitalinnovation.collections

fun main() {
    val ana = Funcionario (nome = "Ana Luíza", salario = 1600.0, tipoContratacao = "PJ")
    val almir = Funcionario (nome = "Almir Cerqueira", salario = 1230.0, tipoContratacao = "PJ")
    val vilma = Funcionario (nome = "Vilma Cerqueira", salario = 1600.0, tipoContratacao = "PJ")
    val joseph = Funcionario (nome = "Joseph Yannick", salario = 1735.0, tipoContratacao = "CLT")

    val repositorio = Repositorio<Funcionario>()

        repositorio.create(joseph.nome, joseph)
        repositorio.create(vilma.nome, vilma)
        repositorio.create(almir.nome, almir)
        repositorio.create(ana.nome, ana)

        println(repositorio.findById(joseph.nome))
        println("-------------------------------")
        println(repositorio.findById(ana.nome))

        println("-------------------------------")
        repositorio.findAll().forEach { println(it) }

        println("-------------------------------")
        repositorio.remove(almir.nome)
        repositorio.findAll().forEach { println(it) }

        println("-------------------------------")
        repositorio.remove(joseph.nome)
        repositorio.findAll().forEach { println(it) }

}
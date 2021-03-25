package one.digitalinnovation.collections

fun main() {
    val ana = Funcionario (nome = "Ana Luíza", salario = 1550.0, tipoContratacao = "PJ")
    val almir = Funcionario (nome = "Almir Cerqueira", salario = 1230.0, tipoContratacao = "PJ")
    val vilma = Funcionario (nome = "Vilma Cerqueira", salario = 1600.0, tipoContratacao = "PJ")
    val joseph = Funcionario (nome = "Joseph Yannick", salario = 1735.0, tipoContratacao = "CLT")

    val Funcionario = listOf(ana, almir, vilma, joseph)
        Funcionario.forEach { println(it) }

        println("-----------------------------")    // Identificar apenas o nome de um funcionário com o seu salário
        println(Funcionario.find { it.nome == "Ana Luíza" })

        println("-----------------------------")    // Listar os salários dos funcionários em ordem crescente
        Funcionario.sortedBy { it.salario }.forEach { println(it) }

        println("-----------------------------")    // Agrupar os funcionários conforme seus salários
        Funcionario.groupBy { it.salario }.forEach { println(it) }

        println("-----------------------------")    // Agrupar os funcionários conforme tipo de contratação de cada um
        Funcionario.groupBy { it.tipoContratacao }.forEach { println(it) }

      }

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String

){

    override fun toString(): String =
        """
            Nome:    $nome
            Salário: $salario
        """.trimIndent()


}
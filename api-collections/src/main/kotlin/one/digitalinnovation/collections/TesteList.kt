package one.digitalinnovation.collections

fun main() {
    val ana = Funcionarios (nome = "Ana Luíza", salario = 1600.0, tipoContratacao = "PJ")
    val almir = Funcionarios (nome = "Almir Cerqueira", salario = 1230.0, tipoContratacao = "PJ")
    val vilma = Funcionarios (nome = "Vilma Cerqueira", salario = 1600.0, tipoContratacao = "PJ")
    val joseph = Funcionarios (nome = "Joseph Yannick", salario = 1735.0, tipoContratacao = "CLT")

    val Funcionarios = listOf(ana, almir, vilma, joseph)
        Funcionarios.forEach { println(it) }

        println("-----------------------------")    // Identificar apenas o nome de um funcionário com o seu salário
        println(Funcionarios.find { it.nome == "Ana Luíza" })

        println("-----------------------------")    // Listar os salários dos funcionários em ordem crescente
        Funcionarios.sortedBy { it.salario }.forEach { println(it) }

        println("-----------------------------")    // Agrupar os funcionários conforme seus salários
        Funcionarios.groupBy { it.salario }.forEach { println(it) }

        println("-----------------------------")    // Agrupar os funcionários conforme tipo de contratação de cada um
        Funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) }

      }

data class Funcionarios(
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
package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal


fun main() {
    val joseph = Pessoa(nome = "Joseph Yannick", cpf = "123.456.789-00", salario = "2000.00")
    println (joseph.nome)
    println (joseph.cpf)


    val ana = Funcionario( nome = "Ana Luiza", cpf = "123.456.789-20".toString(), BigDecimal.valueOf( 2035.00))
    println (ana.nome)
    println (ana.cpf)
    println(ana.salario)

}
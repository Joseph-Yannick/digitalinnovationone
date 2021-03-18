package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Funcionario(

     nome: String,
     cpf: String,
    val salario: BigDecimal

) : Pessoa(nome, cpf, "2000.00") {
}
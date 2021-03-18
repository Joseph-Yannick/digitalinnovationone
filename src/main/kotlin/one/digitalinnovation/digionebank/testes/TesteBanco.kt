package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main () {
    val nome: String = "DigiOne"
    val numero = 12
    val digiOneBank = Banco(nome, numero)

    println (digiOneBank.nome)
    println (digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "Banco2")

    println(banco2.info())


}
package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo


fun main() {
    val almir = Cliente(
        nome =        "Almir Cerqueira",
        cpf =         "537.036.454-09",
        clienteTipo = ClienteTipo.PF,
        senha =       "123456"
    )

    println (almir)

    TesteAutenticacao().autentica(almir)
}
package one.digitalinnovation.digionebank

class Pessoa {
    var name: String = "Joseph"
    var cpf: String = "123.456.789-00"
}

fun main() {
    val joseph = Pessoa ()

    println (joseph.name)
    println (joseph.cpf)

}
package one.digitalinnovation.digionebank.testes




import one.digitalinnovation.digionebank.Gerente
import org.jetbrains.annotations.TestOnly


fun main() {

    val vilma = Gerente ( nome = "Vilma Cerqueira", cpf = "123.456.789-20",  5520.0, "senha354")

    ImprimeRelatorioFuncionario.imprime(vilma)

    TesteAutenticacao().autentica(vilma)

}



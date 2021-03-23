package one.digitalinnovation.collections

fun main() {

        println("Lista de Nomes")
        println("--------------")
    val nomes = Array ( 3){""}
        nomes[0] = "Ana Luíza"
        nomes[1] = "Vilma"
        nomes[2] = "Almir"

        for (nome in nomes ) {
            println(nome)

        }

        println("--------------")
        nomes.sort()
        nomes.forEach {
        println(it)

        }

        println("--------------")
        println("Lista de Nomes 2")
        println("--------------")
    val nomes2 = arrayOf("Ana Luíza", "Vilma", "Almir")
        nomes2.sort()
        nomes2.forEach {
        println(it)

    }
        println("--------------")
        for (nome in nomes2)
        println(nome)

}
package one.digitalinnovation.collections

fun main() {
     val values = IntArray(5)
    values [0] = 6
    values [1] = 8
    values [2] = 3
    values [3] = 9
    values [4] = 5

    println("Lista de Números Aleatórios")
    println("---------------------------")
    for (valor in values){
        println (valor)

    }

    println("--------------")
    values.forEach {
        println(it)
    }

    println("--------------")
    values.forEach { valor ->
        println(valor)
    }

    println("--------------")
    for (index in values.indices) {
        println(values[index])
    }

    println("--------------")
    values.sort() // Imprimir a lista na ordem cresente
    for (valor in values) {
        println(valor)

    }
}

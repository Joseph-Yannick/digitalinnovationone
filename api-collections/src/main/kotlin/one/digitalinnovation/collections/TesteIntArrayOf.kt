package one.digitalinnovation.collections

fun main() {

    println("Lista de Números Aleatórios")
    println("---------------------------")
    val values = intArrayOf(5, 8, 10, 4, 11)

    values.forEach {
    println(it)


    }
    println("---------------------------")
    values.sort()
    values.forEach{
    println(it)

    }


}





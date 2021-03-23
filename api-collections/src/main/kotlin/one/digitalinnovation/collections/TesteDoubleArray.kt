package one.digitalinnovation.collections

fun main() {

        println("Lista de Salários")
        println("-----------------")
    val salarios = DoubleArray(3)
        salarios[0] = 1100.0
        salarios[1] = 1500.0
        salarios[2] = 1350.0
        salarios.forEach {
        println(it)

    }
        println("-----------------")
        for (salario in salarios)
        println(salario)

        println("-----------------")   // Imprimir a lista na ordem cresente
        salarios.sort()
        salarios.forEach {
        println(it)

        }

        println("--------------")   // Imprimir a lista na ordem cresente
        for (index in salarios.indices) {
        println(salarios[index])
    }

        println("--------------")   // Imprimir a lista na ordem cresente
        salarios.forEach { salario ->
        println(salario)
    }

        println("--------------")   // Proporciona a possibilidade de atualizar o valor do salário em caso de aumento, bônus, etc..
        salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 0.1
        println(salario)
    }

        println("-------------------------------------------------")
        println("Lista de Aumento de 10% aplicados em cada Salário")
        println("-------------------------------------------------")
        salarios.forEach {
        println(it)

        }

        println("--------------")
    val salarios2 = doubleArrayOf(1210.0, 1650.0, 1485.0)
        salarios2.sort()
        salarios2.forEach {
        println(it)

        }
}




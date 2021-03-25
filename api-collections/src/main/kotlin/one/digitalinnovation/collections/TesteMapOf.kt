package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("Joseph", 1735.0)
    val map1 = mapOf(pair)

        map1.forEach { (k, v) -> println("Chave: $k - Valor: $v")}

    val map2 = mapOf("Ana Luíza" to 1600.0, "Almir" to 1230.0)

        map2.forEach { (k, v) -> println("Chave: $k - Valor: $v") }
}
package one.digitalinnovation.collections

fun main() {
    val salarios = arrayOf("1230".toBigDecimal(),
        "1550".toBigDecimal(),
        "1600".toBigDecimal(), "1750".toBigDecimal()
    )

    println("----------SOMA-------------")
    println(salarios.somatorio())

    println("----------MEDIA-------------")
    println(salarios.media())

}






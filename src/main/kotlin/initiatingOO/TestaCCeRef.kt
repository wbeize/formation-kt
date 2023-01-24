package initiatingOO

fun testaCCeRef() {
    val numX = 10
    var numY = numX
    numY++

    println("numX $numX")
    println("numY $numY")

    val contaAngu = Conta("Angu",1013)
    contaAngu.titular = "Angu"

    val contaAmeixa = Conta("Ameixa",1014)
    contaAmeixa.titular = "Ameixa"

    println("titular conta angu: ${contaAngu.titular}")
    println("titular conta ameixa: ${contaAmeixa.titular}")
}

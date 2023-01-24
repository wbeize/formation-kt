package controlflow

fun main() {
    println("aproveita teu banquin! :)")

    var i = 0

    while (i < 5) {
        val titular = "Feijão $i"
        val numConta = 1000 + i
        var saldo = i + 0.0

        println("titular: $titular")
        println("número da conta $numConta")
        println("saldo da conta $saldo \n")
    }
}
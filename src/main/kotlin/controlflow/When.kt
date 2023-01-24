package controlflow

fun main() {
    println("pruveita o banquin")

    val titular = "Feijão"
    val numConta = 1000
    var saldo = 0.0

    println("titular: $titular")
    println("número da conta: $numConta")
    println("saldo da conta: $saldo\n")

    when {
        saldo > 0.0 -> println("conta positiva")
        saldo == 0.0 -> println("conta zerada")
        else -> println("conta negativa")
    }
}
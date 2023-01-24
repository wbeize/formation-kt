package initiatingOO

fun testaLacos() {

    var i = 0

    while (i < 5) {
        val titular = "Macarrão $i"
        val numConta = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("numero da conta $numConta")
        println("saldo da conta $saldo\n")
        i++
    }
}
package initiatingOO

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("conta positiva")
    } else if (saldo == 0.0) {
        println("conta neutra/zerada")
    } else {
        println("conta negativa")
    }
}
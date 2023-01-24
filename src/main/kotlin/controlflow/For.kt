package conceitos.estrepeticao

fun main() {

    println("aproveita teu banquin! :)")

//        for (i in 5 downTo 1 step 2) {
//            if (i == 4) {
//                break
//            }

    for (i in 1..5) {
        if (i == 4) {
            break
        }

        val titular = "Feijão $i"
        val numConta = 1000 + i
        var saldo = i + 0.0

        println("titular: $titular")
        println("número da conta $numConta")
        println("saldo da conta $saldo \n")

    //testaCondicoes(saldo)
    }

}
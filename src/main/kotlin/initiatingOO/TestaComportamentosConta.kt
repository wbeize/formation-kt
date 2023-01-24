package initiatingOO

fun testaComportamentosConta() {
    val contaArroz = Conta(titular = "Arroz", numConta = 1011)
    contaArroz.deposita(200.0)

    println(contaArroz.titular)
    println(contaArroz.numConta)
    println(contaArroz.saldo)

    val contaMaca = Conta(titular = "Maçã", numConta = 1012)
    contaMaca.deposita(300.0)

    println(contaMaca.titular)
    println(contaMaca.numConta)
    println(contaMaca.saldo)

    //testaCCeRef()

    println("depositando na conta do Arroz")
    contaArroz.deposita(50.0)
    println(contaArroz.saldo)

    print("depositando na conta da Maca")
    contaMaca.deposita(70.0)
    println(contaMaca.saldo)

    println("sacando da conta do Arroz")
    contaArroz.saca(250.0)
    println(contaArroz.saldo)

    println("sacando da conta da Maçã")
    contaMaca.saca(100.0)
    println(contaMaca.saldo)

    println("saque em excesso - Arroz")
    contaArroz.saca(100.0)
    println(contaArroz.saldo)

    println("saque em excesso - Maçã")
    contaMaca.saca(500.0)

    println("transferência da conta da Maçã para o Arroz")

//    if (contaMaca.transfere(numConta = 100.0, titular = contaArroz)) {
//        println("transferência concluída")
//    } else {
//        println("falha na transferência")
//    }

    println(contaMaca.saldo)
    println(contaArroz.saldo)
}

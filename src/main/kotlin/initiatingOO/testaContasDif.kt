package initiatingOO

fun testaContasDif() {

    var contaCorrente = ContaCorrente(titular = "Arroz", numConta = 1000)

    var contaPoupanca = ContaPoupanca(titular = "Maçã", numConta = 1011)

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo corrente após saque: ${contaCorrente.saldo}")
    println("saldo poupança após saque: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente)

    println("saldo poupança após transferir para corrente: ${contaCorrente.saldo}")
    println("saldo corrente após receber transferência: ${contaPoupanca.saldo}")

}
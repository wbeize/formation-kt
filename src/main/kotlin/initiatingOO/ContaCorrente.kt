package initiatingOO

open class ContaCorrente(titular: String, numConta: Int) : Conta(titular = titular, numConta = numConta) {

    override fun saca(valor: Double) {
        val valorTaxa = valor + 0.1
        super.saca(valorTaxa)
    }

}

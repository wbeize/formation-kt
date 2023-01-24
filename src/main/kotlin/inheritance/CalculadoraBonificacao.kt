package inheritance

class CalculadoraBonificacao {
    var total: Double = 0.0
    fun registra(funcionario: Funcionario) {
        println("nome ${funcionario.bonificacao()}")
        this.total += funcionario.bonificacao()
    }

}
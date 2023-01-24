package inheritance

fun testaFuncionarios() {
    val batata = Funcionario(
        nome = "batata",
        cpf = "111.111.123-11",
        salario = 1000.0
    )

    println("nome: ${batata.nome}")
    println("cpf: ${batata.cpf}")
    println("salario: ${batata.salario}")
    println("bonificação: ${batata.bonificacao()}")

    val alecrim = Gerente(
        nome = "alecrim",
        cpf = "222.222.210-22",
        salario = 2000.0,
        senha = 1234
    )

    println("nome: ${alecrim.nome}")
    println("cpf: ${alecrim.cpf}")
    println("salario: ${alecrim.salario}")
    println("bonificação: ${alecrim.bonificacao()}")

    if (alecrim.autentica(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticacao")
    }

    val oxe = Diretor(
        nome = "oxe",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 40,
        plr = 200.0
    )

    println("nome: ${oxe.nome}")
    println("cpf: ${oxe.cpf}")
    println("salario: ${oxe.salario}")
    println("bonificação: ${oxe.bonificacao()}")

    val salsa = Analista(nome = "Salsa", salario = 4000.00, cpf = "444.444.444-44")

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alecrim)
    calculadora.registra(batata)
    calculadora.registra(oxe)
    calculadora.registra(salsa)
}
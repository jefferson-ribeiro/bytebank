fun main() {
    println("Bem vindo ao Bytebank")
    var i = 0
    while (i < 5) {
        val titular = "Jefferson $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Titular: $titular")
        println("Numero da Conta: $numeroConta")
        println("Saldo: $saldo")
        println("---------------------------")
        i++
    }

//    for (i in 5 downTo 1) {
//        println("Bem vindo ao Bytebank")
//
//        if (i == 4) {
//            continue
//        }
//
//        //Val criar varialvel que não pode ser alterada
//        // é obrigatorio inicializar a varialvel
//        val titular = "Jefferson $i"
//        val numeroConta = 1000 + i
//        var saldo = i + 10.0
//
//        println("Titular: $titular")
//        println("Numero da Conta: $numeroConta")
//        println("Saldo: $saldo")
//        println("---------------------------")
//    }

//    testaCondicoes(saldo)
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("o saldo da conta está positivo")
    } else if (saldo == 0.0) {
        println("o saldo da conta está zerado ")
    } else {
        println("o saldo da conta está negativo")
    }
//when é equivalente oa if else e pode ter o código reduzido e fazendo as mesmas coisas em menos linhas
    when {
        saldo > 0.0 -> println("o saldo da conta está positivo")
        saldo == 0.0 -> println("o saldo da conta está zerado ")
        else -> println("o saldo da conta está negativo")
    }
}
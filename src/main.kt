fun main() {
    println("Bem vindo ao Bytebank")
    println("---------------------")
    val contaLi = Conta(titular = "Livia", numero = 1000)
    contaLi.deposita(valor = 200.0)

    val contaLu = Conta(titular = "Lucca", numero = 1001)
    contaLu.deposita(350.0)

    println(contaLi.titular)
    println(contaLi.numero)
    println(contaLi.saldo)

    println("###############")
    println(contaLu.titular)
    println(contaLu.numero)
    println(contaLu.saldo)


    println("depositando na conta da Livia")
    contaLi.deposita(valor = 50.0)
    println(contaLi.saldo)

    println("depositando na conta da Lucca")
    contaLu.deposita(valor = 70.0)
    println(contaLu.saldo)

    println("sacando da conta da Livia")
    contaLi.saca(valor = 250.0)
    println(contaLi.saldo)

    println("sacando da conta do Lucca")
    contaLu.saca(valor = 100.0)
    println(contaLu.saldo)

    println("saque em excesso")
    contaLi.saca(valor = 50.0)
    println(contaLi.saldo)

    println("Trasferencia da conta do Lucca para a conta da Livia")
    contaLu.transfere(500.0, contaLi)
    println("Conta Lucca: ${contaLu.saldo}")
    println("Conta Livia: ${contaLi.saldo}")
}

class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set

    //Contruotor secundário
/*    constructor(titular: String, numero: Int){
        this.titular = titular
        this.numero = numero
    }*/

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            saldo -= valor
        } else {
            println("saldo insuficiente")
        }
    }

    fun transfere(valor: Double, destino: Conta) {
        if (this.saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            println("Transferencia efetuada com sucesso")
        } else {
            println("Saldo insuficiente para transferencia")
        }
    }
// geter e seter para manipular dados privados ou protegidos
/*    fun getSaldo(): Double{
        return saldo
    }

    fun setSaldo(valor: Double){
        saldo = valor
    }*/
}

fun testaCopiasEReferencias() {

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta(titular = "João", numero = 1003)
    var contaMaria = Conta(titular = "Maria", numero = 1004)
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}

fun testaLacos() {

    var i = 0
    while (i < 5) {
        val titular = "Jefferson $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0
        i++
        println("Titular: $titular")
        println("Numero da Conta: $numeroConta")
        println("Saldo: $saldo")
        println("---------------------------")
    }
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
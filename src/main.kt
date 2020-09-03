fun main() {
    println("Hello World")

    val titular = "Vinícius de Morais Mussato"
    val numeroConta: Int = 1000
    var saldo = 0.0

    saldo += -100

    println("O número da conta é $numeroConta")
    println("O saldo é $saldo")
    println("O títular é $titular")

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("Conta é positiva")
    } else if (saldo == 0.0) {
        println("Conta é neutra")
    } else {
        println("Conta é negativa")
    }
}
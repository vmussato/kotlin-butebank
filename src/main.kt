fun main() {
    println("Hello World")

    for (i in 1..5) {

        val titular = "Vinícius $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0



        println("O número da conta é $numeroConta")
        println("O saldo é $saldo")
        println("O títular é $titular")


    }

    //testaCondicoes(saldo)

}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}
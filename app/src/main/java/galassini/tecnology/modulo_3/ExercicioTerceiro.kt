package galassini.tecnology.modulo_3

class ExercicioTerceiro {
}
fun main() {
    // Teste com a variável "par"
    val numeroPar = 10
    println("Testando com o número par: $numeroPar")
    when {
        numeroPar % 2 == 0 -> println("O número é par")
        else -> println("O número é ímpar")
    }

    // Teste com a variável "ímpar"
    val numeroImpar = 7
    println("\nTestando com o número ímpar: $numeroImpar")
    when {
        numeroImpar % 2 == 0 -> println("O número é par")
        else -> println("O número é ímpar")
    }

    // Teste com uma variável de valor diferente
    val outroNumero = 3
    println("\nTestando com outro número: $outroNumero")
    when {
        outroNumero % 2 == 0 -> println("O número é par")
        else -> println("O número é ímpar")
    }
}



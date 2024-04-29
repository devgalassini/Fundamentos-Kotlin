package galassini.tecnology.modulo_3

class ExercicoQuarto {
}
fun main() {
    // Criando um array de tamanho 40 e preenchendo com números de 1 a 39
    val array = IntArray(40)
    for (i in 1..39) {
        array[i - 1] = i
    }

    // Imprimindo o array
    println("Array de números:")
    for (numero in array) {
        print("$numero ")
    }
    println()

    // Criando uma lista de inteiros e preenchendo com números de 1 a 99
    val lista = mutableListOf<Int>()
    for (i in 1..99) {
        lista.add(i)
    }

    // Calculando a soma dos elementos da lista
    var soma = 0
    for (numero in lista) {
        soma += numero
    }

    println("A soma dos números de 1 a 99 é: $soma")
}

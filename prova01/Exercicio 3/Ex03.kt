fun fibonacci(n: Int): List<Int> {
    val sequencia = mutableListOf(0, 1)  // Inicializa a sequência de Fibonacci com os dois primeiros números

    // Gera a sequência de Fibonacci até o número n
    for (i in 2..n) {
        val proximo = sequencia[i - 1] + sequencia[i - 2]  // O próximo número é a soma dos dois anteriores
        sequencia.add(proximo)  // Adiciona o próximo número à sequência
    }

    // Retorna a sequência, limitando até o valor n
    return sequencia.takeWhile { it <= n }
}

fun main() {
    val numero = 21  // Exemplo de número limite
    val resultado = fibonacci(numero)  // Chama a função fibonacci
    println("Sequência de Fibonacci até $numero: $resultado")
}

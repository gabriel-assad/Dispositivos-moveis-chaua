fun main() {
    val listaOriginal = listOf("10", "20", "abc", "30", "xyz")  // Cria uma lista de strings, algumas contendo números e outras texto
    val listaConvertida = mutableListOf<Int>()  // Inicializa uma lista mutável para armazenar os números convertidos
    val listaNaoConvertida = mutableListOf<String>()  // Inicializa uma lista mutável para armazenar os elementos que não puderam ser convertidos

    // Itera sobre cada elemento da lista original
    for (elemento in listaOriginal) {
        try {
            // Tenta converter o elemento para inteiro
            listaConvertida.add(elemento.toInt())
        } catch (e: NumberFormatException) {
            // Se ocorrer uma exceção de formato inválido, adiciona o elemento original à lista de não convertidos
            listaNaoConvertida.add(elemento)
        }
    }

    // Exibe a lista de números convertidos
    println("Lista de inteiros convertidos: $listaConvertida")
    // Exibe a lista de strings que não puderam ser convertidas
    println("Lista de strings não convertidas: $listaNaoConvertida")
}

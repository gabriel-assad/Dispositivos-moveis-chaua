fun converterStringParaInt(valor: String): Int? {
    return try {
        valor.toInt()  // Tenta converter a string para inteiro
    } catch (e: NumberFormatException) {
        null  // Retorna null se houver exceção
    }
}

fun main() {
    val valor = "123a"  // Exemplo com string inválida
    val numero = converterStringParaInt(valor)  // Chama a função para converter a string

    if (numero != null) {
        println("Valor convertido: $numero")  // Se a conversão for bem-sucedida, exibe o número
    } else {
        println("Valor inválido: $valor não é um número inteiro.")  // Se falhar, exibe uma mensagem de erro
    }
}

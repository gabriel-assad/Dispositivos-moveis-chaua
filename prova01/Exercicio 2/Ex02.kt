fun ehBissexto(ano: Int): Boolean {
    // Retorna verdadeiro se o ano for bissexto
    return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)
}

fun verificarData(dia: Int, mes: Int, ano: Int): String {
    return when (mes) {
        1, 3, 5, 7, 8, 10, 12 -> if (dia in 1..31) "Data válida" else "Data inválida"  // Meses com 31 dias
        4, 6, 9, 11 -> if (dia in 1..30) "Data válida" else "Data inválida"  // Meses com 30 dias
        2 -> if (ehBissexto(ano) && dia in 1..29) "Data válida"  // Fevereiro em ano bissexto
        else if (!ehBissexto(ano) && dia in 1..28) "Data válida"  // Fevereiro em ano não bissexto
        else "Data inválida"
        else -> "Data inválida"  // Se o mês não for válido
    }
}

fun main() {
    println(verificarData(29, 2, 2020))  // Exemplo: ano bissexto
    println(verificarData(29, 2, 2021))  // Exemplo: ano não bissexto
}

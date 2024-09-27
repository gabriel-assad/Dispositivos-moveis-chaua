fun main() {
    // Cria uma lista de tarefas
    val tarefas = listOf(
        Tarefa("Estudar", "Revisar para a prova", "Alta", "2024-10-15"),
        Tarefa("Comprar mantimentos", "Ir ao supermercado", "Média", "2024-09-30"),
        Tarefa("Limpar a casa", "Fazer faxina geral", "Baixa", "2024-09-25")
    )

    // Ordena por prioridade
    val porPrioridade = tarefas.sortedBy { it.prioridade }
    println("Tarefas ordenadas por prioridade:")
    porPrioridade.forEach { println("${it.titulo} - ${it.prioridade}") }

    // Ordena por data limite
    val porDataLimite = tarefas.sortedBy { it.dataLimite }
    println("\nTarefas ordenadas por data limite:")
    porDataLimite.forEach { println("${it.titulo} - ${it.dataLimite}") }

    // Ordena por título, considerando prioridade e data como critérios de desempate
    val porTitulo = tarefas.sortedWith(compareBy({ it.titulo }, { it.prioridade }, { it.dataLimite }))
    println("\nTarefas ordenadas por título:")
    porTitulo.forEach { println("${it.titulo} - ${it.prioridade} - ${it.dataLimite}") }
}

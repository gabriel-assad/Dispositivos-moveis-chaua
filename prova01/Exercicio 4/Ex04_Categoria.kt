class Categoria(val nome: String, val descricao: String) {
    // Método para exibir as informações da categoria
    fun mostrarInformacoes() {
        println("Categoria: $nome")
        println("Descrição: $descricao")
    }
}

class Produto(val nome: String, val preco: Double, val quantidade: Int, val categoria: Categoria) {
    // Método para exibir as informações do produto e sua categoria associada
    fun mostrarInformacoes() {
        println("Produto: $nome")
        println("Preço: R$ $preco")
        println("Quantidade: $quantidade")
        categoria.mostrarInformacoes()  // Exibe as informações da categoria associada ao produto
    }
}

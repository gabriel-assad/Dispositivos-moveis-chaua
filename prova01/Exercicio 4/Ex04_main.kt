fun main() {
    val categoriaEletronicos = Categoria("Eletrônicos", "Aparelhos eletrônicos e acessórios")  // Criação da categoria
    val produto1 = Produto("Smartphone", 1500.0, 10, categoriaEletronicos)  // Produto associado à categoria
    val produto2 = Produto("Televisão", 2500.0, 5, categoriaEletronicos)

    produto1.mostrarInformacoes()  // Exibe informações do produto 1
    println("---")
    produto2.mostrarInformacoes()  // Exibe informações do produto 2
}

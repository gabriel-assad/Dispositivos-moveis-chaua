class Retangulo(cor: String, val largura: Double, val altura: Double) : FormaGeometrica(cor, largura * altura) {
    override fun calcularPerimetro(): Double {
        return 2 * (largura + altura)  // Cálculo do perímetro do retângulo
    }
}

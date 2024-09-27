class Quadrado(cor: String, val lado: Double) : FormaGeometrica(cor, lado * lado) {
    override fun calcularPerimetro(): Double {
        return 4 * lado  // Cálculo do perímetro do quadrado
    }
}

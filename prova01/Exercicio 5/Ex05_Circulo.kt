class Circulo(cor: String, val raio: Double) : FormaGeometrica(cor, PI * raio * raio) {
    override fun calcularPerimetro(): Double {
        return 2 * PI * raio  // Cálculo do perímetro do círculo
    }
}

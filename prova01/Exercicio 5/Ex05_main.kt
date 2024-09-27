fun main() {
    val circulo = Circulo("Vermelho", 5.0)  // Criação do círculo
    val quadrado = Quadrado("Azul", 4.0)  // Criação do quadrado
    val retangulo = Retangulo("Verde", 6.0, 3.0)  // Criação do retângulo
    println("Círculo - Perímetro: ${circulo.calcularPerimetro()}")  // Exibe o perímetro do círculo
    println("Quadrado - Perímetro: ${quadrado.calcularPerimetro()}")  // Exibe o perímetro do quadrado
    println("Retângulo - Perímetro: ${retangulo.calcularPerimetro()}")  // Exibe o perímetro do retângulo
}

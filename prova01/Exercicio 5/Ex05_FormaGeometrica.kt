import kotlin.math.PI
open class FormaGeometrica(val cor: String, val area: Double) {
    open fun calcularPerimetro(): Double {
        return 0.0  // Método sobrescrito nas subclasses
    }

    fun mostrarInformacoes() {
        println("Cor: $cor")
        println("Área: $area")
    }
}

class Carro(val marca: String, val modelo: String, private val corDoCarro: String) : Colorivel {
    override fun cor(): String {
        return corDoCarro  // Retorna a cor do carro
    }
}

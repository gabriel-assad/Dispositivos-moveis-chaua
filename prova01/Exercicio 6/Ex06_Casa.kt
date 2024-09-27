class Casa(val endereco: String, private val corDaCasa: String) : Colorivel {
    override fun cor(): String {
        return corDaCasa  // Retorna a cor da casa
    }
}

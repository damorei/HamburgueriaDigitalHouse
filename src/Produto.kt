class Produto (override val preco: Double, val nome:String) : ItemDeCarrinho() {
    override fun toString(): String {
        return "Produto($nome)"
    }

}
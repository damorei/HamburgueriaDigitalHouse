class ComboFamiliar (vararg combo: Combo) : ItemDeCarrinho() {
    override var preco :Double = 0.00
    var listaProdutos = mutableListOf<Combo>()
    val descontoPromocional: Double = 0.1

    init{
        listaProdutos.addAll(combo)
        listaProdutos.forEach{preco += it.preco}
        preco *= (1 - descontoPromocional)
    }

    override fun toString(): String {
        return "Combo(${listaProdutos.size} combos)"
    }

}
class ComboFamiliar (vararg combo: Combo) : ItemDeCarrinho() {
    override var preco :Double = 0.00
    var listaProdutos = mutableListOf<Combo>()
    init{
        listaProdutos.addAll(combo)
        listaProdutos.forEach{preco += it.preco}
        preco *= 0.9
    }
}
class Combo (vararg produto: Produto) : ItemDeCarrinho()
{
    override var preco :Double = 0.00
    var listaProdutos = mutableListOf<Produto>()
    val descontoPromocional: Double = 0.1

    init{
        listaProdutos.addAll(produto)
        listaProdutos.forEach{preco += it.preco}
        preco *= (1 - descontoPromocional)
    }

}
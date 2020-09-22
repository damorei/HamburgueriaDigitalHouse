class Combo (vararg produto: Produto) : ItemDeCarrinho()
{
    override var preco :Double = 0.00
    var listaProdutos = mutableListOf<Produto>()
    init{
        listaProdutos.addAll(produto)
        listaProdutos.forEach{preco += it.preco}
        preco *= 0.9
    }

}
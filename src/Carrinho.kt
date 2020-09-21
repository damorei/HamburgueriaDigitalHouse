class Carrinho {
    var listaDeProdutos = mutableListOf<Produto>()

    fun adicionaProduto(produto: Produto){
        listaDeProdutos.add(produto)
    }

    fun calculaValorTotal() :Double{
        var totalCarrinho: Double =0.00
        listaDeProdutos.forEach{totalCarrinho += it.preco}
        return totalCarrinho
    }
}
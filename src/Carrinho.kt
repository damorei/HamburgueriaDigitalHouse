class Carrinho {
    var listaDeProdutos = mutableListOf<ItemDeCarrinho>()

    fun adicionaProduto(itemDeCarrinho: ItemDeCarrinho){
        listaDeProdutos.add(itemDeCarrinho)
    }

    fun calculaValorTotal() :Double{
        var totalCarrinho: Double =0.00
        listaDeProdutos.forEach{totalCarrinho += it.preco}
        return totalCarrinho
    }
}
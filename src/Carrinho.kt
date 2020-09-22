class Carrinho {
    var listaDeProdutos = mutableListOf<ItemDeCarrinho>()

    fun adicionaItem(vararg itemDeCarrinho: ItemDeCarrinho){
        listaDeProdutos.addAll(itemDeCarrinho)
    }

    fun calculaValorTotal() :Double{
        var totalCarrinho: Double =0.00
        listaDeProdutos.forEach{totalCarrinho += it.preco}
        return totalCarrinho
    }
}
class Carrinho {
    var listaDeProdutos = mutableListOf<ItemDeCarrinho>()

    fun adicionaItem(vararg itemDeCarrinho: ItemDeCarrinho){
        listaDeProdutos.addAll(itemDeCarrinho)
    }

    fun calculaValorTotal() {
        var totalCarrinho: Double =0.00
        listaDeProdutos.forEach{
            totalCarrinho += it.preco
            println("----- Pedido: $it; Preço: ${it.preco}")
        }
        println("Número de pedidos: ${listaDeProdutos.size}; Preço total: $totalCarrinho")
    }
}
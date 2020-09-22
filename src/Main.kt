fun main(){
    var carrinho : Carrinho = Carrinho()
    val bigMac : Produto = Produto(5.00,"Big Mac")
    val quarteirao : Produto = Produto(4.00,"Quarteirao")
    val cocaCola : Produto = Produto(3.00,"Coca Cola")
    val sorvete : Produto = Produto(2.00,"Sorvete")
    val maca : Produto = Produto(1.00,"Maca")

    val mcLancheFeliz : Combo = Combo(cocaCola,maca,bigMac)
    val comboDoDia: Combo = Combo(bigMac,quarteirao,sorvete,cocaCola)
    val comboFamiliar : ComboFamiliar = ComboFamiliar(mcLancheFeliz,comboDoDia)

    carrinho.adicionaItem(bigMac)
    carrinho.adicionaItem(mcLancheFeliz)
    carrinho.adicionaItem(comboFamiliar)

    carrinho.calculaValorTotal()

}
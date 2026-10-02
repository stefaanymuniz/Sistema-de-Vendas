
public class ItemPedido {

    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {    
        this.produto = produto;

        if (quantidade >= 0) {
            this.quantidade = quantidade;
        }
    }

    double calcularSubtotal() {
        return produto.getPreco() * quantidade;
    }

    double calcularSubtotalComDesconto(double percentual) {
        return calcularSubtotal() * (1 - percentual);
    }

    void aumentarQuantidade(int unidades) {
        if (unidades > 0) {
            quantidade += unidades;
        }
    }
    
    public void reduzirQuantidade(int unidades) {
        if (unidades > 0 && unidades <= quantidade) {
            quantidade -= unidades;
        }
    }

}

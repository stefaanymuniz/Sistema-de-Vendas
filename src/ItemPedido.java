
public class ItemPedido {

    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {    
        this.produto = produto;

        if (quantidade >= 0) {
            this.quantidade = quantidade;
        }
    }

    // Incremento A
    public boolean representa(Produto produto) {
        return this.produto == produto;
    } 

    double calcularSubtotal() {
        return produto.getPreco() * quantidade;
    }

    double calcularSubtotalComDesconto(double percentual) {
        return calcularSubtotal() * (1 - percentual);
    }

    // Incremento C
    public void alterarQuantidade(int novaQuantidade) {
    if (novaQuantidade > 0) {
        quantidade = novaQuantidade;
        }
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

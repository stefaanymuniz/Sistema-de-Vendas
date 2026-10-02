
public class ItemPedido {

    String descricao;
    double precoUnitario;
    private int quantidade;

    double calcularSubtotal() {
        return precoUnitario * quantidade;
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
    
    public int getQuantidade() {
        return quantidade;
    }
}

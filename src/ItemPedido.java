
public class ItemPedido {

    String descricao;
    double precoUnitario;
    int quantidade;

    double calcularSubtotal() {
        return precoUnitario * quantidade;
    }

    void aumentarQuantidade(int unidades) {
        quantidade += unidades;
    }

    double calcularSubtotalComDesconto(double percentual) {
        return calcularSubtotal() * (1 - percentual);
    }
}



import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens;

    public Pedido() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, int quantidade) { // atribuir a responsabilidade de criar o objeto ItemPedido ao método de Pedido; o que faz sentido, já que só se pode ter quantidades de um item se adicioná-lo à um pedido
        ItemPedido item = new ItemPedido(produto, quantidade);
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0.0;

        for(ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }

        return total;
    }
}

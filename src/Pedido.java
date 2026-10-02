

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens;
    private boolean fechado;

    public Pedido() {
        itens = new ArrayList<>();
        fechado = false;
    }

    public void fechar() {
        fechado = true;
    }

    public void adicionarItem(Produto produto, int quantidade) { 
        if (!fechado) {
            ItemPedido item = new ItemPedido(produto, quantidade);
            itens.add(item);
        }
    }

    public double calcularTotal() {
        double total = 0.0;

        for(ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }

        return total;
    }
}

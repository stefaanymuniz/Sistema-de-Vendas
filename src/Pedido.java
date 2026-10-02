

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

    // Incremento B
    public void removerItem(Produto produto) {
    if (!fechado) {
        for (int indice = 0; indice < itens.size(); indice++) {
            ItemPedido item = itens.get(indice);

            if (item.representa(produto)) {
                itens.remove(indice);
                return;
                }
            }
        }
    }

    public void alterarQuantidade(Produto produto, int novaQuantidade) {
    if (!fechado) {
        for (int indice = 0; indice < itens.size(); indice++) {
            ItemPedido item = itens.get(indice);

            if (item.representa(produto)) {
                if (novaQuantidade == 0) {
                    itens.remove(indice);
                } else {
                    item.alterarQuantidade(novaQuantidade);
                }
                return;
                }
            }
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

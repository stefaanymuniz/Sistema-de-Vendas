
public class Main {

    static void mostrarInfo(String descricao, int quantidade, double precoUnitario, double subtotal) {
        System.out.println("Produto: " + descricao);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: " + precoUnitario);
        System.out.println("Subtotal: " + subtotal + "\n");
    }
    
    public static void main(String[] args) {

        ItemPedido item1 = new ItemPedido();
        item1.descricao = "Teclado";
        item1.precoUnitario = 150.0;
        item1.quantidade = 3;
        
        ItemPedido item2 = new ItemPedido();
        item2.descricao = "Mouse";
        item2.precoUnitario = 80.0;
        item2.quantidade = 3;

        double subtotal = item1.calcularSubtotal();
        double subtotal2 = item2.calcularSubtotal();
        
        double totalCompra = subtotal + subtotal2;
        
        mostrarInfo(item1.descricao, item1.quantidade, item1.precoUnitario, subtotal);
        mostrarInfo(item2.descricao, item2.quantidade, item2.precoUnitario, subtotal2);
        
        // Incremento E — Alterar o estado por meio de um comportamento
        item1.aumentarQuantidade(2);
        subtotal = item1.calcularSubtotal();
        totalCompra = subtotal + subtotal2;
        
        System.out.println("** Quantidade do produto " + item1.descricao + " alterada: **");
        mostrarInfo(item1.descricao, item1.quantidade, item1.precoUnitario, subtotal);
        
        // Aplicando o desconto percentual
        subtotal = item1.calcularSubtotalComDesconto(0.10);
        subtotal2 = item2.calcularSubtotalComDesconto(0.25);
        double totalCompraDesconto = subtotal + subtotal2;

        System.out.println("Aplicando os descontos: ");
        mostrarInfo(item1.descricao, item1.quantidade, item1.precoUnitario, subtotal);
        mostrarInfo(item2.descricao, item2.quantidade, item2.precoUnitario, subtotal2);

        System.out.println("Total da compra realizada: R$" + totalCompraDesconto);
        System.out.print("Desconto da compra: R$" + (totalCompra - totalCompraDesconto));
    }
}

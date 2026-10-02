
public class Main {
    
    public static void main(String[] args) {
        Produto teclado = new Produto("Teclado", 150.0);
        Produto mouse = new Produto("Mouse", 80.0);

        Pedido pedido = new Pedido();
        pedido.adicionarItem(teclado, 2);
        pedido.adicionarItem(mouse, 1);

        System.out.println(pedido.calcularTotal());
        
        pedido.alterarQuantidade(teclado, 3);
        System.out.println(pedido.calcularTotal());
        pedido.alterarQuantidade(mouse, 0);
        System.out.println(pedido.calcularTotal());
        pedido.alterarQuantidade(teclado, -1);
        System.out.println(pedido.calcularTotal());

        Pedido fechado = new Pedido();
        fechado.adicionarItem(teclado, 2);
        fechado.adicionarItem(mouse, 1);
        fechado.fechar();

        fechado.removerItem(mouse);
        fechado.alterarQuantidade(teclado, 3);
        fechado.adicionarItem(mouse, 2);

        System.out.println(fechado.calcularTotal());
    }
}


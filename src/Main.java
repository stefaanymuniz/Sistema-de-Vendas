
public class Main {
    
    public static void main(String[] args) {

        Produto teclado = new Produto("Teclado", 150.0);
        Produto mouse = new Produto("Mouse", 80.0);

        Pedido pedido = new Pedido();
        pedido.adicionarItem(teclado, 2);
        pedido.adicionarItem(mouse, 1);

        System.out.println("Total: " + pedido.calcularTotal());
        
        Pedido pedido2 = new Pedido();
        pedido2.adicionarItem(teclado, 1);
        
        System.out.println("Total: " + pedido2.calcularTotal());
    }
}


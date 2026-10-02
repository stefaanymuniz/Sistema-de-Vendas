
public class Main {
    
    public static void main(String[] args) {

        Produto teclado = new Produto("Teclado", 150.0);
        Produto mouse = new Produto("Mouse", 80.0);

        ItemPedido itemTeclado = new ItemPedido(teclado, 2);
        ItemPedido itemMouse = new ItemPedido(mouse, 1);

        Pedido pedido = new Pedido();
        pedido.adicionarItem(itemTeclado);
        pedido.adicionarItem(itemMouse);

        System.out.println("Subtotal Teclado: " + itemTeclado.calcularSubtotal());
        System.out.println("Subtotal Mouse: " + itemMouse.calcularSubtotal());
        System.out.println("Total: " + pedido.calcularTotal());
        System.out.println(new Pedido().calcularTotal());
    }
}


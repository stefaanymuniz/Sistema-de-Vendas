
public class Main {

    static void mostrarInfo(String descricao, int quantidade, double precoUnitario, double subtotal) {
        System.out.println("Produto: " + descricao);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: " + precoUnitario);
        System.out.println("Subtotal: " + subtotal + "\n");
    }
    
    public static void main(String[] args) {

        Produto teclado = new Produto("Teclado", 150.0);
        
        ItemPedido itemPrincipal = new ItemPedido(teclado, 2);
        ItemPedido itemObservado = itemPrincipal;
        ItemPedido itemIndependente = new ItemPedido(teclado, 1);
        
        System.out.println("Subtotal itemPrincipal: " + itemPrincipal.calcularSubtotal());
        System.out.println("Subtotal itemIndependente: " + itemIndependente.calcularSubtotal());
        System.out.println(itemPrincipal == itemObservado); // true -> referenciam o msm objeto
        System.out.println(itemPrincipal == itemIndependente); //false
        System.out.println(teclado == itemPrincipal.getProduto()); // true -> referenciam o mesmo endereço de memória
        System.out.println(itemPrincipal.getProduto() == itemIndependente.getProduto()); // true -> a variável "produto" de ambos referenciam o mesmo espaço na memória reservado pela classe Produto
        
        Produto outroTeclado = new Produto("Teclado", 150.0);
        ItemPedido itemOutroProduto = new ItemPedido(outroTeclado, 2);

        System.out.println(teclado == outroTeclado);
        System.out.println(itemPrincipal.getProduto() == itemOutroProduto.getProduto()); // false -> são objetos diferentes criados pela classe Produto
        System.out.println(itemOutroProduto.calcularSubtotal());

        // Desafio
        Produto mouse = new Produto("Mouse", 80.0);
        ItemPedido item1 = new ItemPedido(mouse, 1);
        ItemPedido item2 = new ItemPedido(mouse, 3);

        System.out.println("----- Desafio -----");
        System.out.println(item1.getProduto() == item2.getProduto()); // true
        System.out.println(item1.calcularSubtotal());
        System.out.println(item2.calcularSubtotal());

    }
}


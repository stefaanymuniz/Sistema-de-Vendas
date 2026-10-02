
public class Main {

    static void mostrarInfo(String descricao, int quantidade, double precoUnitario, double subtotal) {
        System.out.println("Produto: " + descricao);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: " + precoUnitario);
        System.out.println("Subtotal: " + subtotal + "\n");
    }
    
    public static void main(String[] args) {

        // Incremento A
        ItemPedido itemPrincipal = new ItemPedido();
        itemPrincipal.descricao = "Teclado";
        itemPrincipal.precoUnitario = 150.0;
        itemPrincipal.quantidade = 2;
        double subtotal = itemPrincipal.calcularSubtotal();
        
        mostrarInfo(itemPrincipal.descricao, itemPrincipal.quantidade, itemPrincipal.precoUnitario, subtotal);
        
        // Incremento B
        ItemPedido itemObservado = itemPrincipal;
        double subtotal2 = itemObservado.calcularSubtotal();
        System.out.println(itemObservado == itemPrincipal);
        
        // Incremento C
        itemObservado.aumentarQuantidade(3);
        System.out.println(itemPrincipal.quantidade);
        System.out.println(itemObservado.quantidade);
        // atualizando os subtotais
        subtotal = itemPrincipal.calcularSubtotal();
        subtotal2 = itemObservado.calcularSubtotal();
        
        // Incremento E
        ItemPedido itemIndependente = new ItemPedido();
        itemIndependente.descricao = "Teclado";
        itemIndependente.precoUnitario = 150.0;
        itemIndependente.quantidade = 5;
        double subtotal3 = itemIndependente.calcularSubtotal();

        System.out.println(itemObservado == itemPrincipal); // true -> referenciam o msm objeto
        System.out.println(itemPrincipal == itemIndependente); // false -> referenciam objetos diferentes

        /* "por que estado equivalente não torna itemIndependente o mesmo objeto que itemPrincipal" -> pois cada objeto possui sua identidade, o que os diferenciam uns dos outros */
        

        // Incremento F
        itemIndependente.aumentarQuantidade(2);
        subtotal3 = itemIndependente.calcularSubtotal();
        System.out.println("Exibir as três quantidades e os três subtotais:");
        System.out.println(itemPrincipal.quantidade + " " + subtotal);
        System.out.println(itemObservado.quantidade + " " + subtotal2);
        System.out.println(itemIndependente.quantidade + " " + subtotal3);
    }
}

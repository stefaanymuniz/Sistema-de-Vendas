
public class Main {

    static void mostrarInfo(String descricao, int quantidade, double precoUnitario, double subtotal) {
        System.out.println("Produto: " + descricao);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: " + precoUnitario);
        System.out.println("Subtotal: " + subtotal + "\n");
    }
    
    public static void main(String[] args) {

        ItemPedido itemPrincipal = new ItemPedido();
        itemPrincipal.descricao = "Teclado";
        itemPrincipal.precoUnitario = 150.0;
        itemPrincipal.aumentarQuantidade(5); // escrita
        
        ItemPedido itemObservado = itemPrincipal;
        
        System.out.println(itemObservado == itemPrincipal); // true -> referenciam o msm objeto
        
        System.out.println("Quantidade do principal: " + itemPrincipal.getQuantidade());
        System.out.println("Quantidade do observado: " + itemObservado.getQuantidade() + "\n");
        
        System.out.println("Preço unitário principal: " + itemPrincipal.precoUnitario);
        System.out.println("Preço unitário observado: " + itemObservado.precoUnitario + "\n");
        
        System.out.println("Subtotal principal: " + itemPrincipal.calcularSubtotal());
        System.out.println("Subtotal observado: " + itemObservado.calcularSubtotal() + "\n");
        
        itemObservado.aumentarQuantidade(-10);
        
        
        System.out.println("Quantidade do principal: " + itemPrincipal.getQuantidade());
        System.out.println("Quantidade do observado: " + itemObservado.getQuantidade());
        System.out.println("Subtotal principal: " + itemPrincipal.calcularSubtotal());
        System.out.println("Subtotal observado: " + itemObservado.calcularSubtotal() + "\n");
        
        itemObservado.aumentarQuantidade(2);
        
        System.out.println("Quantidade do principal: " + itemPrincipal.getQuantidade());
        System.out.println("Quantidade do observado: " + itemObservado.getQuantidade());
        System.out.println("Subtotal principal: " + itemPrincipal.calcularSubtotal());
        System.out.println("Subtotal observado: " + itemObservado.calcularSubtotal() + "\n");
        
        System.out.println(itemObservado == itemPrincipal); 
        
        ItemPedido itemIndependente = new ItemPedido();
        itemIndependente.aumentarQuantidade(5);
        
        System.out.println("Quantidade do principal: " + itemPrincipal.getQuantidade());
        System.out.println("Quantidade do independente: " + itemIndependente.getQuantidade());
        System.out.println(itemPrincipal == itemIndependente);
        
        // Desafio: reduzindo a quantidade
        itemIndependente.reduzirQuantidade(2);
        System.out.println("Quant. do independente após redução: " + itemIndependente.getQuantidade());
    }
}


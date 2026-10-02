
public class ItemPedido {

    private String descricao;
    private double precoUnitario;
    private int quantidade;

    // Incremento A - Construtor
    public ItemPedido(String descricao,
                      double precoUnitario, 
                      int quantidade) {
                        
        this.descricao = descricao;

        if (precoUnitario >= 0) {
            this.precoUnitario = precoUnitario;
        }

        if (quantidade >= 0) {
            this.quantidade = quantidade;
        }
    }
    
    public String getDescricao() {
        return descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    double calcularSubtotal() {
        return precoUnitario * quantidade;
    }

    double calcularSubtotalComDesconto(double percentual) {
        return calcularSubtotal() * (1 - percentual);
    }

    void aumentarQuantidade(int unidades) {
        if (unidades > 0) {
            quantidade += unidades;
        }
    }
    
    public void reduzirQuantidade(int unidades) {
        if (unidades > 0 && unidades <= quantidade) {
            quantidade -= unidades;
        }
    }
    

}

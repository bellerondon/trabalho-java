public class Pedido {
    String sabor;
    String tamanho;
    float valor;
    String endereco;
    int numero;

    public Pedido(String sabor, String tamanho, float valor, String endereco, int numero){
        this.sabor=sabor;
        this.tamanho=tamanho;
        this.valor=valor;
        this.endereco=endereco;
        this.numero=numero;
    }

    @Override
    public String toString() {
        return "Pedido: [Sabor: " + this.sabor + ", Tamanho: " + this.tamanho + ", Preço: " + this.valor + ", Endereço: " + this.endereco +", ID pedido: "+ this.numero+ "]";
    }

    public float getValor() {
        return this.valor;
  }

    // public void printar(){
    //         System.out.println("-----PEDIDOS-----");
    //         System.out.println("ID pedido :"+numero);
    //         System.out.println("Sabor :"+sabor);
    //         System.out.println("Tamanho:"+tamanho);
    //         System.out.println("Valor pago :"+valor);
    //         System.out.println("Endereço :"+endereco);
    // }
}

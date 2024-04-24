public class Pizza {
    String sabor;
    String ingredientes;
    float preco;
   

    public Pizza(String sabor, String ingredientes, float preco){
        this.sabor=sabor;
        this.ingredientes=ingredientes;
        this.preco=preco;
    }

    @Override

    public String toString(){
        return "Pedido: [Sabor: " + this.sabor + ", Ingredientes: " + this.ingredientes + ", Preço: "+"]";
    }
}

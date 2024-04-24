public class Produto {
    String  Item;
    int codigo;
    int quantidade;
    float preco;

    public Produto(String Item, int codigo, int quantidade, float preco){
        this.Item=Item;
        this.codigo=codigo;
        this.quantidade=quantidade;
        this.preco=preco;
    }


    public void setQuantidade(int quantidade){
        this.quantidade=quantidade;

    }
    public void setPreco(float preco){
        this.preco=preco;

    }

    public int getQuantidada(){
        return quantidade;
    }
    public float getPreco(){
        return preco;
    }
    public String getItem(){
        return Item;
    }
    public int getCodigo(){
        return codigo;
    }

    public float getTotal(){
        return preco+=preco;
    }

    
}

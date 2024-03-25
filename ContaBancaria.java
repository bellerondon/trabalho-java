public class ContaBancaria {
    private int numeroc;
    private String nometitular;
    private float saldo;
    float add;
    float sub;
    float total;

    public void setNumeroc(int numeroconta){
     this.numeroc = numeroc;
        }
    public void setNometitular(String nometitular){
     this.nometitular = nometitular;
      }
    public void setSaldo(float saldo){
     this.saldo = saldo;
   
    }
    
    public String getNometitular(){
        return this.nometitular;
    }

    public void depositar(float add){
        saldo += add;
        System.out.println("você adicionou :$"+add);
        
    }
    public void sacar(float sub){
        saldo -= sub;
        System.out.println("você tirou :$"+add);
    
    }

    public void getsaldototal(){
        System.out.println("saldo atual : "+saldo);
      
    }
    

    
}

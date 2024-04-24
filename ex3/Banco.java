import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();
        ContaBancaria conta3 = new ContaBancaria();
        ContaBancaria mais = new ContaBancaria();
        
        conta1.setNometitular("Edilman Guimarães");
        conta2.setNometitular("Fanio Guimarães");
        conta3.setNometitular("Izabelle Guimarães");

        conta1.setNumeroc(123);
        conta2.setNumeroc(456);
        conta3.setNumeroc(789);

        conta1.setSaldo(1000);
        conta2.setSaldo(2000);
        conta3.setSaldo(3000);

        System.out.println("------Banco da Belle-----");
        System.out.println("digite o numero da conta: ");
        int n = Integer.parseInt(dados.nextLine());

        do {

         

            if (n == 123){
             System.out.println("conta da "+ conta1.getNometitular());
             System.out.println("1-depositar "+"2-sacar "+ "3-saldo atual "+"0-sair");
             int a = Integer.parseInt(dados.nextLine());
             
             switch (a) {
                case 1:
                System.out.print("quanto deseja depositar : ");
                conta1.add = Float.parseFloat(dados.nextLine());
                conta1.depositar(conta1.add);
                break;
                
                case 2:
                System.out.print("quanto deseja sacar : ");
                conta1.sub = Float.parseFloat(dados.nextLine());
                conta1.depositar(conta1.sub);   
                break;
                
                case 3:
                    conta1.getsaldototal();
                    break;
                case 0 :  
                System.out.println("tchauu");
                return;
             
                default:
                    break;
             }

            }

            if (n == 456){
                System.out.println("conta da"+ conta2.getNometitular());
                System.out.println("1-depositar "+"2-sacar "+ "3-saldo atual "+"0-sair");
                int a = Integer.parseInt(dados.nextLine());
                
                switch (a) {
                   case 1:
                   System.out.print("quanto deseja depositar : ");
                   conta1.add = Float.parseFloat(dados.nextLine());
                   conta1.depositar(conta1.add);
                   break;
                   
                   case 2:
                   System.out.print("quanto deseja sacar : ");
                   conta1.sub = Float.parseFloat(dados.nextLine());
                   conta1.depositar(conta1.sub);   
                   break;
                   
                   case 3:
                       conta1.getsaldototal();
                       break;
                   
                   case 0 :  
                       System.out.println("tchauu");
                       return;   
                    default:
                        System.out.println("não existe essa");
                       break;
                }   

                
            }
             if (n == 789){
                System.out.println("conta da"+conta3.getNometitular());
                System.out.println("1-depositar "+"2-sacar "+ "3-saldo atual "+"0-sair");
                int a = Integer.parseInt(dados.nextLine());
                
                switch (a) {
                   case 1:
                   System.out.print("quanto deseja depositar : ");
                   conta1.add = Float.parseFloat(dados.nextLine());
                   conta1.depositar(conta1.add);
                   break;
                   
                   case 2:
                   System.out.print("quanto deseja sacar : ");
                   conta1.sub = Float.parseFloat(dados.nextLine());
                   conta1.depositar(conta1.sub);   
                   break;
                   
                   case 3:
                    conta1.getsaldototal();
                    break;
                   
                   case 0 :  
                   System.out.println("tchauu");
                   return;                
                   
                   default:
                   System.out.println("não existe essa opção");
                   break;
                }
                
           }

        } while(n!=0);

        dados.close();
    }
}

import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        Carro carro1 = new Carro("Fiat", "UNO", 2020, "BET245");
        int n;

       do{ 

        System.out.println("-1 Informações do caro -2 acelerar 50km/h -3 frear 20km/h -4 informação atual do carro -0 sair");
        n = Integer.parseInt(dados.nextLine());
        switch (n) {
            case 1:
            System.out.println("Informações do carro:");
            carro1.exibirInformacoes();
    
            break;
            case 2:
            System.out.println("\nAcelerando o carro...");
            carro1.acelerar(50);
            break;
            case 3:
            System.out.println("\nFreando o carro...");
            carro1.frear(20);
            break;
            case 4:
            System.out.println("\nInformações atualizadas do carro:");
            carro1.exibirInformacoes();
            case 0:
                System.out.println("desligando o carro vrum vrum...");
            break;
            
            default:
                break;
        }
        

    

       }while(n!=0);

       dados.close();
    }
}

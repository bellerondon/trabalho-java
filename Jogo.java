import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Jogador play1 = new Jogador("Fabio", 40.6f, 3);
        Jogador play2 = new Jogador("Rogerinhogameplays", 40.6f, 1000);
        Jogador play3 = new Jogador("tanio", 40.6f, 3);
        
        
        Scanner  dados = new Scanner (System.in);
        int n;

        System.out.print("quem deseja entrar:(1-Fabio - 2-Rogerinhogameplays - 3-tanio) :");
        n = Integer.parseInt(dados.nextLine());
        
     do{ 
            if (n == 1){
                System.out.println("conta da "+ play1.nome);
                System.out.println("1-dados do jogador  2-nova pontuação  3-novo nivel 0-sair");
                int a = Integer.parseInt(dados.nextLine());
                
                switch (a) {
                   case 1:
                   play1.print();
                   break;
                   
                   case 2:
                   System.out.print("digite a nova pontuação: ");
                   play1.ad = Float.parseFloat(dados.nextLine());
                   play1.NovaPontucao();
                   break;
                   
                   case 3:
                   System.out.print("digite o novo nivel: ");
                   play1.add = Integer.parseInt(dados.nextLine());
                   play1.NovoNivel();
                       break;
                   case 0 :  
                   System.out.println("tchauu");
                   return;
                
                   default:
                   System.out.println("não existe esse dai não");
                       break;
                }
   
               }
   
               if (n==2){
                System.out.println("conta da "+ play2.nome);
                System.out.println("1-dados do jogador  2-nova pontuação  3-novo nivel 0-sair");
                int a = Integer.parseInt(dados.nextLine());
                
                switch (a) {
                   case 1:
                   play2.print();
                   break;
                   
                   case 2:
                   System.out.print("digite a nova pontuação: ");
                   play2.ad = Float.parseFloat(dados.nextLine());
                   play2.NovaPontucao();
                   break;
                   
                   case 3:
                   System.out.print("digite o novo nivel: ");
                   play2.add = Integer.parseInt(dados.nextLine());
                   play2.NovoNivel();
                       break;
                   case 0 :  
                   System.out.println("tchauu");
                   return;
                
                   default:
                   System.out.println("não existe esse dai não");
                       break;
                }
   
               }
                if (n == 3){
                    System.out.println("conta da "+ play3.nome);
                    System.out.println("1-dados do jogador  2-nova pontuação  3-novo nivel 0-sair");
                    int a = Integer.parseInt(dados.nextLine());
                    
                    switch (a) {
                       case 1:
                       play3.print();
                       break;
                       
                       case 2:
                       System.out.print("digite a nova pontuação: ");
                       play3.ad = Float.parseFloat(dados.nextLine());
                       play3.NovaPontucao();
                       break;
                       
                       case 3:
                       System.out.print("digite o novo nivel: ");
                       play3.add = Integer.parseInt(dados.nextLine());
                       play3.NovoNivel();
                           break;
                       case 0 :  
                       System.out.println("tchauu");
                       return;
                    
                       default:
                       System.out.println("não existe esse dai não");
                           break;
                    }
       
              }   
            }while (n!=0); 
                
              
    }
}

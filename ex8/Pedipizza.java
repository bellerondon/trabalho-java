import java.util.Scanner;
import java.util.ArrayList;

public class Pedipizza {
    public static void main(String[] args) {
        
        Scanner dados = new Scanner(System.in);
       
        ArrayList<Pedido>entrega = new ArrayList<>();
        entrega.add(new Pedido("Quatro queijos", "grande", 15.50f, "agua verde", 0));

        ArrayList<Pizza> pizzas = new ArrayList<>();
        pizzas.add(new Pizza("Queijo", "grande", 17.5f));
        pizzas.add(new Pizza("Calabresa", "Mussarela, calabresa, cebola", 12.50f));
        pizzas.add(new Pizza("Frango com Catupiri", "Mussarela, frango, catupiri", 16.70f));
        
        int n;
        do{
            System.out.print("1-Cardapio pizza|2-adicionar novo sabor de pizza| 3-novo pedido| 4-cancelar pedido| 5-relatorio completo| 0-Sair");
            n = Integer.parseInt(dados.nextLine());
            
            switch (n) {
                case 1:
                for (Pizza pizza : pizzas) {
                    System.out.println("-" + pizza.toString());
                }
                break;
                case 2:
                System.out.print("Digite o nome do novo sabor da pizzaria :");
                String novosabor = dados.nextLine();    
                System.out.print("\nDigite os ingredientes dessa nova pizza :");
                String novoingrediente = dados.nextLine();  
                System.out.print("digite o preço dessa nova pizza:");
                float novopreco = Float.parseFloat(dados.nextLine());
                
                pizzas.add(new Pizza(novosabor, novoingrediente, novopreco));
                System.out.println("Novo sabor de pizza adicionado com sucesso!");
                break;
                case 3:
                System.out.print("Digite o numero do pedido (lembrando que vai de 1 em 1):");
                int idpedido=Integer.parseInt(dados.nextLine());
                System.out.print("Digite o nome do sabor escolido:");
                String pedidosabor = dados.nextLine();    
                System.out.print("\nDigite o tamanho da pizza(Broto, Media, Grande) :");
                String pedidotamanho = dados.nextLine();  
                System.out.print("digite o preço pago pelo cliente:");
                float pedidopreco = Float.parseFloat(dados.nextLine());
                System.out.print("\nDigite o endereco de entrega:");
                String pedidoendereco = dados.nextLine();
               
                entrega.add(new Pedido(pedidosabor, pedidotamanho, pedidopreco, pedidoendereco, idpedido));
                System.out.println("Novo sabor de pizza adicionado com sucesso!");
                break;
                case 4:
                for(int i = 0; i < entrega.size(); i ++){
                    System.out.println(". " + entrega.get(i).toString());
                }
                System.out.println("Digite o ID do cliente que cancelou o pedido: ");
                int idC = Integer.parseInt(dados.nextLine());
                
                if(idC > 0 && idC <= entrega.size()){
                    entrega.remove(idC - 1);
                    System.out.println("Pedido cancelado com sucesso");
                }
                else{
                    System.out.println("erro ao cancelar o pedido");
                }

                break;
                case 5:
                System.out.println("-----Relatorio completo-----");
                    System.out.println("-----PEDIDO-----");
                    int cont = 0; 
                    for (Pedido pedido : entrega) {
                        System.out.println("*" + pedido.toString());
                        cont++;
                    }
                    System.out.println("----NUMERO TOTAL DE PEDIDOS----");
                    System.out.println("total: " + cont);
                    
                    
                    float soma = 0;
                    for (Pedido pedido : entrega) {
                        soma += pedido.getValor();
                    }
                    System.out.println("Valor total dos pedidos: " + soma);
                    
                    System.out.println("----------------");
                    System.out.println("-----PIZZA-----");
                    for (Pizza pizza : pizzas) {
                        System.out.println("-" + pizza.toString());
                    }
                    System.out.println("----------------");
               
                break;
                case 0:
                System.out.println("tchauuuu");
                break;
                
                default:
                    break;
            }



        }while(n!=0);
       

        dados.close();
    }
}

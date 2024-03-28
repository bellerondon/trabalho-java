import java.util.Scanner;
import java.util.ArrayList;
public class ProdutoMain {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        
        ArrayList<Produto>mercado = new ArrayList<>();
        mercado.add(new Produto("bala 7 belo", 12, 2, 17.5f));
        mercado.add(new Produto("fini", 34, 2, 17.5f));
        mercado.add(new Produto("macarrao", 56, 2, 17.5f));

        int n;

        do {
            System.out.println("1-Adicionar novo produto|\n2-Atualizar informação (Quantidade e preço)|\n3-tirar produto do estoque|\n4-relatorio|\n0-sair");
            n = Integer.parseInt(dados.nextLine());

            switch (n) {
                case 1:
                    System.out.println("-----ADICIONAR------");
                    System.out.print("qual o nome do novo item :");
                    String novoNome = dados.nextLine();
                    System.out.print("qual o codígo do novo item :");
                    int novoCodigo = Integer.parseInt(dados.nextLine());
                    System.out.print("quanttidade de item dispinivel:");
                    int novaQuantidade = Integer.parseInt(dados.nextLine());
                    System.out.print("qual o preço do novo item :");
                    float novoValor = Float.parseFloat(dados.nextLine());

                    mercado.add(new Produto(novoNome, novoCodigo, novaQuantidade, novoValor));
                    System.out.println("novo item adicionado !");
                    System.out.println("-------------------");
                break;   
                case 2:    
                    System.out.println("----ATUALIZAR-----");
                    for(int i = 0; i < mercado.size(); i++){
                    System.out.println("*"+ i +": "+mercado.get(i).getItem());
                }
            
                    System.out.print("Digite o numero do produto que deseja atualizar:");
                    int c = Integer.parseInt(dados.nextLine());
                
                    System.out.print("Você deseja atualizar o preço ou a quantidade do estoque?\n1 - Estoque\n2 - Preço:");
                    int e = Integer.parseInt(dados.nextLine());
            
                    if (e == 1) { 
                        System.out.print("Atualizar quantidade do produto:");
                        int atualizarQ = Integer.parseInt(dados.nextLine());
            
                        Produto troca = mercado.get(c); 
                        troca.setQuantidade(atualizarQ);
                    } else if (e == 2) {
                         System.out.print("Atualizar o preço:");
                         float atualizarV = Float.parseFloat(dados.nextLine());
            
                        Produto troca = mercado.get(c); 
                        troca.setPreco(atualizarV);
                        System.out.println("-------------------");
                }
                    
                break;
                case 3:
                System.out.println("----TIRAR PRODUTO-----");
                for(int i = 0; i < mercado.size(); i++){
                    System.out.println("*"+ i +": "+mercado.get(i).getItem());
                }
            
                    System.out.print("Digite o numero do produto que deseja atualizar:");
                    int d = Integer.parseInt(dados.nextLine());

                    mercado.remove(d);

                    System.out.println("item removido com sucesso ");
                    System.out.println("-------------------");
                break;
                case 4:
                    System.out.println("-----RELATORIO-----");
                    for(int i = 0; i < mercado.size(); i++){
                        System.out.println(i+"* Produtos dísponives :"+mercado.get(i).getItem()+"\nQuantidade em estoque : "+mercado.get(i).getQuantidada()+"\nValor total em estoque: "+mercado.get(i).getTotal());
                    }
                    System.out.println("-------------------");
                break;
                case 0:
                    System.out.println("tchauu!!!!");
                break;    
            
                default:
                 System.out.println("não existe essa opção");
                    break;
            }
        
        
        } while (n!=0);


    }
}

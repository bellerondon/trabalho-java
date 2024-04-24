
import java.util.Scanner;
//prof, nessa questão eu tentei achar novas maneiras de armazenar os pedidos e não fazer como eu estsva fazendo cheio de swith
//eu pesquisei como fazia, por isso ta cheio de anotação, para eu não me perder na hora de estudar(bom que eu ja vejo a minha evolução)
//vou tentar corrigir os outros codigos a tempo mas acho que não vai dar
public class Contato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Agenda[] numeros = {
            new Agenda("Izabelle", "(41)991334530"),
            new Agenda("edilman", "(41)996487789")
        };
              
         System.out.println("Contatos existentes:");
         for(int i = 0; i < numeros.length; i++ ){
            numeros[i].printar();
         }
         // Pedir ao usuário para adicionar mais contatos
        System.out.print("\nDeseja adicionar mais contatos? (S/N)");
        String resposta = scanner.nextLine();
        
        while (resposta != "S") {
            System.out.println("Digite o nome do contato:");
            String nome = scanner.nextLine();
            System.out.println("Digite o número do contato:");
            String numero = scanner.nextLine();
            
            // Criar um novo objeto Agenda com os dados fornecidos pelo usuário
            Agenda novoContato = new Agenda(nome, numero);
            
            // Adicionar o novo contato ao array
            Agenda[] novosNumeros = new Agenda[numeros.length + 1];
            for (int i = 0; i < numeros.length; i++) {
                novosNumeros[i] = numeros[i];
            }
            novosNumeros[numeros.length] = novoContato;
            numeros = novosNumeros;
            
            // Mostrar os contatos atualizados
            System.out.println("\nContatos atualizados:");
            for(int i = 0; i < numeros.length; i++ ){
                numeros[i].printar();
             }
            
            // Perguntar se o usuário deseja adicionar mais contatos
            System.out.println("\nDeseja adicionar mais contatos? (S/N)");
            resposta = scanner.nextLine();
        }
        
        System.out.println("Programa encerrado.");
        scanner.close();
    }
}


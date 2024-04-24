public class Livro {
    String a_nome;
    String a_titulo;
    String a_ano;

    Livro(String nome, String titulo, String ano){
     a_titulo = titulo;
     a_nome = nome;
     a_ano = ano;

    }

  void mostrar(){
    System.out.println("-------lista de livros-------");
    System.out.println("livros favoritos : "+ a_titulo +"/"+ a_nome +"/"+ a_ano);
   }
}
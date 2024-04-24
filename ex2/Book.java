import java.util.ArrayList;
import java.util.List;

public class Book {
    public static void main(String[] args) {
        // Criação e inicialização dos Livros
        Livro book1 = new Livro("diario de um banana", "jeff kenny", "2007");
        Livro book2 = new Livro("diario de um banana", "jeff kenny", "2008");
        Livro book3 = new Livro("diario de um banana", "jeff kenny", "2009");
        Livro book4 = new Livro("diario de um banana", "jeff kenny", "2010");

        
        List<Livro> biblioteca = new ArrayList<>();

        biblioteca.add(book1);
        biblioteca.add(book2);
        biblioteca.add(book3);
        biblioteca.add(book4);

        for (int i = 0; i < 4; i++) {
            biblioteca.get(i).mostrar();
        }
    }
}

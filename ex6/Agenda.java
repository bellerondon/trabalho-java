public class Agenda {
    String nome;
    String telefone;

    public Agenda(String nome, String telefone){
        this.telefone = telefone;
        this.nome = nome;
    }

    public void printar(){
        System.out.println("Nome: "+nome+" Telefone : "+telefone);
    }

}

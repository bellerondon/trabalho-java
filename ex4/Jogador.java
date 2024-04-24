public class Jogador {
    String nome;
    float pontuacao;
    float ad;
    int nivel;
    int add;

     public Jogador (String nome,Float pontuacao, int nivel){
        this.nome=nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;

    }

    public void print(){
        System.out.println("dados do jogador"+nome+ "\npontuação"+pontuacao +"\nnivel "+nivel);
    }
    public void NovaPontucao(){
        pontuacao = ad;
        System.out.println("pontuação alterada \n");
    }
    public void NovoNivel(){
        nivel = add;
        System.out.println("subiu de nivel!!!:) \n");
    }

}

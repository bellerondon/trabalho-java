public class Carro {
    
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int velocidadeAtual;

   
    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0; 
    }

    
    public void acelerar(int velocidade) {
        if (velocidade >= 0) { 
            this.velocidadeAtual += velocidade; 
            System.out.println("O motorista pode correrrr... Nova velocidade: " + this.velocidadeAtual + " km/h");
        } else {
            System.out.println("Nem saiu do lugar ainda kk.");
        }
    }


    public void frear(int velocidade) {
        if (velocidade >= 0 && velocidade <= this.velocidadeAtual) { 
            this.velocidadeAtual -= velocidade; 
            System.out.println("Motorista olha o poste. Nova velocidade: " + this.velocidadeAtual + " km/h");
        } else {
            System.out.println("nem saiu do lugar ainda kk.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Placa: " + this.placa);
        System.out.println("Velocidade Atual: " + this.velocidadeAtual + " km/h");
    }
}

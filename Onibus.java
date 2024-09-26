import java.util.Scanner;


public class Onibus {
  
    private int numero_Onibus;
    private int quantidadePassageiros;
    private int assentos;


    public int getNumero_Onibus() {
        return numero_Onibus;
    }
    public void setNumero_Onibus(int numero_Onibus) {
        this.numero_Onibus = numero_Onibus;
    }
    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }
    public void setQuantidadePassageiros(int quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
    }
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;  
    }
    public void exibirInformacoes() {
        System.out.println("Número do Ônibus é:" +getNumero_Onibus()+"Quantidade de Passageiros:"+getQuantidadePassageiros()+"\nQuantidade de Assentos desse Ônibus é:"+getAssentos());
    }
}

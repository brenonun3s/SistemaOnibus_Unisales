public class Passagem {
    private String origem;
    private String destino;
    private String dataViagem;
    private double preco;
    private int numeroAssento;


    public Passagem() {
    }

    public Passagem(String origem, String destino, double preco, String dataViagem, int numeroAssento) {
        this.origem = origem;
        this.destino = destino;
        this.preco = preco;
        this.dataViagem = dataViagem;
        this.numeroAssento = numeroAssento;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDataViagem() {
        return dataViagem;
    }

    public void setDataViagem(String dataViagem) {
        this.dataViagem = dataViagem;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getNumeroAssento() {
        return numeroAssento;
    }

    public void setNumeroAssento(int numeroAssento) {
        this.numeroAssento = numeroAssento;
    }

    public void exibirDetalhes(){
        System.out.println("Passagem de: " + origem);
        System.out.println("Destino: " + destino);
        System.out.println("Data da Viagem: " + dataViagem);
        System.out.println("Preço R$" + preco);
        System.out.println("Número do assento: " + numeroAssento);
    }
}
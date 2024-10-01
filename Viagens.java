import java.util.Date;


public class Viagens {

    private String numeroOnibus;
    private String origem;
    private String destino;
    private Date dataSaida;
    private Date dataChegada;
    private int numeroAssento;

    

    public Viagens(String numeroOnibus, String origem, String destino, Date dataSaida, Date dataChegada, int numeroAssento) {
        this.numeroOnibus = numeroOnibus;
        this.origem = origem;
        this.destino = destino;
        this.dataSaida = dataSaida;
        this.dataChegada = dataChegada;
        this.numeroAssento = numeroAssento;
    }

    public String getNumeroOnibus() {
        if (numeroOnibus.length() != 4) {
            System.out.println("Número Incorreto");
        }
        return numeroOnibus;
    }

    public String setNumeroOnibus(String numeroOnibus) {
        this.numeroOnibus = numeroOnibus;
        if (numeroOnibus.length() != 4) {
            System.out.println("Número Incorreto");
        }
        return numeroOnibus;
    }

    public void exibirInformacoes() {
        System.out.println("Olá Caro Passageiro! Segue dados da sua viagem:");
        System.out.println("Placa: " + getNumeroOnibus());
        System.out.println("Seu assento é: " + getNumeroAssento());
        System.out.println("Você sairá de: " + getOrigem() + " e seu destino é: " + getDestino());
        System.out.println("Seu horário de saída é: " + getdataSaida() + "\nE seu horário de chegada estimado é: " + getdataChegada());
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

    public Date getdataSaida() {
        return dataSaida;
    }

    public void setdataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Date getdataChegada() {
        return dataChegada;
    }

    public void setdataChegada(Date dataChegada) {
        this.dataChegada = dataChegada;
    }

    public int getNumeroAssento() {
        return numeroAssento;
    }

    public void setNumeroAssento(int numeroAssento) {
        this.numeroAssento = numeroAssento;
    }
}

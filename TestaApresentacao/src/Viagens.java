public class Viagens {
    // importar os atributos nome e id da classe UsuarioPassageiros para identificar com facilidade os passageiros da viagem
    private String numeroOnibus;
    private String origem;
    private String destino;
    private String dataSaida;
    private String dataChegada;
    private int numeroAssento;

    public Viagens(String numeroOnibus, String origem, String destino, String dataSaida, String dataChegada, int numeroAssento) {
        this.numeroOnibus = numeroOnibus;
        this.origem = origem;
        this.destino = destino;
        this.dataSaida = dataSaida;
        this.dataChegada = dataChegada;
        this.numeroAssento = numeroAssento;
    }

    public String getNumeroOnibus() {
        return numeroOnibus;
    }

    public void setNumeroOnibus(String numeroOnibus) {
        if (numeroOnibus.length() != 4) {
            throw new IllegalArgumentException("Número Incorreto");
        }
        this.numeroOnibus = numeroOnibus;
    }

    public void exibirInformacoes() {
        System.out.println("Olá Caro Passageiro! Segue dados da sua viagem:");
        System.out.println("Placa: " + getNumeroOnibus());
        System.out.println("Seu assento é: " + getNumeroAssento());
        System.out.println("Você sairá de: " + getOrigem() + " e seu destino é: " + getDestino());
        System.out.println("Seu horário de saída é: " + getDataSaida() + "\nE seu horário de chegada estimado é: " + getDataChegada());
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

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(String dataChegada) {
        this.dataChegada = dataChegada;
    }

    public int getNumeroAssento() {
        return numeroAssento;
    }

    public void setNumeroAssento(int numeroAssento) {
        this.numeroAssento = numeroAssento;
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Onibus {

    private int numeroOnibus;
    private List<Integer> quantidadePassageiros = new ArrayList<>(40);
    private List<Boolean> assentos = new ArrayList<>(40);
    private String placaOnibus;
    private int assentoEscolhido;
    private List<String> passageiros = new ArrayList<>();

    public Onibus() {
        for (int i = 0; i < 40; i++) {
            assentos.add(false);
            quantidadePassageiros.add(0);
        }
    }

    public int getNumeroOnibus() {
        return numeroOnibus;
    }

    public void setNumeroOnibus(int numeroOnibus) {
        this.numeroOnibus = numeroOnibus;
    }

    public List<Integer> getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    public void setQuantidadePassageiros(List<Integer> quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public String getPlacaOnibus() {
        return placaOnibus;
    }

    public void setPlacaOnibus(String placaOnibus) {
        this.placaOnibus = placaOnibus;
    }

    public List<Boolean> getAssentos() {
        return assentos;
    }

    public void setAssentos(List<Boolean> assentos) {
        this.assentos = assentos;
    }

    public int getAssentoEscolhido() {
        return assentoEscolhido;
    }

    public void escolherAssento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, digite o número do assento (1-40): ");
        int assentoEscolhido = scanner.nextInt();

        if (assentoEscolhido < 1 || assentoEscolhido > 40) {
            System.out.println("Número Inválido! Por favor, escolha um número de 1 a 40");
            return;
        }

        if (assentos.get(assentoEscolhido - 1)) {
            System.out.println("O assento " + assentoEscolhido + " já está ocupado!");
        } else {
            assentos.set(assentoEscolhido - 1, true);
            this.assentoEscolhido = assentoEscolhido;
            System.out.println("Assento " + assentoEscolhido + " reservado com sucesso!");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Olá Caro Passageiro! Segue dados da sua viagem:");
        System.out.println("Placa: " + getPlacaOnibus());
        System.out.println("Seu assento é: " + getAssentoEscolhido());

    }


    public void adicionarPassageiro(String nome) {
            passageiros.add(nome);
            System.out.println("Passageiro " + nome + " adicionado com sucesso!");
        }

    public void removerPassageiro(String nome) {
            if (passageiros.remove(nome)) {
                System.out.println("Passageiro " + nome + " removido com sucesso!");
            } else {
                System.out.println("Passageiro " + nome + " não encontrado.");
            }
        }

    public void listarPassageiros() {
            System.out.println("Lista de passageiros:");
            for (String passageiro : passageiros) {
                System.out.println(passageiro);
            }
        }

    public List<String> getPassageiros() {
            return passageiros;
        }

    public void setPassageiros(List<String> passageiros) {
            this.passageiros = passageiros;
        }
    }


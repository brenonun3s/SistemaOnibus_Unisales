package rafael;

class UsuarioPassageiro extends Usuario {

    public UsuarioPassageiro(int id, String nome, int idade, String cpf, String email) {
        super(id, nome, idade, cpf, email, TipoUsuario.passageiro);

    }

    public void acessarFuncionalidade(UsuarioPassageiro passageiro) {
        exibirInformacoesPassageiro();
        fazerCheckInPassageiro(); // OK
        fazerReservaPassageiro("Acapulco", 1); // OK
        confirmarPassagemPassageiro(); // OK
        cancelarPassagemPassageiro("Acapulco"); // OK
        alterarAssentoPassageiro(25);
    }

    public void fazerReservaPassageiro(String viagem, int assento) {
        System.out.println(
                "Usuário " + getNome() + " fez reserva com sucesso! Viagem para: " + viagem + ", Assento: " + assento);
    }

    public void fazerCheckInPassageiro() {
        System.out.println("Passageiro " + getNome() + " fez check-in com sucesso.");
        // Aqui vocês podem adicionar lógica para registrar o check-in, como atualizar o
        // status da passagem.
    }

    public void exibirInformacoesPassageiro() {
        System.out.println("Passageiro: " + getNome() + ", Email: " + getEmail());
    }

    public void cancelarPassagemPassageiro(String viagem) {
        System.out.println("Passagem para a viagem " + viagem + " cancelada pelo passageiro " + getNome());
        // Aqui vocês podem adicionar lógica adicional para realmente cancelar a
        // passagem,
        // como marcar como cancelada no banco de dados.
    }

    public void alterarAssentoPassageiro(int novoAssento) {
        System.out.println("Assento do passageiro " + getNome() + " alterado para o novo assento: " + novoAssento
                + " - troca realizada pelo passageiro!");
    }

    public void confirmarPassagemPassageiro() {
        System.out.println("Passagem confirmada para o passageiro " + getNome());
        // Aqui vocês podem adicionar lógica para registrar a confirmação da passagem,
        // como atualizar o status da passagem como vendida.

    }
}

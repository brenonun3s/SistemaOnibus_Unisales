package rafael;

class UsuarioPassageiro extends Usuario {

    public UsuarioPassageiro(int id, String nome, int idade, String cpf, String email) {
        super(id, nome, idade, cpf, email, TipoUsuario.passageiro);
        
    }
    public void acessarFuncionalidade() {
        exibirInformacoes();
        fazerCheckIn(); //OK
        fazerReserva(); //OK
        confirmarPassagem(); //OK 
        cancelarPassagem(); //OK
        alterarAssento(); //OK
    }


    public void fazerReserva(String viagem, String assento) {
        System.out.println("Usuário " + getNome() + " fez reserva com sucesso! Viagem: " + viagem + ", Assento: " + assento);
    }

    public void fazerCheckIn() {
        System.out.println("Passageiro " + getNome() + " fez check-in com sucesso.");
        // Aqui vocês podem adicionar lógica para registrar o check-in, como atualizar o status da passagem.
    }

    public void exibirInformacoes() {
        System.out.println("Passageiro: " + getNome() + ", Email: " + getEmail());
    }

    public void cancelarPassagem(String viagem) {
        System.out.println("Passagem para a viagem " + viagem + " cancelada pelo passageiro " + getNome());
        // Aqui vocês podem adicionar lógica adicional para realmente cancelar a passagem, 
        // como marcar como cancelada no banco de dados.
    }

    public void alterarAssento(String novoAssento) {
        System.out.println("Assento alterado para " + novoAssento + " pelo passageiro " + getNome());
    }

    public void confirmarPassagem() {
        System.out.println("Passagem confirmada para o passageiro " + getNome());
        // Aqui vocês podem adicionar lógica para registrar a confirmação da passagem, como atualizar o status da passagem como vendida.

    }
}

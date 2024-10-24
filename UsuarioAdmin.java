class UsuarioAdmin extends Usuario {

    // Construtor para inicializar o usuário administrador
    public UsuarioAdmin(int id, String nome, int idade, String cpf, String email) {
        super(id, nome, idade, cpf, email, TipoUsuario.administrador);
    }

    // Método que acessa as funcionalidades administrativas
    public void acessarFuncionalidade(UsuarioPassageiro passageiro, int id) {
        alterarAssento(25, passageiro, id); // Altera o assento do passageiro
        confirmarPassagem(passageiro, id); // Confirma a passagem do passageiro
        cancelarPassagem(passageiro, id); // Cancela a passagem do passageiro
        fazerReserva("Acapulco", 20, passageiro, id); // Faz uma reserva para o passageiro
        excluirUsuario(passageiro, id); // Exclui o usuário
        fazerCheckIn(passageiro, id); // Faz o Check-in
        fazerReserva("Acapulco", 20, passageiro, id); // Faz a reserva
    }

    // Realiza o check-in para o passageiro especificado
    public void fazerCheckIn(UsuarioPassageiro passageiro, int id) {
        System.out.println("O administrador " + getNome() + " fez check-in para o passageiro " + passageiro.getNome() + " com sucesso.");
    }

    // Faz a reserva de uma viagem para um passageiro específico
    public void fazerReserva(String viagem, int assento, UsuarioPassageiro passageiro, int id) {
        System.out.println("Reserva feita pelo administrador " + getNome() + " para o passageiro " + passageiro.getNome() + " na viagem " + viagem + ", Assento: " + assento);
    }

    // Cancela a passagem do passageiro especificado
    public void cancelarPassagem(UsuarioPassageiro passageiro, int id) {
        System.out.println("A passagem do passageiro " + passageiro.getNome() + " foi cancelada pelo administrador " + getNome() + ".");
    }

    // Confirma a passagem para um passageiro específico
    public void confirmarPassagem(UsuarioPassageiro passageiro, int id) {
        System.out.println("A passagem do passageiro " + passageiro.getNome() + " foi confirmada pelo administrador " + getNome() + ".");
    }

    // Altera o assento do passageiro para o valor especificado
    public void alterarAssento(int novoAssento, UsuarioPassageiro passageiro, int id) {
        System.out.println("Assento do passageiro " + passageiro.getNome() + " alterado para assento: " + novoAssento + " - troca efetuada pelo administrador " + getNome() + ".");
    }

    // Exclui um usuário passageiro
    public void excluirUsuario(UsuarioPassageiro passageiro, int id) {
        System.out.println(
                "O passageiro " + passageiro.getNome() + " Id: " + passageiro.getId() + " foi excluído pelo administrador " + getNome() + ".");
    }
}

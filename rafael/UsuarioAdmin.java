package rafael;

class UsuarioAdmin extends Usuario {

    // Construtor para inicializar o usuário administrador
    public UsuarioAdmin(int id, String nome, int idade, String cpf, String email) {
        super(id, nome, idade, cpf, email, TipoUsuario.administrador);
    }

    // Método que acessa as funcionalidades administrativas
    public void acessarFuncionalidade(UsuarioPassageiro passageiro) {
        alterarAssento(25, passageiro); // Altera o assento do passageiro   - - - OKAYYY
        confirmarPassagem(passageiro); // Confirma a passagem do passageiro  - - - OKAY
        cancelarPassagem(passageiro); // Cancela a passagem do passageiro
        fazerReserva("Acapulco", 20, passageiro); // Faz uma reserva para o passageiro
        excluirUsuario(passageiro);
        fazerCheckIn(passageiro);
        fazerReserva("Acapulco", 20, passageiro);
        exibirInformacoesPassageiro();

        
    }

    // Realiza o check-in para o passageiro especificado
    public void fazerCheckIn(UsuarioPassageiro passageiro) {
        System.out.println("O administrador " + getNome() + " fez check-in para o passageiro " + passageiro.getNome()+ " com sucesso.");
    }

    // Faz a reserva de uma viagem para um passageiro específico
    public void fazerReserva(String viagem, int assento, UsuarioPassageiro passageiro) {
        System.out.println("Reserva feita pelo administrador " + getNome() + " para o passageiro "
                + passageiro.getNome() + " na viagem " + viagem + ", Assento: " + assento);
    }

    // Cancela a passagem do passageiro especificado
    public void cancelarPassagem(UsuarioPassageiro passageiro) {
        System.out.println("A passagem do passageiro " + passageiro.getNome() + " foi cancelada pelo administrador " + getNome() + ".");
    }

    // Confirma a passagem para um passageiro específico
    public void confirmarPassagem(UsuarioPassageiro passageiro) {
        System.out.println("A passagem do passageiro " + passageiro.getNome() + " foi confirmada pelo administrador "+ getNome() + ".");
    }

    // Altera o assento do passageiro para o valor especificado
    public void alterarAssento(int novoAssento, UsuarioPassageiro passageiro) {
        System.out.println("Assento do passageiro " + passageiro.getNome() + " alterado para assento: " + novoAssento
                + " - troca efetuada pelo administrador " + getNome() + ".");
    }

    // Exclui um usuário passageiro
    public void excluirUsuario(UsuarioPassageiro passageiro) {
        System.out.println("O passageiro " + passageiro.getNome() + " foi excluído pelo administrador " + getNome() + ".");
    }
    public void exibirInformacoesPassageiro() {
        System.out.println("Passageiro: " + "Nome: " + getNome() + " CPF: " + getCpf() +" e-mail: " +getEmail() +" id: : " +getId() + " idade: " + getIdade() );
    }
}

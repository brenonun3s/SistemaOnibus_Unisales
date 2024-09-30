package rafael;

class UsuarioAdmin extends Usuario {
    
    public UsuarioAdmin(int id, String nome, int idade, String cpf, String email) {
        super(id, nome, idade, cpf, email, TipoUsuario.administrador);
    }

    public void acessarFuncionalidade() {
        exibirInformacoes();
        fazerCheckIn(); //OK
        fazerReserva(); //OK
        confirmarPassagem(); //OK
        cancelarPassagem(); //OK
        alterarAssento(); //OK
        excluirUsuario();
	}

    public void exibirInformacoes(){

        System.out.println("Exibindo informações da viagem: " + getOnibus() + ", " + getViagem() + "."); // VERIFIQUE SE ESTÁ CORRETO!!!

    }

    public void fazerCheckIn(UsuarioPassageiro passageiro) {
        passageiro.fazerCheckIn();
        System.out.println("O administrador " + getNome() + " fez check-in para o passageiro " + passageiro.getNome() + ".");
    }

    public void fazerReserva(UsuarioPassageiro passageiro, String viagem, String assento) {
        passageiro.fazerReserva(viagem, assento);
        System.out.println("Reserva feita pelo administrador para o passageiro " + passageiro.getNome() + " na viagem " + viagem + ", Assento: " + assento);
    }

    public void cancelarPassagem(UsuarioPassageiro passageiro, String viagem) {
        passageiro.cancelarPassagem(viagem);
        System.out.println("A passagem para a viagem " + viagem + " foi cancelada pelo administrador " + getNome());
    }

    public void confirmarPassagem(UsuarioPassageiro passageiro) {
        passageiro.confirmarPassagem();
        System.out.println("A passagem do passageiro " + passageiro.getNome() + " foi confirmada pelo administrador " + getNome());
    }


    public void alterarAssento(UsuarioPassageiro passageiro, int novoAssento){
        System.out.println("Assento do passageiro " + passageiro.getNome() + " alterado para " + novoAssento + " pelo administrador " + getNome());
    }

    public void excluirUsuario(UsuarioPassageiro passageiro){   //ALTERE PARA EXCLUIR OUTROS PASSAGEIROS
            System.out.println("Usuario excluido pelo administrador " + getNome());
    }

}
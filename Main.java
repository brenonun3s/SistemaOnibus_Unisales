public class Main {

    public static void main(String[] args) throws Exception {

        Onibus laranjeiras = new Onibus();
        System.out.println("---------- COMANDOS DE DEFINIÇÃO DO ONIBUS ----------");

        laranjeiras.setPlacaOnibus("ABC-1234");
        laranjeiras.getPlacaOnibus();

        //laranjeiras.escolherAssento();
        //laranjeiras.exibirInformacoes();
        //laranjeiras.adicionarPassageiro("Breno");
        //laranjeiras.listarPassageiros();
        //laranjeiras.removerPassageiro("Breno");
        //laranjeiras.listarPassageiros();
        
        laranjeiras.setNumeroOnibus("1234");
        System.out.println(laranjeiras.getNumeroOnibus());
        
        UsuarioAdmin admin = new UsuarioAdmin(1, "Rafael", 24, "123.456.789-00",
        "rafael@admin.com");

        UsuarioPassageiro passageiro = new UsuarioPassageiro(2, "Jamal", 25,
        "987.654.321-00", "jamal@passageiro.com");
        UsuarioPassageiro passageiro2 = new UsuarioPassageiro(3,"Catia", 20,"225.654.321-00","joyce@passageira.com");


        System.out.println("\n---------- COMANDOS DO ADMINISTRADOR DO SISTEMA ----------\n");

        admin.alterarAssento(12, passageiro, 2);
        admin.alterarAssento(20, passageiro2, 3);
        admin.cancelarPassagem(passageiro, 2);
        admin.cancelarPassagem(passageiro2, 3);
        admin.confirmarPassagem(passageiro, 2);
        admin.confirmarPassagem(passageiro2, 3);
        admin.excluirUsuario(passageiro, 2);
        admin.excluirUsuario(passageiro2, 3);

        System.out.println("\n---------- COMANDOS DO PASSAGEIRO ----------\n");
        passageiro.alterarAssentoPassageiro(15);
        passageiro.confirmarPassagemPassageiro();
        passageiro.cancelarPassagemPassageiro("Acapulco");
        passageiro.exibirInformacoesPassageiro(2);


    }
}

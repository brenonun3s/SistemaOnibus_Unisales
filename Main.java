public class Main {

    public static void main(String[] args) throws Exception {

        Onibus laranjeiras = new Onibus();

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

        admin.alterarAssento(2, passageiro);
        passageiro.alterarAssentoPassageiro(6);

    }
}

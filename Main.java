public class Main {

       public static void main(String[] args) throws Exception {

        Onibus laranjeiras = new Onibus();

        laranjeiras.setPlacaOnibus("ABC-1234");
        laranjeiras.getPlacaOnibus();
        
       

        
        laranjeiras.escolherAssento();
        laranjeiras.exibirInformacoes();
        laranjeiras.adicionarPassageiro("Breno");
        laranjeiras.listarPassageiros();
        laranjeiras.removerPassageiro("Breno");
        laranjeiras.listarPassageiros();
        
        
    
        
                
    }
}

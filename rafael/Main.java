package rafael;

public class Main {
        public static void main(String[] args) {
                UsuarioAdmin admin = new UsuarioAdmin(1, "Rafael", 24, "12345678910", "rafael@teste.com");

                UsuarioPassageiro passageiro = new UsuarioPassageiro(2, "Ana Souza", 25, "987.654.321-00", "ana@passageiro.com");

                UsuarioPassageiro passageiro2 = new UsuarioPassageiro(3, "Drow", 70, "12345678910", "rafa@gmail.com");

                admin.alterarAssento(1, passageiro);
                admin.alterarAssento(2, passageiro2);

                passageiro.alterarAssentoPassageiro(2);
                passageiro2.alterarAssentoPassageiro(3);

        }
}

package rafael;
import rafael.UsuarioAdmin;
import rafael.UsuarioPassageiro;
import rafael.Usuario.TipoUsuario;

public class Main {
        public static void main(String[] args) {
                UsuarioAdmin admin = new UsuarioAdmin(1, "Rafael", 24, "12345678910", "rafael@teste.com");

                UsuarioPassageiro passageiro = new UsuarioPassageiro(2, "Ana Souza", 25, "987.654.321-00","ana@passageiro.com");

                passageiro.alterarAssento();
                passageiro.cancelarPassagem();




                admin.confirmarPassagem(passageiro);
                admin.cancelarPassagem(passageiro);

        }
}

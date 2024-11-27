package br.com.unisales.service;

import java.util.Scanner;

import br.com.unisales.dao.PassageiroDao;
import br.com.unisales.dao.PassagemDao;
import br.com.unisales.dao.VendedorDao;
import br.com.unisales.table.Passageiro;
import br.com.unisales.table.Passagem;
import br.com.unisales.table.Vendedor;

public class VendedorService {

    private final VendedorDao dao;
    private final Scanner sc = new Scanner(System.in);

    public VendedorService() {
        this.dao = new VendedorDao();
    }

    public String salvar(Vendedor vendedor) {
        return this.dao.salvar(vendedor);
    }

    public String excluir(Long id) {
        return this.dao.excluir(id);
    }

    public void cadastrarPassageiro(Passageiro passageiro) {
        try {

            System.out.println("Digite o nome do passageiro: ");
            passageiro.setNome(sc.nextLine());

            System.out.println("Digite o sexo do passageiro: (M/F) ");
            passageiro.setSexo(sc.nextLine());

            System.out.println("Digite o email do passageiro: ");
            passageiro.setEmail(sc.nextLine());

            System.out.println("Digite a senha do passageiro: ");
            passageiro.setSenha(sc.nextLine());

            System.out.println("Digite o cpf do passageiro: ");
            passageiro.setCpf(sc.nextLine());

            PassageiroService passageiroService = new PassageiroService();
            passageiroService.salvar(passageiro);
            System.out.println("Passageiro cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar passageiro: " + e.getMessage());
        }
    }

    public void venderPassagem(Passagem passagem) {
        try {
            System.out.println("DIGITE O NOME DO PASSAGEIRO: ");
            passagem.setNomePassageiro(sc.nextLine());
            System.out.println("DIGITE O SEXO DO PASSAGEIRO: (M/F) ");
            passagem.setSexoPassageiro(sc.nextLine());
            System.out.println("DIGITE O EMAIL DO PASSAGEIRO: ");
            passagem.setEmailPassageiro(sc.nextLine());
            System.out.println("DIGITE SEU CPF: ");
            passagem.setCpfPassageiro(sc.nextLine());
            System.out.println("SOLICITE A SENHA DO PASSAGEIRO: ");
            passagem.setSenhaPassageiro(sc.nextLine());
            System.out.println("DIGITE SEU LOCAL DE ORIGEM: ");
            passagem.setOrigem(sc.nextLine());
            System.out.println("DIGITE SEU LOCAL DE DESTINO: ");
            passagem.setDestino(sc.nextLine());
            System.out.println("DIGITE A DATA DA VIAGEM (dd/mm/aaaa): ");
            passagem.setDataViagem(sc.nextLine());
            while (true) {
                try {
                    System.out.println("DIGITE O PREÇO DA PASSAGEM: ");
                    passagem.setPreco(Double.parseDouble(sc.nextLine()));
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Erro de formato: por favor, digite um número válido para o preço.");
                }
            }
            while (true) {
                try {
                    System.out.println("DIGITE O NÚMERO DO ASSENTO: ");
                    passagem.setNumeroAssento(Integer.parseInt(sc.nextLine()));
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Erro de formato: por favor, digite um número válido para o assento.");
                }
            }
            PassagemService passagemService = new PassagemService();
            passagemService.salvar(passagem);
            System.out.println("Passagem comprada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao comprar passagem: " + e.getMessage());
        }
    }

    public void fecharScanner() {
        sc.close();
    }
}

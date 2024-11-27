package br.com.unisales.service;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import br.com.unisales.dao.PassageiroDao;
import br.com.unisales.dao.PassagemDao;
import br.com.unisales.table.Passageiro;
import br.com.unisales.table.Passagem;

public class PassageiroService {

    private final PassageiroDao dao;
    private final PassagemDao passagemDao;
    private final Scanner sc = new Scanner(System.in);

    public PassageiroService() {
        this.dao = new PassageiroDao();
        this.passagemDao = new PassagemDao();
    }

    public String salvar(Passageiro passageiro) {
        return this.dao.salvar(passageiro);
    }

    public String alterar(Passageiro passageiro) {
        return this.dao.alterar(passageiro);
    }

    public String excluir(Long id) {
        return this.dao.excluir(id);
    }

    public List<Passageiro> listar() {
        return this.dao.listar();
    }

    public void comprarPassagem(Passagem passagem) {
        try {
            System.out.println("DIGITE O NOME DO PASSAGEIRO: ");
            passagem.setNomePassageiro(sc.nextLine());
            System.out.println("DIGITE O SEXO DO PASSAGEIRO: (M/F) ");
            passagem.setSexoPassageiro(sc.nextLine());
            System.out.println("DIGITE O EMAIL DO PASSAGEIRO: ");
            passagem.setEmailPassageiro(sc.nextLine());
            System.out.println("DIGITE SEU CPF: ");
            passagem.setCpfPassageiro(sc.nextLine());
            System.out.println("DIGITE A SUA SENHA: ");
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
    public void listarPassagem(Passageiro passageiro) {
        System.out.println(this.listar());
    }
}

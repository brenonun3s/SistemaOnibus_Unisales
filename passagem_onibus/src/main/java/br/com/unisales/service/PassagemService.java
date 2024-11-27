package br.com.unisales.service;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import br.com.unisales.dao.PassagemDao;
import br.com.unisales.table.Passagem;

public class PassagemService {

    private final PassagemDao dao;
    private final Scanner sc = new Scanner(System.in);

    public PassagemService() {
        this.dao = new PassagemDao();
    }

    // Método para salvar uma passagem
    public String salvar(Passagem passagem) {
        return this.dao.salvar(passagem);
    }

    // Método para alterar uma passagem
    public String alterar(Passagem passagem) {
        return this.dao.alterar(passagem);
    }

    // Método para excluir uma passagem pelo ID
    public String excluir(Long id) {
        return this.dao.excluir(id);
    }

    // Método para listar todas as passagens
    public List<Passagem> listar() {
        return this.dao.listar();
    }

    // Método para comprar uma passagem
    public void comprarPassagem() {
        Passagem passagem = new Passagem();
        
        System.out.println("DIGITE A ORIGEM: ");
        passagem.setOrigem(sc.nextLine());
        
        System.out.println("DIGITE O DESTINO: ");
        passagem.setDestino(sc.nextLine());
        
        System.out.println("DIGITE A DATA DA VIAGEM (dd/mm/aaaa): ");
        passagem.setDataViagem(sc.nextLine());
        
        while (true) {
            try {
                System.out.println("DIGITE O PREÇO DA PASSAGEM: ");
                passagem.setPreco(Double.parseDouble(sc.nextLine()));
                break;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Erro de formato: por favor, digite um número válido para o preço.");
                sc.next(); // Limpar a entrada inválida
            }
        }
        
        while (true) {
            try {
                System.out.println("DIGITE O NÚMERO DO ASSENTO: ");
                passagem.setNumeroAssento(Integer.parseInt(sc.nextLine()));
                break;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Erro de formato: por favor, digite um número válido para o assento.");
                sc.next(); // Limpar a entrada inválida
            }
        }
        


        System.out.println(this.salvar(passagem)); // Salva a passagem no banco de dados
    }


}

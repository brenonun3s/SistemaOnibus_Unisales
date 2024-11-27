package br.com.unisales.service;

import java.util.List;
import java.util.Scanner;

import br.com.unisales.dao.AdministradorDao;
import br.com.unisales.table.Administrador;
import br.com.unisales.table.Onibus;
import br.com.unisales.table.Passageiro;
import br.com.unisales.table.Vendedor;

public class AdministradorService {
    private final AdministradorDao dao;
    private final Scanner sc = new Scanner(System.in);

    public AdministradorService() {
        this.dao = new AdministradorDao();
    }

    public String salvar(Administrador administrador) {
        return this.dao.salvar(administrador);
    }

    public String alterar(Administrador administrador) {
        return this.dao.alterar(administrador);
    }

    public String excluir(Long id) {
        return this.dao.excluir(id);
    }

    public List<Administrador> listar() {
        return this.dao.listar();
    }

    public void cadastrarPassageiro(Passageiro passageiro) {
        System.out.println("Digite o nome do passageiro: ");
        passageiro.setNome(sc.nextLine());
        System.out.println("Digite o sexo do passageiro: ");
        passageiro.setSexo(sc.nextLine());
        System.out.println("Digite o email do passageiro: ");
        passageiro.setEmail(sc.nextLine());
        System.out.println("Digite a senha do passageiro: ");
        passageiro.setSenha(sc.nextLine());
        System.out.println("Digite o CPF do cliente: ");
        passageiro.setCpf(sc.nextLine());


        PassageiroService passageiroService = new PassageiroService();
        passageiroService.salvar(passageiro);
        System.out.println("Passageiro cadastrado com sucesso!");
    }

    public void cadastrarOnibus(Onibus onibus) {
        System.out.println("Digite a placa do onibus: ");
        onibus.setPlaca(sc.nextLine());
        System.out.println("Digite a quantidade de assentos do onibus: ");
        onibus.setQuantidadeAssento(sc.nextInt());
        sc.nextLine();
        

        OnibusService onibusService = new OnibusService();
        onibusService.salvar(onibus);

        System.out.println("Onibus cadastrado com sucesso!");
    }


    public void cadastrarAdministrador(Administrador administrador) {
        System.out.println("Digite o nome do administrador: ");
        administrador.setNome(sc.nextLine());
        System.out.println("Digite o sexo do administrador: (M/F) ");
        administrador.setSexo(sc.nextLine());
        System.out.println("Digite o email do administrador: ");
        administrador.setEmail(sc.nextLine());
        System.out.println("Digite a senha do administrador: ");
        administrador.setSenha(sc.nextLine());


        AdministradorService administradorService = new AdministradorService();
        administradorService.salvar(administrador);
        System.out.println("Administrador cadastrado com sucesso!");
    }

    public void cadastrarVendedor(Vendedor vendedor) {
        System.out.println("Digite o nome do vendedor: ");
        vendedor.setNome(sc.nextLine());
        System.out.println("Digite o sexo do vendedor:  ");
        vendedor.setSexo(sc.nextLine());
        System.out.println("Digite o CPF do vendedor: ");
        vendedor.setCpf(sc.nextLine());
        System.out.println("Digite o email do vendedor: ");
        vendedor.setEmail(sc.nextLine());
        System.out.println("Digite a senha do vendedor: ");
        vendedor.setSenha(sc.nextLine());


        VendedorService vendedorService = new VendedorService();
        vendedorService.salvar(vendedor);
        System.out.println("Vendedor cadastrado com sucesso!");
    }
}

package br.com.unisales.dao;

import java.util.List;

import br.com.unisales.table.Passagem;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class PassagemDao {

    private static final String PERSISTENCE_UNIT_NAME = "onibusPUSQLite"; // Nome da unidade de persistência
    private final EntityManagerFactory emf;

    public PassagemDao() {
        this.emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }

    // Método para salvar uma passagem
    public String salvar(Passagem passagem) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(passagem);
            em.getTransaction().commit();
            return "Passagem salva com sucesso!";
        } catch (Exception e) {
            em.getTransaction().rollback();
            return "Erro ao salvar passagem: " + e.getMessage();
        } finally {
            em.close();
        }
    }

    // Método para alterar uma passagem
    public String alterar(Passagem passagem) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(passagem);
            em.getTransaction().commit();
            return "Passagem alterada com sucesso!";
        } catch (Exception e) {
            em.getTransaction().rollback();
            return "Erro ao alterar passagem: " + e.getMessage();
        } finally {
            em.close();
        }
    }

    // Método para excluir uma passagem pelo ID
    public String excluir(Long id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Passagem passagem = em.find(Passagem.class, id);
            if (passagem != null) {
                em.remove(passagem);
                em.getTransaction().commit();
                return "Passagem excluída com sucesso!";
            } else {
                return "Passagem não encontrada.";
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            return "Erro ao excluir passagem: " + e.getMessage();
        } finally {
            em.close();
        }
    }

    // Método para listar todas as passagens
    public List<Passagem> listar() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT p FROM Passagem p", Passagem.class).getResultList();
        } catch (Exception e) {
            System.out.println("Erro ao listar passagens: " + e.getMessage());
            return List.of();
        } finally {
            em.close();
        }
    }

    // Fechar o EntityManagerFactory
    public void fechar() {
        if (emf.isOpen()) {
            emf.close();
        }
    }
}

package br.com.unisales.table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "passagem")
public class Passagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "origem", nullable = false, length = 100)
    private String origem;

    @Column(name = "destino", nullable = false, length = 100)
    private String destino;

    @Column(name = "data_viagem", nullable = false, length = 10)
    private String dataViagem;

    @Column(name = "preco", nullable = false)
    private double preco;

    @Column(name = "numero_assento", nullable = false)
    private int numeroAssento;

    @Column(name = "nomePassageiro", nullable = false)
    private String nomePassageiro;

    @Column(name = "cpfPassageiro", nullable = false)
    private String cpfPassageiro;

    @Column(name = "emailPassageiro", nullable = false)
    private String emailPassageiro;

    @Column(name = "sexoPassageiro", nullable = false)
    private String sexoPassageiro;

    @Column(name = "senhaPassageiro", nullable = false)
    private String senhaPassageiro;

}

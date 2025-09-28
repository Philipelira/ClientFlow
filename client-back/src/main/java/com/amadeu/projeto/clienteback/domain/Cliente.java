package com.amadeu.projeto.clienteback.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CLIENTE")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_seq_generator")
    @SequenceGenerator(name = "cliente_seq_generator", sequenceName = "CLIENTE_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "NOME", length = 100)
    private String nome;

    @Column(name = "EMAIL", length = 100)
    private String email;

    @Column(name = "TELEFONE", length = 18)
    private Integer telefone;
}

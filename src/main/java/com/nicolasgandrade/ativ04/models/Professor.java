package com.nicolasgandrade.ativ04.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private String endereco;
    private String celular;
    @OneToMany(mappedBy = "professor")
    private List<Treinamento> treinamentos;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "PROFESSOR_CURSO",
            joinColumns = { @JoinColumn(name = "PROFESSOR_ID") },
            inverseJoinColumns = { @JoinColumn(name = "CURSO_ID") }
    )
    private List<Curso> especializacoes;
}

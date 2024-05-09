package com.nicolasgandrade.ativ04.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String descricao;
    private String cargaHoraria;
    private String objetivos;
    @ManyToMany(mappedBy = "especializacoes")
    private List<Professor> professores;
}

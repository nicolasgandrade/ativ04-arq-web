package com.nicolasgandrade.ativ04.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Treinamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;
    private LocalDateTime inicio;
    private LocalDateTime fim;
    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;
    private String cidade;
    private String estado;
    private String cep;
    private String resumo;
}

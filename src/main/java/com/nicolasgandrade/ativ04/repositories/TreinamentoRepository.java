package com.nicolasgandrade.ativ04.repositories;

import com.nicolasgandrade.ativ04.models.Professor;
import com.nicolasgandrade.ativ04.models.Treinamento;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TreinamentoRepository extends JpaRepository<Treinamento, Integer> {

    @Query("SELECT p FROM Professor p WHERE p.id NOT IN " +
            "(SELECT t.professor.id FROM Treinamento t " +
            "WHERE (t.inicio BETWEEN :dataInicio AND :dataFim) " +
            "OR (t.fim BETWEEN :dataInicio AND :dataFim))")
    List<Professor> findProfessoresLivres(
            @Param("dataInicio") LocalDateTime dataInicio,
            @Param("dataFim") LocalDateTime dataFim);
}

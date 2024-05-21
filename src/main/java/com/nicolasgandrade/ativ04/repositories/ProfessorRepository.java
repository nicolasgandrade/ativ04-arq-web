package com.nicolasgandrade.ativ04.repositories;

import com.nicolasgandrade.ativ04.models.Professor;
import com.nicolasgandrade.ativ04.models.Treinamento;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer> {

    @Query("SELECT t FROM Treinamento t WHERE t.professor.id = :professorId")
    List<Treinamento> findTreinamentosByProfessorId(@Param("professorId") int professorId);
}

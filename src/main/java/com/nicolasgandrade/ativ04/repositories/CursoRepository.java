package com.nicolasgandrade.ativ04.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nicolasgandrade.ativ04.models.Curso;
import com.nicolasgandrade.ativ04.models.Professor;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {

    @Query("SELECT p FROM Professor p JOIN p.especializacoes c WHERE c.id = :cursoId")
    List<Professor> findProfessoresByCursoId(@Param("cursoId") int cursoId);
}

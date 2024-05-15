package com.nicolasgandrade.ativ04.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nicolasgandrade.ativ04.models.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {

}

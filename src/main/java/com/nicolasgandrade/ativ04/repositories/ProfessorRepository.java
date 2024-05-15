package com.nicolasgandrade.ativ04.repositories;

import com.nicolasgandrade.ativ04.models.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
}

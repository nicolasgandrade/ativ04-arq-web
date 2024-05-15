package com.nicolasgandrade.ativ04.repositories;

import com.nicolasgandrade.ativ04.models.Treinamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreinamentoRepository extends JpaRepository<Treinamento, Integer> {
}

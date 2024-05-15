package com.nicolasgandrade.ativ04.services;

import com.nicolasgandrade.ativ04.dtos.ProfessorRequestDTO;
import com.nicolasgandrade.ativ04.models.Professor;
import com.nicolasgandrade.ativ04.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public void adicionarProfessor(ProfessorRequestDTO professorRequestDTO) {
        var newProfessor = Professor.builder()
                .nome(professorRequestDTO.nome())
                .cpf(professorRequestDTO.cpf())
                .rg(professorRequestDTO.rg())
                .celular(professorRequestDTO.celular())
                .endereco(professorRequestDTO.endereco())
                .build();

        professorRepository.save(newProfessor);
    }
}

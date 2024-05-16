package com.nicolasgandrade.ativ04.services;

import com.nicolasgandrade.ativ04.dtos.ProfessorRequestDTO;
import com.nicolasgandrade.ativ04.models.Professor;
import com.nicolasgandrade.ativ04.repositories.CursoRepository;
import com.nicolasgandrade.ativ04.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;
    @Autowired
    private CursoRepository cursoRepository;

    public Professor adicionarProfessor(ProfessorRequestDTO professorRequestDTO) {
        var newProfessor = Professor.builder()
                .nome(professorRequestDTO.nome())
                .cpf(professorRequestDTO.cpf())
                .rg(professorRequestDTO.rg())
                .celular(professorRequestDTO.celular())
                .endereco(professorRequestDTO.endereco())
                .build();

        return professorRepository.save(newProfessor);
    }

    public Professor registrarEspecializacao(int cursoId, int professorId) {
        var curso = cursoRepository.findById(cursoId).orElseThrow();
        var professor = professorRepository.findById(professorId).orElseThrow();

        if (professor.getEspecializacoes() == null) {
            professor.setEspecializacoes(List.of(curso));
        } else {
            professor.getEspecializacoes().add(curso);
        }

        return professorRepository.save(professor);
    }
}

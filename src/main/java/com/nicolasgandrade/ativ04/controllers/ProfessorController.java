package com.nicolasgandrade.ativ04.controllers;

import com.nicolasgandrade.ativ04.dtos.ProfessorRequestDTO;
import com.nicolasgandrade.ativ04.services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/professores")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @PostMapping
    public void adicionarProfessor(@RequestBody ProfessorRequestDTO professorRequestDTO) {
        professorService.adicionarProfessor(professorRequestDTO);
    }
}

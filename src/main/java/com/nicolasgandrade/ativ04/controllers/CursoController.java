package com.nicolasgandrade.ativ04.controllers;

import com.nicolasgandrade.ativ04.models.Curso;
import com.nicolasgandrade.ativ04.models.Professor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.nicolasgandrade.ativ04.dtos.CursoRequestDTO;
import com.nicolasgandrade.ativ04.services.CursoService;

@RestController
@RequestMapping("api/cursos")
public class CursoController {

    private CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Curso adicionar(@RequestBody CursoRequestDTO cursoRequestDTO) {
        return cursoService.adicionar(cursoRequestDTO);
    }

    @GetMapping("/{cursoId}/professores")
    public List<Professor> findProfessoresByCursoId(@PathVariable int cursoId) {
        return cursoService.findProfessoresByCursoId(cursoId);
    }
}

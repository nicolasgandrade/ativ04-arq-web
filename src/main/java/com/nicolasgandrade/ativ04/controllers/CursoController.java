package com.nicolasgandrade.ativ04.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.nicolasgandrade.ativ04.dtos.CursoRequestDTO;
import com.nicolasgandrade.ativ04.services.CursoService;

@RestController
@RequestMapping("api/curso")
public class CursoController {

    private CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void adicionar(@RequestBody CursoRequestDTO cursoRequestDTO) {
        cursoService.adicionar(cursoRequestDTO);
    }
}

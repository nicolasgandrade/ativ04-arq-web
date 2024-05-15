package com.nicolasgandrade.ativ04.controllers;

import com.nicolasgandrade.ativ04.dtos.TreinamentoRequestDTO;
import com.nicolasgandrade.ativ04.models.Treinamento;
import com.nicolasgandrade.ativ04.services.TreinamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/treinamentos")
public class TreinamentoController {

    @Autowired
    private TreinamentoService treinamentoService;

    @PostMapping
    public Treinamento adicionarTreinamento(@RequestBody TreinamentoRequestDTO treinamentoRequestDTO) {
        return treinamentoService.criarTreinamento(treinamentoRequestDTO);
    }
}

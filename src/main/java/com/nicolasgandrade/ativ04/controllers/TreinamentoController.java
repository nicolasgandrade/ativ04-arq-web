package com.nicolasgandrade.ativ04.controllers;

import com.nicolasgandrade.ativ04.dtos.ResumoDTO;
import com.nicolasgandrade.ativ04.dtos.TreinamentoRequestDTO;
import com.nicolasgandrade.ativ04.models.Professor;
import com.nicolasgandrade.ativ04.models.Treinamento;
import com.nicolasgandrade.ativ04.services.TreinamentoService;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/treinamentos")
public class TreinamentoController {

    @Autowired
    private TreinamentoService treinamentoService;

    @PostMapping
    public Treinamento adicionarTreinamento(@RequestBody TreinamentoRequestDTO treinamentoRequestDTO) {
        return treinamentoService.criarTreinamento(treinamentoRequestDTO);
    }

    @PatchMapping("/{id}")
    public Treinamento adicionarResumo(@PathVariable(name = "id") String treinamentoIdStr,
            @RequestBody ResumoDTO resumo) {
        return treinamentoService.registrarResumo(Integer.valueOf(treinamentoIdStr), resumo.resumo());
    }

    @GetMapping("/professores-livres")
    public List<Professor> findProfessoresLivres(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dataInicio,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dataFim) {
        return treinamentoService.findProfessoresLivres(dataInicio, dataFim);
    }
}

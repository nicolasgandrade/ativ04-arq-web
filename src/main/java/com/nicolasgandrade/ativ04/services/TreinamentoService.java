package com.nicolasgandrade.ativ04.services;

import com.nicolasgandrade.ativ04.dtos.TreinamentoRequestDTO;
import com.nicolasgandrade.ativ04.models.Treinamento;
import com.nicolasgandrade.ativ04.repositories.CursoRepository;
import com.nicolasgandrade.ativ04.repositories.ProfessorRepository;
import com.nicolasgandrade.ativ04.repositories.TreinamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TreinamentoService {

    @Autowired
    private TreinamentoRepository treinamentoRepository;
    @Autowired
    private CursoRepository cursoRepository;
    @Autowired
    private ProfessorRepository professorRepository;

    public Treinamento criarTreinamento(TreinamentoRequestDTO treinamentoRequestDTO) {
        var curso = cursoRepository.findById(treinamentoRequestDTO.cursoId()).orElseThrow();
        var professor = professorRepository.findById(treinamentoRequestDTO.professorId()).orElseThrow();

        var treinamento = Treinamento.builder()
                .curso(curso)
                .professor(professor)
                .cep(treinamentoRequestDTO.cep())
                .cidade(treinamentoRequestDTO.cidade())
                .estado(treinamentoRequestDTO.estado())
                .cep(treinamentoRequestDTO.cep())
                .inicio(treinamentoRequestDTO.inicio())
                .fim(treinamentoRequestDTO.fim())
                .build();

        return treinamentoRepository.save(treinamento);
    }

    public Treinamento registrarResumo(int treinamentoId, String resumo ) {
        var treinamento = treinamentoRepository.findById(treinamentoId).orElseThrow();
        treinamento.setResumo(resumo);

        return treinamentoRepository.save(treinamento);
    }
}

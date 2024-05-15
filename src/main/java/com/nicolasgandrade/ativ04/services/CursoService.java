package com.nicolasgandrade.ativ04.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nicolasgandrade.ativ04.dtos.CursoRequestDTO;
import com.nicolasgandrade.ativ04.models.Curso;
import com.nicolasgandrade.ativ04.repositories.CursoRepository;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public Curso adicionar(CursoRequestDTO cursoRequestDTO) {
        Curso curso = new Curso();
        curso.setDescricao(cursoRequestDTO.getDescricao());
        curso.setCargaHoraria(cursoRequestDTO.getCargaHoraria());
        curso.setObjetivos(cursoRequestDTO.getObjetivos());

        return cursoRepository.save(curso);
    }

}

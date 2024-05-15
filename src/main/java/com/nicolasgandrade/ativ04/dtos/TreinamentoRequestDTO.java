package com.nicolasgandrade.ativ04.dtos;

import java.time.LocalDateTime;

public record TreinamentoRequestDTO(
        int cursoId,
        int professorId,
        LocalDateTime inicio,
        LocalDateTime fim,
        String cidade,
        String estado,
        String cep) {
}

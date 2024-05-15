package com.nicolasgandrade.ativ04.dtos;

public record ProfessorRequestDTO(
        String nome,
        String cpf,
        String rg,
        String endereco,
        String celular
) {
}

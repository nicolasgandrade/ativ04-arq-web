package com.nicolasgandrade.ativ04.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CursoRequestDTO {
    private String descricao;
    private int cargaHoraria;
    private String objetivos;
}

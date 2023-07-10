package com.api.ibmprocessoseletivo.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ProcessoSeletivoDto {

    @NotBlank
    @Size(min = 3, max = 30)
    private String name;
    @NotBlank
    @Size(min = 8, max = 12)
    private String status;
}

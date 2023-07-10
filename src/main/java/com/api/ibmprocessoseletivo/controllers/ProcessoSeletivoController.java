package com.api.ibmprocessoseletivo.controllers;

import com.api.ibmprocessoseletivo.services.ProcessoSeletivoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hiring")
public class ProcessoSeletivoController {

    final ProcessoSeletivoService processoSeletivoService;

    public ProcessoSeletivoController(ProcessoSeletivoService processoSeletivoService) {
        this.processoSeletivoService = processoSeletivoService;
    }


}

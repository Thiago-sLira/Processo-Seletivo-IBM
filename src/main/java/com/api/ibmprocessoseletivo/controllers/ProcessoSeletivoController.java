package com.api.ibmprocessoseletivo.controllers;

import com.api.ibmprocessoseletivo.services.ProcessoSeletivoService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value = "/hiring")
public class ProcessoSeletivoController {

    final ProcessoSeletivoService processoSeletivoService;

    public ProcessoSeletivoController(ProcessoSeletivoService processoSeletivoService) {
        this.processoSeletivoService = processoSeletivoService;
    }



}

package com.api.ibmprocessoseletivo.services;

import com.api.ibmprocessoseletivo.repositories.ProcessoSeletivoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProcessoSeletivoService {

    final ProcessoSeletivoRepository processoSeletivoRepository;

    public ProcessoSeletivoService(ProcessoSeletivoRepository processoSeletivoRepository) {
        this.processoSeletivoRepository = processoSeletivoRepository;
    }
}

package com.api.ibmprocessoseletivo.repositories;

import com.api.ibmprocessoseletivo.models.ProcessoSeletivoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessoSeletivoRepository extends JpaRepository<ProcessoSeletivoModel, Integer> {

}

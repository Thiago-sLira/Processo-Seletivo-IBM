package com.api.ibmprocessoseletivo.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_PROCESSO_SELETIVO")
public class ProcessoSeletivoModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID.id;
    @Column(nullable = false, unique = true, length = 10)
    private String nome
}

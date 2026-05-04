package com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.out.persistence.h2.repository;

import com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.out.persistence.h2.entity.PessoaEntity;
import com.fag.lucasmartins.arquitetura_software.core.domain.bo.PessoaBO;
import com.fag.lucasmartins.arquitetura_software.application.ports.out.persistence.PessoaRepositoryPort;
import com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.out.persistence.h2.jpa.PessoaJpaRepository;
import com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.out.persistence.h2.mapper.PessoaMapper;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class PessoaRepositoryAdapter implements PessoaRepositoryPort {

    private final PessoaJpaRepository pessoaJpaRepository;

    public PessoaRepositoryAdapter(PessoaJpaRepository pessoaJpaRepository) {
        this.pessoaJpaRepository = pessoaJpaRepository;
    }

    @Override
    public PessoaBO salvar(PessoaBO pessoaBO) {
        PessoaEntity pessoaEntity = PessoaMapper.toEntity(pessoaBO);

        @SuppressWarnings("null")
        PessoaEntity savedEntity = pessoaJpaRepository.save(pessoaEntity);

        return PessoaMapper.toBO(savedEntity);
    }

    @Override
    public PessoaBO encontrarPorId(UUID id) {
        PessoaEntity pessoaEntity = pessoaJpaRepository.findById(id).orElse(null);
        return PessoaMapper.toBO(pessoaEntity);
    }
}

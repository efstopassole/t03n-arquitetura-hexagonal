package com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.out.persistence.h2.jpa;

import com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.out.persistence.h2.entity.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PessoaJpaRepository extends JpaRepository<PessoaEntity, UUID> {
}
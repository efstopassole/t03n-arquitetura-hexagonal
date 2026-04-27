import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

package com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.out.persistence.h2.jpa;


@Repository
public interface PessoaJpaRepository extends JpaRepository<PessoaJpaEntity, Long> {
}
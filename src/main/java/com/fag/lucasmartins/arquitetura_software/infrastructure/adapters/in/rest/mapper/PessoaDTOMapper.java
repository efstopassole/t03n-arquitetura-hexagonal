package com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.in.rest.mapper;

import com.fag.lucasmartins.arquitetura_software.core.domain.bo.PessoaBO;
import com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.in.rest.dto.PessoaDTO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PessoaDTOMapper {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private PessoaDTOMapper() {}

    public static PessoaBO toBo(PessoaDTO pessoaDTO) {
        PessoaBO pessoaBO = new PessoaBO();
        if (pessoaDTO.getId() != null) {
            pessoaBO.setId(java.util.UUID.fromString(pessoaDTO.getId()));
        }
        pessoaBO.setNomeCompleto(pessoaDTO.getNomeCompleto());
        pessoaBO.setCpf(pessoaDTO.getCpf());
        if (pessoaDTO.getDataNascimento() != null) {
            pessoaBO.setDataNascimento(LocalDate.parse(pessoaDTO.getDataNascimento(), FORMATTER));
        }
        pessoaBO.setEmail(pessoaDTO.getEmail());
        pessoaBO.setTelefone(pessoaDTO.getTelefone());
        return pessoaBO;
    }

    public static PessoaDTO toDto(PessoaBO pessoaBO) {
        return new PessoaDTO(
            pessoaBO.getId().toString(),
            pessoaBO.getNomeCompleto(),
            pessoaBO.getCpf(),
            pessoaBO.getDataNascimento().format(FORMATTER),
            pessoaBO.getEmail(),
            pessoaBO.getTelefone()
        );
    }
}
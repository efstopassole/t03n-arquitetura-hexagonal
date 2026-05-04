package com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.in.rest.mapper;

import com.fag.lucasmartins.arquitetura_software.core.domain.bo.PessoaBO;
import com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.in.rest.dto.PessoaDTO;

public class PessoaDTOMapper {

    private PessoaDTOMapper() {
    }

    public static PessoaDTO toDto(PessoaBO pessoaBO) {
        if (pessoaBO == null) {
            return null;
        }
        PessoaDTO pessoaDTO = new PessoaDTO();
        pessoaDTO.setId(pessoaBO.getId());
        pessoaDTO.setNomeCompleto(pessoaBO.getNomeCompleto());
        pessoaDTO.setCpf(pessoaBO.getCpf());
        pessoaDTO.setDataNascimento(pessoaBO.getDataNascimento());
        pessoaDTO.setEmail(pessoaBO.getEmail());
        pessoaDTO.setTelefone(pessoaBO.getTelefone());
        return pessoaDTO;
    }

    public static PessoaBO toBo(PessoaDTO pessoaDTO) {
        if (pessoaDTO == null) {
            return null;
        }
        PessoaBO pessoaBO = new PessoaBO();
        pessoaBO.setId(pessoaDTO.getId());
        pessoaBO.setNomeCompleto(pessoaDTO.getNomeCompleto());
        pessoaBO.setCpf(pessoaDTO.getCpf());
        pessoaBO.setDataNascimento(pessoaDTO.getDataNascimento());
        pessoaBO.setEmail(pessoaDTO.getEmail());
        pessoaBO.setTelefone(pessoaDTO.getTelefone());
        return pessoaBO;
    }
}

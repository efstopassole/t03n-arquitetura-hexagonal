import com.fag.lucasmartins.arquitetura_software.domain.model.Pessoa;
import com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.in.rest.dto.PessoaDTO;
import org.mapstruct.Mapper;

package com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.in.rest.mapper;


@Mapper(componentModel = "spring")
public interface PessoaDTOMapper {

    PessoaDTO toDTO(Pessoa pessoa);

    Pessoa toEntity(PessoaDTO pessoaDTO);
}public class PessoaDTOMapper {
    
}

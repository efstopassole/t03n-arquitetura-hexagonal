package com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.in.messaging.Pedido;

import com.fag.lucasmartins.arquitetura_software.application.ports.in.service.PedidoServicePort;
import com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.in.messaging.Pedido.dto.PedidoDTO;
import com.fag.lucasmartins.arquitetura_software.infrastructure.adapters.in.rest.mapper.PedidoDTOMapper;

import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class SqsPedidoAdapter {

    private final PedidoServicePort pedidoServicePort;

    public SqsPedidoAdapter(PedidoServicePort pedidoServicePort) {
        this.pedidoServicePort = pedidoServicePort;
    }

    @SqsListener("${queue.order-events}")
    public void listen(PedidoDTO dto) {
        System.out.println("Mensagem recebida: " + dto.getId());

        pedidoServicePort.criarPedido(PedidoDTOMapper.toBo(dto));

        System.out.println("Mensagem consumida com sucesso.");
    }
}
    
    
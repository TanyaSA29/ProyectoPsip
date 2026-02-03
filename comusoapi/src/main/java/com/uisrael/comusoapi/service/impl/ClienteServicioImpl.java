package com.uisrael.comusoapi.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


import com.uisrael.comusoapi.modelo.dto.request.ClienteRequestDTO;
import com.uisrael.comusoapi.modelo.dto.response.ClienteResponseDTO;
import com.uisrael.comusoapi.service.IClienteServicio;


@Service

public class ClienteServicioImpl implements IClienteServicio{
	
	private final WebClient clienteWeb;

    public ClienteServicioImpl(WebClient clienteWeb) {
        this.clienteWeb = clienteWeb;
    }

    @Override
    public List<ClienteResponseDTO> listarCliente() {
        return clienteWeb.get().uri("/cliente").retrieve().bodyToFlux(ClienteResponseDTO.class).collectList().block();
    }

   
    @Override
    public ClienteRequestDTO crearCliente(ClienteRequestDTO dto) {
        if (dto.getNombre() == null || dto.getNombre().trim().isEmpty()) {
            throw new RuntimeException("El nombre es obligatorio");
        }

        try {
            return clienteWeb.post()
                      .uri("/cliente")
                      .header("Prefer", "return=representation")
                      .bodyValue(dto)
                      .retrieve()
                      .bodyToMono(ClienteRequestDTO.class)
                      .block();
        } catch (org.springframework.web.reactive.function.client.WebClientResponseException e) {
            
            java.util.Map<?, ?> map = e.getResponseBodyAs(java.util.Map.class);
            
            if (map != null && (map.containsKey("id_cliente") || map.containsKey("idCliente"))) {
                ClienteRequestDTO clienteRecuperado = new ClienteRequestDTO();
                
                Object id = map.get("id_cliente") != null ? map.get("id_cliente") : map.get("idCliente");
                clienteRecuperado.setIdCliente(Integer.parseInt(id.toString()));
                clienteRecuperado.setNombre(dto.getNombre());
                return clienteRecuperado; 
            }
            throw e; 
        }
    }
    @Override
    public ClienteResponseDTO buscarClientePorId(int id) {
        return clienteWeb.get()
                .uri("/cliente/{id}", id) // Limpio y directo
                .retrieve()
                .bodyToMono(ClienteResponseDTO.class)
                .block();
    }

    @Override
    public void actualizarCliente(ClienteRequestDTO dto) {
        clienteWeb.put()
                .uri("/cliente/{id}", dto.getIdCliente())
                .bodyValue(dto)
                .retrieve()
                .toBodilessEntity()
                .block();
    }

    @Override
    public void eliminarCliente(int id) {
        clienteWeb.delete()
                .uri("/cliente/{id}", id) 
                .retrieve()
                .toBodilessEntity()
                .block();
    }
}



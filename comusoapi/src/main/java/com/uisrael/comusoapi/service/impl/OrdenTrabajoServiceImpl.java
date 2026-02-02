package com.uisrael.comusoapi.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.uisrael.comusoapi.modelo.dto.request.OrdenTrabajoRequestDTO;
import com.uisrael.comusoapi.modelo.dto.response.OrdenTrabajoResponseDTO;
import com.uisrael.comusoapi.service.IOrdenTrabajoServicio;

@Service
public class OrdenTrabajoServiceImpl implements IOrdenTrabajoServicio {

	
	 private final WebClient webClient;


	    public OrdenTrabajoServiceImpl(WebClient webClient) {
		super();
		this.webClient = webClient;
	}

		@Override
	    public List<OrdenTrabajoResponseDTO> listarOrdenesTrabajo() {
	        return webClient.get().uri("/orden") .retrieve().bodyToFlux(OrdenTrabajoResponseDTO.class).collectList() .block();
	    }

	    @Override
	    public void crearOrdenTrabajo(OrdenTrabajoRequestDTO dto) {
	        webClient.post() .uri("/orden/nueva").bodyValue(dto) .retrieve().toBodilessEntity().block();
	    }

	    @Override
	    public OrdenTrabajoResponseDTO buscarOrdenTrabajoPorId(int id) {
	        return webClient.get()
	                .uri("/orden/{id}", id).retrieve().bodyToMono(OrdenTrabajoResponseDTO.class) .block();
	    }

	    @Override
	    public void actualizarOrdenTrabajo(OrdenTrabajoRequestDTO dto) {
	        webClient.put().uri("/orden/{id}", dto.getIdOrden()).bodyValue(dto).retrieve().toBodilessEntity().block();
	    }

	    @Override
	    public void eliminarOrdenTrabajo(int id) {
	        webClient.delete().uri("/orden/{id}", id) .retrieve().toBodilessEntity().block();
	    }

}

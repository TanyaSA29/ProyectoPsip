package com.uisrael.comusoapi.service;

import java.util.List;

import com.uisrael.comusoapi.modelo.dto.request.OrdenTrabajoRequestDTO;
import com.uisrael.comusoapi.modelo.dto.response.OrdenTrabajoResponseDTO;

public interface IOrdenTrabajoServicio {
	  // listar órdenes de trabajo
    List<OrdenTrabajoResponseDTO> listarOrdenesTrabajo();

    // crear orden
    void crearOrdenTrabajo(OrdenTrabajoRequestDTO dto);

    // buscar por id
    OrdenTrabajoResponseDTO buscarOrdenTrabajoPorId(int id);

    // actualizar orden
    void actualizarOrdenTrabajo(OrdenTrabajoRequestDTO dto);

    // eliminar orden
    void eliminarOrdenTrabajo(int id);
}



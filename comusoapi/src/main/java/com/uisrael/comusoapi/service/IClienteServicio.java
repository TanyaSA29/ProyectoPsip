package com.uisrael.comusoapi.service;

import java.util.List;

import com.uisrael.comusoapi.modelo.dto.request.ClienteRequestDTO;
import com.uisrael.comusoapi.modelo.dto.response.ClienteResponseDTO;

public interface IClienteServicio {
public List<ClienteResponseDTO> listarCliente();
public ClienteRequestDTO crearCliente(ClienteRequestDTO dto);
public ClienteResponseDTO buscarClientePorId(int id);
public void actualizarCliente(ClienteRequestDTO dto);
public void eliminarCliente(int id);
}

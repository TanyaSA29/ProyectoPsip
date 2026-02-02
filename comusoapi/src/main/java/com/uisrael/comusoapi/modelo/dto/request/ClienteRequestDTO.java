package com.uisrael.comusoapi.modelo.dto.request;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ClienteRequestDTO {

	@JsonProperty("id_cliente") 
    private int idCliente;
	private String nombre;
	private String email; 
	private  String telefono;
	private String direccion;
	private boolean estado;
	
}

package com.uisrael.comusoapi.modelo.dto.request;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class EquipoRequestDTO {

	@JsonProperty("id_equipo")
    private int idEquipo;

    @JsonProperty("id_cliente") 
    private int idCliente;
	private  String marca;
	private  String modelo;
	@JsonProperty("num_serie")
	private  String numSerie;

	private String descripcion;

}

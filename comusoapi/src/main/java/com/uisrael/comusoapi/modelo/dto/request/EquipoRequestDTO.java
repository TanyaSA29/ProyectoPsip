package com.uisrael.comusoapi.modelo.dto.request;




import lombok.Data;

@Data
public class EquipoRequestDTO {


    private int idEquipo;

    private int idCliente;
	private  String marca;
	private  String modelo;

	private  String numSerie;

	private String descripcion;

}

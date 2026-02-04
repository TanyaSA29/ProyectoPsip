package com.uisrael.comusoapi.modelo.dto.response;



import lombok.Data;

@Data
public class EquipoResponseDTO {

    private int idEquipo;


    private int idCliente; 
    
    private String marca;
    private String modelo;

    private String numSerie;

    private String descripcion;
}
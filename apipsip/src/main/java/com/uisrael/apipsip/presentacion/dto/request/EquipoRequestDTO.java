package com.uisrael.apipsip.presentacion.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EquipoRequestDTO {
	@JsonProperty("id_equipo")
    private int idEquipo; // Sin @NotBlank porque es int

    @JsonProperty("id_cliente")
    private int idCliente; // Sin @NotBlank porque es int

    @NotBlank(message = "La marca es obligatoria")
    private String marca;

    @NotBlank(message = "El modelo es obligatorio")
    private String modelo;

    @JsonProperty("num_serie") // Sincroniza con el nombre de la DB y el DTO del 8081
    @NotBlank(message = "El número de serie es obligatorio")
    private String numSerie;

    @NotBlank(message = "La descripción es obligatoria")
    private String descripcion;

}

package com.uisrael.apipsip.presentacion.dto.request;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class ClienteRequestDTO {

	
	@JsonProperty("id_cliente") // Esto permite que el 8081 vea el ID real
    private int idCliente;

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @NotBlank(message = "El email es obligatorio")
    private String email; 

    @NotBlank(message = "El teléfono es obligatorio")
    private String telefono;

    @NotBlank(message = "La dirección es obligatoria")
    private String direccion;

    private boolean estado;
}


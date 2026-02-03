package com.uisrael.comusoapi.modelo.dto.response;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Data;

@Data
public class OrdenTrabajoResponseDTO {
	

    private int idOrden;
    private String codigo;
    private int idCliente;
    private String nombreCliente;
    private int idTecnico;
    private String nombreTecnico;
    private int idTipoServicio;
    private String nombreTipoServicio;
    private int idEquipo;
    private String nombreEquipo;
    private LocalDate fechaSolicitud;
    private LocalDate fechaAgendada;
    private LocalTime horaAgendada;
    private String estado;
    private String descripcionTrabajo;
    private String observaciones;
		
}

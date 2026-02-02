package com.uisrael.apipsip.infraestructura.presistencia.jpa;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "orden_trabajo")
public class OrdenTrabajoJpa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idOrden;

	private String codigo;

	@ManyToOne
	
	private ClienteJpa cliente;

	@ManyToOne

	private TecnicoJpa tecnico;

	@ManyToOne
	
	private TipoServicioJpa tipoServicio;

	@ManyToOne

	private EquipoJpa equipo;

	private LocalDate fechaSolicitud;
	private LocalDate fechaAgendada;
	private LocalTime horaAgendada;
	private String estado;


	private String descripcionTrabajo;

	private String observaciones;
}
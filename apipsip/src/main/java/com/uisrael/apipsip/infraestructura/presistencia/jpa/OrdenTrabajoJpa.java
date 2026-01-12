package com.uisrael.apipsip.infraestructura.presistencia.jpa;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ordentrabajo")
public class OrdenTrabajoJpa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idOrden;

	private String codigo;

	@ManyToOne
	@JoinColumn(name = "cliente")
	private ClienteJpa cliente;

	@ManyToOne
	@JoinColumn(name = "tecnico")
	private TecnicoJpa tecnico;

	@ManyToOne
	@JoinColumn(name = "tiposervicio")
	private TipoServicioJpa tipoServicio;

	@ManyToOne
	@JoinColumn(name = "equipo")
	private EquipoJpa equipo;

	private LocalDate fechaSolicitud;
	private LocalDate fechaAgendada;
	private LocalTime horaAgendada;
	private String estado;

	@Column(name = "descripciontrabajo")
	private String descripcionTrabajo;

	private String observaciones;
	
}
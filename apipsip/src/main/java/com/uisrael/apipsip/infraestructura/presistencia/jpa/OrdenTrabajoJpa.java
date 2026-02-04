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
	    @Column(name = "idorden")
	    private int idOrden;

	    private String codigo;

	    @ManyToOne
	    @JoinColumn(name = "idcliente")
	    private ClienteJpa cliente;

	    @ManyToOne
	    @JoinColumn(name = "idtecnico")
	    private TecnicoJpa tecnico;

	    @ManyToOne
	    @JoinColumn(name = "idtipo")
	    private TipoServicioJpa tipoServicio;

	    @ManyToOne
	    @JoinColumn(name = "idequipo")
	    private EquipoJpa equipo;

	    private LocalDate fechaSolicitud;
	    private LocalDate fechaAgendada;
	    private LocalTime horaAgendada;
	    private String estado;
	    private String descripcionTrabajo;
	    private String observaciones;
	}
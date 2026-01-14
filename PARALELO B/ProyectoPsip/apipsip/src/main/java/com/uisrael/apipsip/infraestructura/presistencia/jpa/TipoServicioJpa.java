package com.uisrael.apipsip.infraestructura.presistencia.jpa;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tipo_servicio")
public class TipoServicioJpa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipo;

	private String nombre;
	private String descripcion;
}
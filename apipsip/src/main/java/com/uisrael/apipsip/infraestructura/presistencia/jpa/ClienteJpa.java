package com.uisrael.apipsip.infraestructura.presistencia.jpa;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "cliente")


public class ClienteJpa implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int idCliente;
	@Column(name = "cli_nombre", length =  80)
	private  String nombre;
	private  String email; 
	private String telefono;
	private  String direccion;
	private boolean estado;
	
	
	

}

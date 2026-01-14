package com.uisrael.apipsip.dominio.repositorios;

import java.util.List;
import java.util.Optional;

import com.uisrael.apipsip.dominio.entidades.MensajeCliente;

public interface IMensajeClienteRepositorio {
    MensajeCliente guardar(MensajeCliente mensajecliente);
    Optional<MensajeCliente> buscarPorId(Long id);
    List<MensajeCliente> listarTodos();
    void eliminar(Long id);
}
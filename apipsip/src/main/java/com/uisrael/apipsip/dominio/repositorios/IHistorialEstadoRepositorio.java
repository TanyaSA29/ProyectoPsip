package com.uisrael.apipsip.dominio.repositorios;

import java.util.List;
import java.util.Optional;

import com.uisrael.apipsip.dominio.entidades.HistorialEstado;

public interface IHistorialEstadoRepositorio {
    HistorialEstado guardar(HistorialEstado historialestado);
    Optional<HistorialEstado> buscarPorId(Long id);
    List<HistorialEstado> listarTodos();
    void eliminar(Long id);
}
package com.uisrael.apipsip.dominio.usecase.impl;

import com.uisrael.apipsip.dominio.entidades.HistorialEstado;
import com.uisrael.apipsip.dominio.repositorios.IHistorialEstadoRepositorio;
import com.uisrael.apipsip.dominio.usecase.IHistorialEstadoUseCase;

public class HistorialEstadoUseCaseImpl implements IHistorialEstadoUseCase {

    private final IHistorialEstadoRepositorio repositorio;

    public HistorialEstadoUseCaseImpl(IHistorialEstadoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public HistorialEstado guardar(HistorialEstado historial) {
        return repositorio.guardar(historial);
    }

    @Override
    public java.util.Optional<HistorialEstado> buscarPorId(Long id) {
        return repositorio.buscarPorId(id);
    }

    @Override
    public java.util.List<HistorialEstado> listarTodos() {
        return repositorio.listarTodos();
    }

    @Override
    public void eliminar(Long id) {
        repositorio.eliminar(id);
    }
}